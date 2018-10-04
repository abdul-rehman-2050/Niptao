package com.fypsolutions.niptao;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.fypsolutions.niptao.ui.MainActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final TextView textView = findViewById(R.id.tvTitle);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/BerkshireSwash-Regular.ttf");

        textView.setTypeface(custom_font);

        Animation aniFade = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        final Animation aniFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);

        aniFadeOut.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {


                textView.setVisibility(View.INVISIBLE);
                Intent myIntent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(myIntent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        aniFade.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                textView.startAnimation(aniFadeOut);


            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        textView.startAnimation(aniFade);

    }
}
