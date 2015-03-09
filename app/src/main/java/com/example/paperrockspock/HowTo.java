package com.example.paperrockspock;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class HowTo extends Activity implements View.OnClickListener{

    ViewFlipper flippy;
    TextView v2;

    public void Return (View v){
        finish();
        }

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_how_to);
        v2 = (TextView) findViewById(R.id.textView2);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/MadZombies.ttf");
        v2.setTypeface(tf);
        flippy = (ViewFlipper) findViewById(R.id.viewFlipper);
        flippy.setOnClickListener(this);

	}
    public void onClick(View arg0){
        flippy.showNext();
    }
}
