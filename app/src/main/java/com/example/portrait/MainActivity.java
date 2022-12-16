package com.example.portrait;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.transition.Slide;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout mDotLayout;

    // declare horizontal slider stuff
    private ViewPager mSlideViewPager;
    public SliderAdapter sliderAdapter;
    private TextView[] mDots;

    public static Candidate[] candidates = new Candidate[2];
    public static String [] names, titles;
    public static int [][] pictures, professional_infos, nerd_infos, human_infos;

    public static int candindex;
    public static int candcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // By default, program will start showing candidate#(candindex)
        candindex = 0;

        // Manually populate static database (will be automated later)
        String[] names = {
                "Shohan Mozid Rahman",
                "Julius Brian Halder"
        };

        String[] titles = {
                "Machine Learning Engineer, Software Developer, Composer",
                "Game Developer, Unit Tester"
        };

        String[][] professional_infos = {
                {
                    "ML Engineer, Alter Sense Ltd. (internship, Summer 2022)",
                    "BSc in CSE (Minor in AI), Independent University Bangladesh (Class of 2022)",
                    "Skills: Python Programming, Computer Vision Tools",
                    "Interests: Data-Driven innovations",
                },
                {
                    "Game Developer, Red Thorn Interactive",
                    "BSc in CSE, Independent University Bangladesh",
                    "Julius Skills:",
                    "Julius Interests:"
                }
        };

        String[][] nerd_infos = {
                {
                        "Internship report:'Using Computer Vision to enhance Object Detection in Industrial Environments' ",
                        "Shohan Current Research Area",
                        "Shohan Future Academic Research",
                        "Shohan Long term research plans"
                },
                {
                        "Julius Past Literature",
                        "Julius Current Academic Endeavors",
                        "Julius Future Academic Endeavors",
                        "Julius long term academic plans"
                }
        };


//        String[][] human_infos = new String[2][4];
        String [][] human_infos = {
                {   "Article: 'The hunt for interdisciplinary knowledge' (tags: philosophy)",
                    "Article: 'Using AI to bring the gap between man and god' (tags: philosophy)",
                    "Article: 'Majhpoth - just another prog rock band'",
                    "Article: 'Should musical bands be treated like tangible products or journal entries?' "},
                {   "Julius human info 1",
                    "Julius human info 2",
                    "Julius human info 3",
                    "Julius human info 4"}
        };

        int [][] pictures = new int[2][4];
        for (int i =0; i<2; i++) {
            for (int j=0; j<4; j++){
                pictures[i][j] = R.drawable.julius_professional;
            }
        }



//                { R.drawable.shohan, R.drawable.shohan_professional, R.drawable.shohan_nerd, R.drawable.shohan_human},
//                { R.drawable.julius_professional, R.drawable.julius_professional, R.drawable.julius_nerd, R.drawable.julius_human }
//        };

        candcount = 2;



        // Now that the database tables are populated, instantiate the candidates.
        for (int i = 0; i < candcount; i++) {
            candidates[i] = new Candidate(names[i], titles[i], professional_infos[i], nerd_infos[i], human_infos[i]);
        }

        // instantiate layout stuff
        mDotLayout = (LinearLayout) findViewById(R.id.dotsLayout);

        // instantiate horizontal slider stuff
        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
        sliderAdapter = new SliderAdapter(this);
        mSlideViewPager.setAdapter(sliderAdapter);

    }
}