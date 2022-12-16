package com.example.portrait;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.QuickContactBadge;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import org.w3c.dom.Text;

public class SliderAdapter extends PagerAdapter {

    // Manually add info about two Candidates

    Context context;
    LayoutInflater layoutInflater;

    // retrieve Candidate info
//    Candidate [] candidates = MainActivity.candidates;
//    String [] names = MainActivity.names;

    public SliderAdapter(Context context){
        this.context = context;
    }

    // Arrays

    public String[] slide_heading = {
            "Welcome to my virtual resume!",
            "YOU ARE A RECRUITER.",
            "YOU ARE A RESEARCHER.",
            "YOU ARE A HUMAN."
    };

    public static int[] slide_images = {
            R.drawable.shohan,
            R.drawable.recruiter,
            R.drawable.researcher,
            R.drawable.human
    };

//    public int [][] pictures = {
//            { R.drawable.shohan, R.drawable.shohan_professional, R.drawable.shohan_nerd, R.drawable.shohan_human},
//            { R.drawable.julius_professional, R.drawable.julius_professional, R.drawable.julius_nerd, R.drawable.julius_human }
//    };

//    public static int [][] pictures = MainActivity.pictures;

    public String[] slide_descs = {
            "Swipe left until you find a label that best describes you.\n\n or click the picture to toggle between Candidates.",
            "You are ONLY interested in his:",
            "You want to learn more about his:",
            "You are curious about:"
    };

    public String[] recruiter_checkboxes = {
            "Educational Background",
            "Professional Background",
            "Skills",
            "Interests"
    };

    public String[] researcher_checkboxes = {
            "Past publications",
            "Current areas of research",
            "Future areas of research",
            "Academic plans in the long run"
    };

    public String[] human_checkboxes = {
            "What makes him get up in the morning",
            "His hobbies and interests",
            "His religious views",
            "His political views"
    };

    public String[] button_texts = {
            "TEXT",
            "APPLY FILTERS",
            "LEARN MORE",
            "LOOK WITHIN"
    };


    public String[] professional_descriptions = {
            "Machine Learning Engineer, Software Engineer.",
            "Game Developer, Software Engineer."
    };



    // Object oriented programming attempt unsuccessful. Proceeding with static attribute retrieval.
    public int [][] pictures = {
            { R.drawable.shohan, R.drawable.shohan_professional, R.drawable.shohan_nerd, R.drawable.shohan_human},
            { R.drawable.julius_professional, R.drawable.julius_professional, R.drawable.julius_nerd, R.drawable.julius_human }
    };

    public String[] names = {
            "SHOHAN M. RAHMAN",
            "JULIUS BRIAN HALDER"
    };

    public String[] titles = {
            "Machine Learning Engineer, Software Developer, Composer",
            "Game Developer, Unit Tester"
    };

    public String[][][] candidate_info = {
            //Professional Info
            {
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
            },
            //Academic Info
            {
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
            },
            // Human info
            {
                    {   "Article: 'The hunt for interdisciplinary knowledge' (tags: philosophy)",
                            "Article: 'Using AI to bring the gap between man and god' (tags: philosophy)",
                            "Article: 'Majhpoth - just another prog rock band'",
                            "Article: 'Should musical bands be treated like tangible products or journal entries?' "},
                    {   "Julius human info 1",
                            "Julius human info 2",
                            "Julius human info 3",
                            "Julius human info 4"}
            }
    };
    public String[][] professional_infos = {
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


    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        int candindex = MainActivity.candindex;

//        getCandidateInfo();

        System.out.println("Hello, World!");

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);
        Button apply_filters = (Button) view.findViewById(R.id.filter_button);

        CheckBox checkbox = (CheckBox) view.findViewById(R.id.checkBox);
        CheckBox checkbox2 = (CheckBox) view.findViewById(R.id.checkBox2);
        CheckBox checkbox3 = (CheckBox) view.findViewById(R.id.checkBox3);
        CheckBox checkbox4 = (CheckBox) view.findViewById(R.id.checkBox4);

        TextView info1 = (TextView) view.findViewById(R.id.info1);
        TextView info2 = (TextView) view.findViewById(R.id.info2);
        TextView info3 = (TextView) view.findViewById(R.id.info3);
        TextView info4 = (TextView) view.findViewById(R.id.info4);


        if(position==0){
            checkbox.setVisibility(View.GONE);

            slideImageView.getLayoutParams().height = 500;
            slideImageView.getLayoutParams().width = 500;

            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)slideHeading.getLayoutParams();
            params.setMargins(0, 650, 10, 0); //substitute parameters for left, top, right, bottom
            slideHeading.setLayoutParams(params);

            RelativeLayout.LayoutParams params2 = (RelativeLayout.LayoutParams)slideDescription.getLayoutParams();
            params2.setMargins(0, 950, 10, 0); //substitute parameters for left, top, right, bottom
            slideDescription.setLayoutParams(params2);

            checkbox.setVisibility(View.GONE);
            checkbox2.setVisibility(View.GONE);
            checkbox3.setVisibility(View.GONE);
            checkbox4.setVisibility(View.GONE);

            apply_filters.setVisibility(View.GONE);

            slideImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //only handle two candidates for now

                    if(MainActivity.candindex==0) {
                        slideImageView.setImageResource(R.drawable.julius_professional);
                        MainActivity.candindex++;
                    } else{
                        slideImageView.setImageResource(R.drawable.shohan_professional);
                        MainActivity.candindex--;
                    }

                }
            });
        }

        slideImageView.setImageResource(slide_images[position]);

        slideHeading.setText(slide_heading[position]);

        slideDescription.setText(slide_descs[position]);

        apply_filters.setText(button_texts[position]);

        if(position==1){
            checkbox.setText(recruiter_checkboxes[0]);
            checkbox2.setText(recruiter_checkboxes[1]);
            checkbox3.setText(recruiter_checkboxes[2]);
            checkbox4.setText(recruiter_checkboxes[3]);
        }

        if(position==2){
            checkbox.setText(researcher_checkboxes[0]);
            checkbox2.setText(researcher_checkboxes[1]);
            checkbox3.setText(researcher_checkboxes[2]);
            checkbox4.setText(researcher_checkboxes[3]);
        }


        if(position==3){
            checkbox.setText(human_checkboxes[0]);
            checkbox2.setText(human_checkboxes[1]);
            checkbox3.setText(human_checkboxes[2]);
            checkbox4.setText(human_checkboxes[3]);
        }

        apply_filters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Prepare view for candidate summary display
                apply_filters.setVisibility(View.GONE);
                checkbox.setVisibility(View.GONE);
                checkbox2.setVisibility(View.GONE);
                checkbox3.setVisibility(View.GONE);
                checkbox4.setVisibility(View.GONE);

                // Show Thumbnail and titles
                slideImageView.setImageResource(pictures[candindex][position]);
                slideHeading.setText(names[candindex]);
                slideDescription.setText(titles[candindex]);

                // Show Bullet points
                info1.setText(candidate_info[position-1][candindex][0]);
                info2.setText(candidate_info[position-1][candindex][1]);
                info3.setText(candidate_info[position-1][candindex][2]);
                info4.setText(candidate_info[position-1][candindex][3]);

//                slideImageView.setImageResource(MainActivity.pictures[MainActivity.candindex][position]);

//                slideHeading.setText(MainActivity.names[MainActivity.candindex]);
//                slideDescription.setText(MainActivity.titles[MainActivity.candindex]);
            }
        });


        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}
