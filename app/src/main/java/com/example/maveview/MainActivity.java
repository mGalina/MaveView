package com.example.maveview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

import me.itangqi.waveloadingview.WaveLoadingView;

public class MainActivity extends AppCompatActivity {

    private WaveLoadingView waveLoadingView;
    private SeekBar seekBar;

//    private String title;
//    private int value = 50;
//    private int maxValue = 300;
//    private int percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        waveLoadingView = findViewById(R.id.waveLoadingView);
        seekBar = findViewById(R.id.seekBar);

//        percent = (int)(((float)value/maxValue)*100);
//
//        waveLoadingView.setProgressValue(percent);
//
//        title = Integer.toString(value);
//        waveLoadingView.setBottomTitle("");
//        waveLoadingView.setCenterTitle("");
//        waveLoadingView.setTopTitle("");
//
//
//        if (value < 50) {
//            waveLoadingView.setBottomTitle(title);
//        } else if (value == 50) {
//            waveLoadingView.setCenterTitle(title);
//        } else {
//            waveLoadingView.setTopTitle(title);
//        }

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                waveLoadingView.setProgressValue(progress);

                String title = String.valueOf(progress);
                waveLoadingView.setBottomTitle("");
                waveLoadingView.setCenterTitle("");
                waveLoadingView.setTopTitle("");

                if (progress < 50) {
                    waveLoadingView.setBottomTitle(title);
                } else if (progress == 50) {
                    waveLoadingView.setCenterTitle(title);
                } else {
                    waveLoadingView.setTopTitle(title);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}