package com.yashc.crops;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.snackbar.Snackbar;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.sufficientlysecure.htmltextview.HtmlTextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private HtmlTextView mMainContentView;
    private ProgressDialog progressDialog;
    private View mainLayout;

    private static final String TAG = "MainActivity";
    private Spinner mYearSpinner;
    private Snackbar snackbar;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLayout = findViewById(R.id.main_layout);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        mMainContentView = findViewById(R.id.main_content);
        mYearSpinner = findViewById(R.id.year_spinner);
        networkTest();
    }

    private void networkTest() {
        if(!isNetworkConnected()) {
            snackbar = Snackbar
                    .make(mainLayout, "No Internet. Retry?", Snackbar.LENGTH_INDEFINITE)
                    .setAction("OK", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (!isNetworkConnected())
                                networkTest();
                            else {
                                Snackbar.make(mainLayout, "Connection restored!", Snackbar.LENGTH_SHORT).setActionTextColor(Color.GREEN).show();
                                init();
                            }
                        }
                    });

            snackbar.show();
        }
        else{
            if(snackbar != null) {
                snackbar.dismiss();
            }
            init();
        }
    }

    private void init(){
        mYearSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                networkTest();
                progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setMessage("Loading");
                if(isNetworkConnected())
                    progressDialog.show();
                switch (i) {
                    case 0: {
                        loadYearUrl("105083");
                        break;
                    }
                    case 1: {
                        loadYearUrl("126120");
                        break;
                    }

                    case 2: {
                        loadYearUrl("148215");
                        break;
                    }

                    case 3: {
                        loadYearUrl("158478");
                        break;
                    }

                    case 4: {
                        loadYearUrl("176824");
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


    private void loadYearUrl(final String url) {
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Document document = Jsoup.connect("http://pib.nic.in/newsite/PrintRelease.aspx?relid=" + url).get();
                    document.getElementsByTag("style").remove();
                    document.select("[style]").removeAttr("style");
                    Elements ele = document.select("div#condiv");
                    final String html = ele.toString().replaceAll("\n", "").replaceAll("<br>  <br>", "<br>");
                    Log.d(TAG, "run: " + html);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mMainContentView.setHtml(html);
                            progressDialog.cancel();
                        }
                    });

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.action_crop_production) {
            startActivity(new Intent(MainActivity.this, CropProduction.class));
        }

        return true;
    }
}
