package com.example.jojoclicer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewCount;
    private ImageView imageViewLVL;
    private Button buttonClick;
    private int count;
    private MediaPlayer mediaPlayer;
    private int length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewCount = findViewById(R.id.text_view_count);
        imageViewLVL = findViewById(R.id.image_view_lvl);
        buttonClick = findViewById(R.id.button_click);
        count = 0;
        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textViewCount.setText(count + "");

                switch (count) {
                    case 10:
                        imageViewLVL.setImageResource(R.drawable.a1);
                        break;
                    case 20:
                        imageViewLVL.setImageResource(R.drawable.a1);
                        //mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.you1);
                        //mediaPlayer.start();
                        break;
                }
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        //mediaPlayer.pause();
        // length = mediaPlayer.getCurrentPosition();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //mediaPlayer = mediaPlayer.create(MainActivity.this, R.raw.you1);
        //mediaPlayer.seekTo(length);
        //mediaPlayer.start();
    }
}