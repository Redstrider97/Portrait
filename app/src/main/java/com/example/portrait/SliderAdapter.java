package com.example.portrait;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import org.w3c.dom.Text;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    // Arrays

    public String[] slide_heading = {
            "Welcome to my virtual resume!",
            "I AM A RECRUITER!",
            "I AM A RESEARCHER!!",
            "I AM A HUMAN!"
    };

    public int[] slide_images = {
            R.drawable.shohan,
            R.drawable.man,
            R.drawable.woman_blue,
            R.drawable.woman_red
    };

    public String[] slide_descs = {
            "Swipe left until you find a label that best describes you.",
            "I am only interested in:",
            "I want to learn more about:",
            "I am curious about:"
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
        CheckBox checkbox = (CheckBox) view.findViewById(R.id.checkBox);

        slideImageView.setImageResource(slide_images[position]);

        slideHeading.setText(slide_heading[position]);

        slideDescription.setText(slide_descs[position]);

        if(position==0){
            checkbox.setVisibility(View.GONE);

//            ViewGroup.LayoutParams heading_params=slideHeading.getLayoutParams();
//            heading_params.height=267;
//            slideHeading.setLayoutParams(heading_params);
        }
        else{
            checkbox.setText("Text");
        }

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}
