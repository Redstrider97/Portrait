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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        candindex = 0;

        // Manually populate static database
        String[] names = new String[2];
        names[0] = "Shohan Mozid Rahman";
        names[1] = "Julius Brian Halder";

        String[] titles = new String [2];
        titles[0] = "Machine Learning Engineer, Software Developer, Composer";
        titles[1] = "Game Developer, Unit Tester";

        String[][] professional_infos = new String[2][4];
        professional_infos[0][0] = "ML Engineer, Alter Sense Ltd. (internship, Summer 2022)";
        professional_infos[0][1] = "BSc in CSE (Minor in AI), Independent University Bangladesh (Class of 2022)";
        professional_infos[0][2] = "Skills: Python Programming, Computer Vision Tools";
        professional_infos[0][3] = "Interests: Data-Driven innovations";

        professional_infos[1][0] = "Game Developer, Red Thorn Interactive";
        professional_infos[1][1] = "BSc in CSE, Independent University Bangladesh";
        professional_infos[1][2] = "Julius Skills:";
        professional_infos[1][3] = "Julius Interests:";

        String[][] nerd_infos = new String[2][4];
        nerd_infos[0][0] = "Internship report:'Using Computer Vision to enhance Object Detection in Industrial Environments' ";
        nerd_infos[0][1] = "Shohan Current Research Area";
        nerd_infos[0][2] = "Shohan Future Academic Research";
        nerd_infos[0][3] = "Shohan Long term research plans";

        nerd_infos[1][0] = "Julius Past Literature";
        nerd_infos[1][1] = "Julius Current Academic Endeavors";
        nerd_infos[1][2] = "Julius Future Academic Endeavors";
        nerd_infos[1][3] = "Julius long term academic plans";

        String[][] human_infos = new String[2][4];
        human_infos[0][0] = "Article: 'The hunt for interdisciplinary knowledge' (tags: philosophy)";
        human_infos[0][1] = "Article: 'Using AI to bring the gap between man and god' (tags: philosophy)";
        human_infos[0][2] = "Article: 'Majhpoth - just another prog rock band'";
        human_infos[0][3] = "Article: 'Should musical bands be treated like tangible products or journal entries?' ";

        human_infos[1][0] = "Julius human info 1";
        human_infos[1][1] = "Julius human info 2";
        human_infos[1][2] = "Julius human info 3";
        human_infos[1][3] = "Julius human info 4";

        int [][] pictures = new int [2][4];
        pictures[0][0] = R.drawable.shohan;
        pictures[0][1] = R.drawable.shohan_professional;
        pictures[0][2] = R.drawable.shohan_human;
        pictures[0][3] = R.drawable.shohan_nerd;

        pictures[1][0] = R.drawable.julius_professional;
        pictures[1][1] = R.drawable.julius_professional;
        pictures[1][2] = R.drawable.julius_nerd;
        pictures[1][3] = R.drawable.julius_human;



        //Instantiate the two candidates
        for (int i = 0; i < 2; i++) {
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