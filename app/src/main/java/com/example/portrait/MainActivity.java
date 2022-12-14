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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Manually populate static database
        String[] names = new String[2];
        names[0] = "Shohan Mozid Rahman";
        names[1] = "Julius Brian Halder";

        String[] titles = new String [2];
        titles[0] = "Machine Learning Engineer, Software Developer";
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
        nerd_infos[0][0] = "'Using Computer Vision to enhance Object Detection in Industrial Environments' ";
        nerd_infos[0][1] = "Software Development";
        nerd_infos[0][2] = "Python Programming";
        nerd_infos[0][3] = "Computer Vision Engineering";

        nerd_infos[1][0] = "Professional Info 1";
        nerd_infos[1][1] = "Professional Info 2";
        nerd_infos[1][2] = "Professional Info 3";
        nerd_infos[1][3] = "Professional Info 4";

        String[][] human_infos = new String[2][4];
        nerd_infos[0][0] = "'Using Computer Vision to enhance Object Detection in Industrial Environments' ";
        nerd_infos[0][1] = "Software Development";
        nerd_infos[0][2] = "Python Programming";
        nerd_infos[0][3] = "Computer Vision Engineering";

        nerd_infos[1][0] = "Professional Info 1";
        nerd_infos[1][1] = "Professional Info 2";
        nerd_infos[1][2] = "Professional Info 3";
        nerd_infos[1][3] = "Professional Info 4";

        Candidate[] candidates = new Candidate[2];

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