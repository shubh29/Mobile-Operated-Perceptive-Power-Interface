package com.nh.home_automation;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class HomeAutomationActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	//setContentView(R.layout.main);

	//5000 is the starting number (in milliseconds)
	//1000 is the number to count down each time (in milliseconds)

	MyCount counter = new MyCount(2000,1000);
	counter.start();
	}
	//countdowntimer is an abstract class, so extend it and fill in methods
	public class MyCount extends CountDownTimer{
	public MyCount(long millisInFuture, long countDownInterval) {
	super(millisInFuture, countDownInterval);
	}
	@Override
	public void onFinish() {
	Intent i=new Intent(HomeAutomationActivity.this,GridViewExampleActivityActivity.class);
	startActivity(i);

	}
	@Override
	public void onTick(long millisUntilFinished) {
	setContentView(R.layout.c1);
	}
	}
    }
