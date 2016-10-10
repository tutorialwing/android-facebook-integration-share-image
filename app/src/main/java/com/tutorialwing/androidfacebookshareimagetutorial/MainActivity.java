package com.tutorialwing.androidfacebookshareimagetutorial;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		addShareImageFragment();
	}

	private void addShareImageFragment() {
		FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
		fragmentTransaction.add(R.id.facebook_share_button, new ShareImageFragment());
		fragmentTransaction.commit();
	}
}
