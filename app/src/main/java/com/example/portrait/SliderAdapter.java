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
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import org.w3c.dom.Text;

public class SliderAdapter extends PagerAdapter {


    //Instantiate the two candidates
    Candidate c1 = (Candidate) new Candidate();
    Candidate c2 = (Candidate) new Candidate();

    Context context;
    LayoutInflater layoutInflater;

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

    public int[] slide_images = {
            R.drawable.shohan,
            R.drawable.man,
            R.drawable.woman_blue,
            R.drawable.woman_red
    };

    public String[] slide_descs = {
            "Swipe left until you find a label that best describes you.",
            "You are primarily interested in his:",
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

    public String[] professional_headings = {
            "SHOHAN M. RAHMAN",
            "JULIUS BRIAN HALDER"
    };

    public String[] professional_descriptions = {
            "Machine Learning Engineer, Software Engineer.",
            "Game Developer, Software Engineer."
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
                apply_filters.setVisibility(View.GONE);
                checkbox.setVisibility(View.GONE);
                checkbox2.setVisibility(View.GONE);
                checkbox3.setVisibility(View.GONE);
                checkbox4.setVisibility(View.GONE);


//                slideImageView.setImageResource();
//                slideHeading.setText();
//                slideDescription.setText();
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
