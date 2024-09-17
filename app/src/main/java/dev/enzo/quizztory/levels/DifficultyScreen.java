package dev.enzo.quizztory.levels;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import dev.enzo.quizztory.R;

public class DifficultyScreen extends AppCompatActivity {

    private AdView adView;

    Button btn_Easy, btn_Moderate, btn_Hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty_screen);

        MobileAds.initialize(this, initializationStatus -> Log.d("adMobs", "Initialized Complete."));

        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        btnEasy();
        btnModerate();
        btnHard();
    }

    //--------------------------- METHODS ----------------------------
    //Initializes UI Elements
    private void initializeUIElements(){
        btn_Easy = findViewById(R.id.btn_Easy);
        btn_Moderate = findViewById(R.id.btn_Moderate);
        btn_Hard = findViewById(R.id.btn_Hard);
    }
    private void btnEasy(){

        initializeUIElements();

        btn_Easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DifficultyScreen.this, EasyScreen.class);
                startActivity(intent);
            }
        });
    }
    // Initializes and handles the click event for the "Moderate" difficulty button, transitioning to the HardScreen activity.
    private void btnModerate(){

        initializeUIElements();

        btn_Moderate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DifficultyScreen.this, ModerateScreen.class);
                startActivity(intent);
            }
        });
    }
    // Initializes and handles the click event for the "Hard" difficulty button, transitioning to the HardScreen activity.
    private void btnHard(){

        initializeUIElements();

        btn_Hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DifficultyScreen.this, HardScreen.class);
                startActivity(intent);
            }
        });
    }
}