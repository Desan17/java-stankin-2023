package com.example.jojoclicer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    public TextView textVIewCount;
    private ImageView imageViewLVL;
    private Button buttonClick;
    private int count;
    public HomeFragment(){
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup contrainer, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, contrainer, false);

        textViewCount = view.findViewById(R.id.text_view_count);
        imageViewLVL = view.findViewById(R.id.image_view_lvl1);
        buttonClick = view.findViewById(R.id.button_click);
        count = 0;
        bittonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textViewCount.setText(count + "");
            }
        });

        return view;
    }
}

