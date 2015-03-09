package com.example.paperrockspock;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class StartMenu extends Activity {

TextView v1;
TextView v2;
TextView v3;
TextView v4;
TextView v5;

//Pyszczkam Rybke :3
public void Choice (View v){
	if(v==v1){
		Intent myIntent = new Intent(this, PlayVsAiScreen.class);
		startActivity(myIntent);
	}
	else if(v==v2){
		Intent myIntent = new Intent(this, Pvp.class);
		startActivity(myIntent);
	}
	else if(v==v3){
        Intent myIntent = new Intent(this, Options.class);
        startActivity(myIntent);
	}
	else if(v==v4){
        Intent myIntent = new Intent(this, HowTo.class);
        startActivity(myIntent);
	}
    else if(v==v5){
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_start_menu);
        v1=(TextView) findViewById(R.id.textView1);
        v2=(TextView) findViewById(R.id.textView2);
        v3=(TextView) findViewById(R.id.textView3);
        v4=(TextView) findViewById(R.id.textView4);
        v5=(TextView) findViewById(R.id.textView5);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/MadZombies.ttf");
        v1.setTypeface(tf);
        v2.setTypeface(tf);
        v3.setTypeface(tf);
        v4.setTypeface(tf);
        v5.setTypeface(tf);
    }
    
}
