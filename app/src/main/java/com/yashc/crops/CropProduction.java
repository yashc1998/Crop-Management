package com.yashc.crops;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NavUtils;

import java.util.ArrayList;

public class CropProduction extends AppCompatActivity {

    private ArrayList<Crop> cropArrayList = new ArrayList<>();
    private Spinner spinner;
    private Toolbar toolbar;
    private TextView cropProdText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_production);
        SetupCrops();

        toolbar = findViewById(R.id.second_toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cropProdText = findViewById(R.id.crop_prod_content);

        spinner = findViewById(R.id.crops_spinner);
        String[] arraySpinner = new String[cropArrayList.size()];

        int i = 0;
        for (Crop crop : cropArrayList) {
            arraySpinner[i] = crop.getName();
            i++;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                cropProdText.setText(cropArrayList.get(i).getGrowMethod());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private void SetupCrops() {
        cropArrayList.add(new Crop("Potatoes", "Growing potatoes (or anything) in straw bales is an easy, inexpensive and eco-friendly way to get your garden started. When done correctly, it also produces a magnificent yield. You don't need fresh bales. Because you want straw to be aged for this method anyway, you can usually get older bales that have been exposed to the elements and that farmers are desperate to get rid of.\n" +
                "\n" +
                "Obtain straw bales. A good rule of thumb is two to three plants per bale, so keep that in mind when determining how many bales you will need.\n" +
                "Place your bales. They will need at least six hours of sunlight a day, and once they are wet, they will be too heavy to move. Once you have decided where to place your bales, lay some newspaper or weed barrier on the ground to prevent weeds from growing up through your bales.\n" +
                "Condition your bales. If your bale is at least a year old, you can skip this step. If your bale is new, wet it down every day for about 2 weeks. You will want the bales to remain constantly moist, so water as needed each day. On days three through nine, add a nitrogen fertilizer once a day. You should water bales well enough that they are moist but not so much that water and fertilizer go running out. Conditioning the bale helps the bales begin to decompose. At the beginning of this process you may notice the straw bales heating up. Before planting, however, use a thermometer or your hand to make sure that the inside of the bale is below body temperature.\n" +
                "Plant your seed potatoes. Cut potatoes into chunks with at least one “eye” on each piece. Let pieces set for 24 hours so that the cut sides may dry before planting. Place cuttings six inches into the bale. Water regularly. You may also fertilize bales with 10-10-10 fertilizer every three weeks or so.\n" +
                "Harvest. When plants begin to wither and die, this is a sign that your potatoes are ready to harvest. You can cut the strings on the bales and allow the bales to fall apart. You will be able to harvest your potatoes without any digging."));
        cropArrayList.add(new Crop("Rice", "Seed quality and selection\n" +
                "seed-selectionSeed is a living product that must be grown, harvested, and processed correctly in order to realize the yield potential of any rice variety. Good quality seed can increase yields by 5-20%. Using good seed leads to lower seeding rates, higher crop emergence, reduced replanting, more uniform plant stands, and more vigorous early crop growth. Vigorous growth in early stages reduces weed problems and increases crop resistance to insect pests and diseases. All of these factors contribute to higher yields and more productive rice farms.\n" +
                "\n" +
                "Good seed is pure (of the chosen variety), full and uniform in size, viable (more than 80% germination with good seedling vigor), and free of weed seeds, seed-borne diseases, pathogens, insects, or other matter.\n" +
                "\n" +
                "Choosing seed of a suitable variety of rice that suits the environment it will be grown in and ensuring the seed choosen of that variety is of the highest possible quality is the essential first step in rice production.\n" +
                "\n" +
                "Land preparation\n" +
                "Before rice can be planted, the soil should be in the best physical condition for crop growth and the soil surface is level. Land preparation involves plowing and harrowing to ‘till’ or dig-up, mix and level the soil.\n" +
                "\n" +
                "Tillage allows the seeds to be planted at the right depth, and also helps with weed control. Farmers can till the land themselves using hoes and other equipment or they can be assisted by draft animals, such as buffalo, or tractors and other machinery.\n" +
                "\n" +
                "Next, the land is leveled to reduce the amount of water wasted by uneven pockets of too-deep water or exposed soil. Effective land leveling allows the seedlings to become established more easily, reduces the amount of effort required to manage the crop, and increases both grain quality and yields.\n" +
                "\n" +
                "Crop establishment\n" +
                "transplanting\n" +
                "The two main practices of establishing rice plants are transplanting and direct seeding.\n" +
                "\n" +
                "Transplanting  is the most popular plant establishment technique across Asia. Pre- germinated seedlings are transferred from a seedbed to the wet field. It requires less seed and is an effective method to control weeds, but requires more labor. Seedlings may be transplanted by either machine or hand.\n" +
                "\n" +
                "Direct seeding involves broadcasting dry seed or pre-germinated seeds and seedlings by hand or planting them by machine. In rainfed and deepwater ecosystems, dry seed is manually broadcast onto the soil surface and then incorporated either by ploughing or by harrowing while the soil is still dry. In irrigated areas, seed is normally pre- germinated prior to broadcasting.\n" +
                "\n" +
                "Water use and management\n" +
                "Cultivated rice is extremely sensitive to water shortages. To ensure sufficient water, most rice farmers aim to maintain flooded conditions in their field. This is especially true for lowland rice. Good water management in lowland rice focuses on practices that conserve water while ensuring sufficient water for the crop.\n" +
                "\n" +
                "In rainfed environments when optimal amounts of water may not be available for rice production, a suite of options are available to help farmers cope with different degrees and forms of water scarcity. It includes sound land preparation and pre-planting activities followed by techniques such as saturated soil culture, alternate wetting and drying, raised beds, mulching, and use of aerobic rice that can cope with dryer conditions.\n" +
                "\n" +
                "Nutrient management\n" +
                "nutrient-managementAt each growth stage, the rice plant has specific nutrient needs. This makes nutrient management a critical aspect of rice farming.\n" +
                "\n" +
                "The unique properties of flooded soils make rice different from any other crop. Because of prolonged flooding in rice fields, farmers are able to conserve soil organic matter and also receive free input of nitrogen from biological sources, which means they need little or no nitrogen fertilizer to retain yields. However, farmers can tailor nutrient management to the specific conditions of their field to increase yields.\n" +
                "\n" +
                "Crop health\n" +
                "The rice plant has a wide array of ‘enemies’ in the field. These include rodents, harmful insects, viruses, diseases, and weeds. Farmers manage weeds through water management and land preparation, by hand weeding, and in some cases herbcide application. Understanding the interactions among pests, natural enemies, host plants, other organisms, and the environment allows farmers to determine what if any pest management may be necessary.\n" +
                "\n" +
                "Avoiding conditions that allow pests to adapt and thrive in a particular ecosystem helps to identify weak links in the pests' life cycle and therefore what factors can be manipulated to manage them. Retaining natural ecosystems such that predators and natural enemies of pests and diseases are kept in abundance can also help keep pest numbers down.\n" +
                "\n" +
                "Harvest\n" +
                "harvest\n" +
                "\n" +
                "Harvesting is the process of collecting the mature rice crop from the field. Depending on the variety, a rice crop usually reaches maturity at around 105–150 days after crop establishment. Harvesting activities include cutting, stacking, handling, threshing, cleaning, and hauling. Good harvesting methods help maximize grain yield and minimize grain damage and deterioration.\n" +
                "\n" +
                "Harvesting can be done manually or mechanically:\n" +
                "\n" +
                "Manual harvesting is common across Asia It involves cutting the rice crop with simple hand tools like sickles and knives. Manual harvesting is very effective when a crop has lodged or fallen over, however it is labor intensive. Manual harvesting requires 40 to 80 hours per hectare and it takes additional labor to manually collect and haul the harvested crop."));

        cropArrayList.add(new Crop("Wheat", "1. Choose a good location\n" +
                "The very important part of wheat farming is selection of an appropriate place.  You must look for a place that has fertile soil for wheat farming. Soil with a loam texture, good structure and moderate water holding capacity are some factors that you must consider to grow wheat.\n" +
                "\n" +
                "2. Soil Preparation\n" +
                "The soil must be properly prepared before starting the wheat farming. For this you can plough the soil either with disc or mould board plough. Then arrange the soil by giving one deep plough, followed by 2 to 3 light ploughing and planking. Now add natural fertilizers to it. For commercial wheat farming, an average of 50 kg Nitrogen, 25 kg Phosphorus and 12 kg Potash is sufficient in one acre of land. Add more organic contents while preparing the soil.\n" +
                "\n" +
                "3. Weather requirements\n" +
                "Wheat plants can be grown and planted in a wide range of agro-climatic conditions. The plants have high flexibility and hence can be grown in the tropical, sub-tropical zones and temperate zone. The most suitable climate for wheat farming is moist and cool weather.  The plants can easily survive in temperature between 3.5 °C and 35 °C, but the best temperature for wheat farming is between 21 °C and 26 °C.\n" +
                "\n" +
                "4. Pick a variety\n" +
                "Wheat is available in many different types and varieties all over the world. Some popular wheat varieties available and cultivated in India are as follows:\n" +
                "\n" +
                "DBW 17,\n" +
                "\n" +
                "HD 2851,\n" +
                "\n" +
                "HD 2932,\n" +
                "\n" +
                "PBW 1 Zn,\n" +
                "\n" +
                "Unnat PBW 343,\n" +
                "\n" +
                "PDW 233,\n" +
                "\n" +
                "WHD 943,\n" +
                "\n" +
                "TL 2908, etc\n" +
                "\n" +
                "Make sure you choose the right variety of wheat according to the climatic conditions of your region. You can also consult an experienced farmer in your area to help you choose the right wheat variety.\n" +
                "\n" +
                "Seeding\n" +
                "Wheat seeds are easily available in the market. While purchasing the seeds, make sure it is of good quality, high yielding and disease free. Usually 40 to 50 kg seeds are required in one acre of land. Although exact amount of seeds required depends on the variety and sowing method.\n" +
                "\n" +
                "\n" +
                "Planting\n" +
                "The wheat seeds must be sown in about 4 to 5 cm inside the soil. Always put the seeds in rows and maintain a spacing of 20-22.5 cm between the rows. Planting or sowing the seeds in the right time is also important as delayed sowing can cause a gradual decline in the production. In India, it is generally sown in the end of October and early November.\n" +
                "\n" +
                "Also see that the wheat seeds is properly graded and thoroughly cleaned before sowing. Here you can apply fungicide for treating the seeds.\n" +
                "\n" +
                "Caring\n" +
                "The wheat plants are quite tough and strong. They generally do well in favorable climate conditions and require less care. And if you take some extra care, it will be good and will ensure maximum production.\n" +
                "\n" +
                "Fertilization – you don’t need to add more fertilizers if you had previously added it while preparing the soil.\n" +
                "\n" +
                "Watering – good and proper irrigation is required for wheat farming. First irrigation must be done after 20 to 25 days after planting the seeds. Then, additional 4 to 5 irrigation should be done after every 20 days.\n" +
                "\n" +
                "Weeding: Most of the weeds in your field can be controlled while preparing the soil. Hence make sure you remove the weeds properly. For additional weeding you can use wide  range of chemicals available in the market.\n" +
                "\n" +
                "Pest and disease control \n" +
                "The wheat plants are susceptible to many pests and diseases like aphids and termites. While some of the common diseases in wheat plants are brown rust, powdery mildew, Flag smut, etc. To control the pests or diseases, you can use good quality pesticides or insecticides. You can also consult with the local agriculture extension office or an expert who can give you proper advice on it.\n" +
                "\n" +
                "\n" +
                "Harvesting\n" +
                "Harvesting starts when the leaves and stem turn yellow in color and become fairly dry. Remember that the wheat must be harvested before it is dead ripe to avoid loss in yield. Thus, timely harvesting is necessary for good quality as well as maximum production of wheat. When the moisture content in the wheat reaches to about 25 - 30%, then the wheat is ready to be harvested. Combine harvester are available in the market for harvesting, threshing and winnowing of wheat crop in a single operation."));

        cropArrayList.add(new Crop("Maize", "Loaded with healthy antioxidants and fiber, corn makes a tasty addition to a backyard garden. Corn's scientific name is Zea mays, but lovers of this starchy vegetable also refer to it as maize. This veggie comes in a host of colors including purple and black, but yellow is its most popular shade. Plant maize in late spring, around the first of May, for a delicious, late summer crop. Grow ornamental, sweet or super-sweet corn from seed kernels and enjoy one of America's favorite food staples.\n" +
                "\n" +
                "1\n" +
                "Till the soil with a rototiller or a hoe to a depth of 6 inches. Test the soil to verify that the pH level is between 6 to 6.5. Correct the soil, if necessary with powdered lime. You can find lime at most home improvement stores.\n" +
                "\n" +
                "2\n" +
                "Fertilize the soil with 12-12-12 fertilizer, 3 pounds for every 100 feet of garden. Add a second layer of fertilizer later in the growing season, when plants are 12 inches tall.\n" +
                "\n" +
                "3\n" +
                "Create even rows in the garden using a hoe. Space rows 30 to 36 inches apart. Pile each row into a narrow hill. Corn needs pollination to produce its vegetables, so create several rows rather than one long one. A set of short rows produces more corn than one or two rows.\n" +
                "\n" +
                "4\n" +
                "Poke the top of the hill with your finger, creating a hole from 1 to 1 1/2 inches deep. Drop in one or two kernels of corn. Cover the top of the hole loosely with soil. Do not pack the soil. Move down the hill approximately 8 inches and poke another hole into the hill. Continue to add corn until all the corn is planted.\n" +
                "\n" +
                "5\n" +
                "Water the corn the day after planting the seeds.\n" +
                "\n" +
                "Things You Will Need\n" +
                "Hoe or rototiller\n" +
                "Lime\n" +
                "Manure spreader\n" +
                "12-12-12 fertilizer\n" +
                "Seed corn\n" +
                "Water\n" +
                "Tip\n" +
                "Hoe the corn plants regularly to control weeds.\n" +
                "Warning\n" +
                "Corn needs 1 to 1 1/2 inches of water a week. Water corn plants regularly during dry periods."));

        cropArrayList.add(new Crop("Mustard", "Mustard is cool-season leaf crop. Sow mustard as early as 4 to 6 weeks before the average last frost date in spring. Sow succession crops every 4 to 6 weeks. Mustard requires 30 to 40 days to reach harvest. Plant crops so that they come to harvest before temperature average greater than 75°F. Sow mustard in autumn or early winter in mild winter regions.\n" +
                "\n" +
                "Description. Mustard is a hardy leaf vegetable with a rosette of large light or dark green curly leaves that grow to 3 feet tall. Leaves and leaf stalks are eaten and have a peppery flavor. The seeds can be ground and used as a condiment.\n" +
                "\n" +
                "Yield. Plant 6 to 10 mustard plants per household member.\n" +
                "\n" +
                "Site. Grow mustard in full sun or partial shade. Plant mustard in well-worked, well-drained soil rich in organic matter. Add aged compost to planting beds before planting. Mustard prefers a soil pH of 5.5 to 6.8.\n" +
                "\n" +
                "Planting time. Sow mustard as early as 4 to 6 weeks before the average last frost date in spring. Sow succession crops every 4 to 6 weeks. Mustard requires 30 to 40 days to reach harvest. Plant crops so that they come to harvest before temperature average greater than 75°F. Sow mustard in autumn or early winter in mild winter regions. Seeds may be slow to germinate if the soil is too coo, 40°F or less. Mustard grown in hot weather or long days will bolt and go to seed.\n" +
                "\n" +
                "Planting and spacing. Sow mustard seed ½ inch deep; when seedlings are large enough to handle thin them from 4 to 8 inches apart; space rows 12 to 24 inches apart.\n" +
                "\n" +
                "Water and feeding. Keep soil evenly moist to keep leaves growing quickly. Do not allow the soil to dry out. Add aged compost to planting beds before sowing. Side dress plants with aged compost at midseason.\n" +
                "\n" +
                "Companion plants. English peas, snap peas.\n" +
                "\n" +
                "Care. Keep planting beds weed free. Pull mustard from the garden as soon as it goes to seed to avoid prolific self seeding.\n" +
                "\n" +
                "Container growing. Mustard can easily be grown in a container. Broadcast seeds over the soil surface and cover lightly with soil. Thinnings can be eaten.\n" +
                "\n" +
                "Pests. Mustard can be attacked by flea beetles and aphids. Wash these pests away with a blast of water.\n" +
                "\n" +
                "Diseases. Mustard is susceptible to white rust. Remove leaves that have white rust. Water plants at the base of the stem keeping moisture off the leaves.\n" +
                "\n" +
                "Harvest. Pick individual leaves when they are young and tender, 3 to 4 inches long, or cut and use the entire plant. Complete the harvest before the weather grows hot; hot weather will cause leaves to become tough and strong flavored. Complete the harvest before the plant goes to seed.\n" +
                "\n" +
                "Varieties. Curled: Fordhook Fancy (40 days); Red Giant (23 days); Green Wave (45 days); Southern Giant Curled (40 days). Plain Leaf: Florida Broad Leaf (43-50 days); Tendergreen (34-40 days). Oriental Mustard Cabbage-green stalks: Chinese Pac Choi (60 days); Choi Sum (60 days); Dai Gai Choy (65 days). Oriental Mustard Cabbage-white stalks: Bok Choi (45-60 days); Chinese Flat Cabbage (40 days); Green-In-Snow (45 days); Joi-Choi (45-50 days).\n" +
                "\n" +
                "Storing and preserving. Mustard will keep in the vegetable compartment of the refrigerator for 2 to 3 weeks. Mustard leaves can be frozen or dried. Mustard seeds can be sprouted.\n" +
                "\n" +
                "Common name. Mustard, Chinese mustard, leaf mustard, spinach greens\n" +
                "\n" +
                "Botanical name. Brassica juncea\n" +
                "\n" +
                "Origin. Asia"));

        cropArrayList.add(new Crop("Pumpkin", "PLANTING\n" +
                "\n" +
                "SELECTING A SITE\n" +
                "Pick a site with full sun (to light shade) and lots of space for sprawling vines. Vine varieties need 50 to 100 square feet per hill.\n" +
                "However, if your garden space is limited, no worries! Plant pumpkins at the edge of the garden and direct vine growth across the lawn or sidewalk. The vines will only be bothersome for a few weeks. You can also grow pumpkins in big 5 to 10 gallon buckets! Or, try miniature varieties.\n" +
                "Pumpkins are big, greedy feeders. They prefer very rich soil that is well-drained and not too soggy. Mix lots of compost and aged manure into the planting site before you sow seeds or transplant. Learn more about soil amendments and preparing soil for planting.\n" +
                "\n" +
                "PLANTING BY SEED\n" +
                "Pumpkins do best when the seeds are planted directly in the ground.\n" +
                "If your growing season is very short, seed indoors in peat pots about 2 to 4 weeks before last spring frost. Be sure to harden off before transplanting.\n" +
                "Wait until the plant soil is 70ºF or more before sowing seeds. Optimum soil temperature is 95ºF. Pumpkins are very sensitive to the cold.\n" +
                "Plant seeds in rows or “pumpkin hills,” which are the size of small pitcher mounds. With hills, the soil will warm more quickly and the seeds will germinate faster. This also helps with drainage and pest control.\n" +
                "Prepare the hills in advance with an abundance of old manure dug deep into the ground (12 to 15 inches). If you don’t have manure, loosen the soil and mix in a 2- to 4-inch layer of compost\n" +
                "Plant the seeds 1 inch deep into the hills (4 to 5 seeds per hill). Space hills 4 to 8 feet apart. \n" +
                "Your plants should germinate in less than a week with the right soil temperature (70 degrees F) and emerge in 5 to 10 days. \n" +
                "When the plants are 2 to 3 inches tall, thin to 2 to 3 plants per hill by snipping off unwanted plants without disturbing the roots of the remaining ones. \n" +
                "In rows, sow seeds 6 to 12 inches apart in rows 6 to 10 feet apart. Snip off plants to thin to one plant every 18 to 36 inches.\n" +
                "\n" +
                "CARE\n" +
                "Use row covers to protect plants early in the season and to prevent insect problems. However, remember to remove covers before flowering to allow pollination by insects!\n" +
                "Pumpkins are very thirsty plants and need lots of water. Water one inch per week. Water deeply, especially during fruit set.\n" +
                "When watering: Try to keep foliage and fruit dry unless it’s a sunny day. Dampness will make rot and other diseases more likely.\n" +
                "Add mulch around your pumpkins to keep in moisture, suppress weeds, and discourage pests.\n" +
                "Remember that pumpkins are tender from planting to harvest. Control weeds with mulch. Do not overcultivate, or their very shallow roots may be damaged.\n" +
                "Most small vine varieties can be trained up a trellis.\n" +
                "Larger varieties can be trained upward on a trellis, too—though it is an engineering challenge to support the fruit—usually with netting or old stockings.\n" +
                "If your first flowers aren’t forming fruits, that’s normal. Both male and female blossoms need to open. Be patient.\n" +
                "Bees are essential for pollination, so be mindful when using insecticides to kill pests. If you must use, apply only in the late afternoon or early evening, when blossoms are closed for the day. To attract more bees, try placing a bee house in your garden.\n" +
                "Pumpkin vines, though obstinate, are very delicate. Take care not to damage vines, which reduces the quality of fruit.\n" +
                "\n" +
                "PUMP UP YOUR PUMPKINS!\n" +
                "Pumpkins are HEAVY feeders. Regular treatments of manure or compost mixed with water will sustain good growth.\n" +
                "Fertilize on a regular basis. Use a high nitrogen formula in early plant growth. Fertilize when plants are about one foot tall, just before vines begin to run. Switch over to a fertilizer high in phosphorous just before the blooming period.\n" +
                "Pinch off the fuzzy ends of each vine after a few pumpkins have formed. This will stop vine growth so that the plant’s energies are focused on the fruit.\n" +
                "Pruning the vines may help with space, as well as allow the plant’s energy to be concentrated on the remaining vines and fruit.\n" +
                "Gardeners who are looking for a “prize for size” pumpkin might select the two or three prime candidates and remove all other fruit and vines.\n" +
                "As the fruit develops, they should be turned (with great care not to hurt the vine or stem) to encourage an even shape.\n" +
                "Place a thin board or heavy cardboard under ripening melons and pumpkins to avoid decay and insect damage.\n" +
                "\n" +
                "Spacing for Pumpkins\n" +
                "\n" +
                "PESTS/DISEASES\n" +
                "Squash bugs and cucumber beetles are common, especially later in summer. Contact your local Cooperative Extension for potential controls.\n" +
                "Aphids\n" +
                "Squash Vine Borer\n" +
                "Powdery Mildew\n" +
                "Anthracnose\n" +
                "Poor light, too much fertilizer, poor weather at bloom time, and reduced pollinating insect activity can negatively impact fruit set.\n" +
                "\n" +
                "HARVEST/STORAGE\n" +
                "Your best bet is to harvest pumpkins when they are mature. They will keep best this way. Do not pick pumpkins off the vine because they have reached your desired size. If you want small pumpkins, buy a small variety.\n" +
                "A pumpkin is ripening when its skin turns a deep, solid color (orange for most varieties).\n" +
                "When you thump the pumpkin with a finger, the rind will feel hard and it will sound hollow. Press your nail into the pumpkin’s skin; if it resists puncture, it is ripe.\n" +
                "Harvest pumpkins and winter squashes on a dry day after the plants have died back and the skins are hard.\n" +
                "To slow decay, leave an inch or two of stem on pumpkins and winter squash when harvesting them. \n" +
                "To harvest the pumpkin, cut the fruit off the vine carefully with a sharp knife or pruners; do not tear. Be sure not to cut too close to the pumpkin; a liberal amount of stem (3 to 4 inches) will increase the pumpkin’s keeping time.\n" +
                "Handle pumpkins very gently or they may bruise.\n" +
                "Pumpkins should be cured in the sun for about a week to toughen the skin and then stored in a cool, dry bedroom, cellar, or root cellar—anywhere around 55ºF.\n" +
                "If you get a lot of vines and flowers, but no pumpkins, you need more bees in your garden to pollinate the flowers. Grow some colorful flowers next to your pumpkin patch this year and you may get more bees and butterflies!\n" +
                "The yellowish pumpkins will soon come handy to give the cows. They help out the fall feed, and if there is anything better for cows in milk we should like to know it.\n" +
                "If you’re saving seeds, they should last for 6 years."));
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

