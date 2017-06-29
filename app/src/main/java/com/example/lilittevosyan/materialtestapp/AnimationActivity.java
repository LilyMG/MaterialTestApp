package com.example.lilittevosyan.materialtestapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridView;

import com.airbnb.lottie.LottieAnimationView;

import org.json.JSONObject;

import java.util.ArrayList;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class AnimationActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.animation);
		LottieAnimationView animationView = (LottieAnimationView) findViewById(R.id.animation_view);
		animationView.setAnimation("toggle_switch.json");
		animationView.loop(true);
		animationView.playAnimation();
	}

}
