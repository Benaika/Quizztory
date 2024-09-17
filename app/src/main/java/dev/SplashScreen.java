package dev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

import dev.enzo.quizztory.R;
import dev.enzo.quizztory.levels.DifficultyScreen;

public class SplashScreen extends AppCompatActivity {

    VideoView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Splash Screen Delay
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreen.this, DifficultyScreen.class);
            startActivity(intent);
            finish();
        }, 3000);

        VideoView background = findViewById(R.id.background);

        // Set the video file from the raw folder
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bg_splashscreen);
        background.setVideoURI(videoUri);

        background.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                background.start();
            }
        });
        // Start the video
        background.start();
    }
}