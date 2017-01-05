package com.example.fingureprint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		Intent intent = new Intent("com.example.fingureprint.services.JudgeFingureService");
		intent.setPackage(getPackageName());
		startService(intent);
		
	}
	
	

}
