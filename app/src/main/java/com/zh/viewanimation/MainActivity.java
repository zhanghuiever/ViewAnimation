package com.zh.viewanimation;

import android.animation.AnimatorListenerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.iv_display);
    }

    public void runAlphaAnimation(View view){
        AlphaAnimation animation = new AlphaAnimation(1.0f,0.0f);
        animation.setDuration(2000);
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
        animation.setRepeatCount(1);
        animation.setRepeatMode(Animation.REVERSE);
        animation.setFillAfter(false);
        imageView.startAnimation(animation);
    }

    public void runTranslateAnimation(View view){
        TranslateAnimation animation = new TranslateAnimation(30.0f, 100.0f,0.0f,100.0f);
        animation.setDuration(2000);
        animation.setInterpolator(new BounceInterpolator());
        //animation.setRepeatCount(1);
        //animation.setRepeatMode(Animation.REVERSE);
        animation.setFillAfter(true);
        imageView.startAnimation(animation);
    }

    public void runScaleAnimation(View view){
        ScaleAnimation animation = new ScaleAnimation(1.0f,1.4f,1.0f,1.4f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(2000);
        animation.setFillAfter(true);
        imageView.startAnimation(animation);
    }

    public void runRotateAnimation(View view){
        RotateAnimation animation = new RotateAnimation(0.0f,60.0f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(4000);
        animation.setInterpolator(new BounceInterpolator());
        animation.setFillAfter(true);
        imageView.startAnimation(animation);
    }

    public void runAnimRes(View view){
        AnimationSet as = (AnimationSet) AnimationUtils.loadAnimation(this, R.anim.myanim);
        imageView.startAnimation(as);
    }
}
