package com.example.paperrockspock;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Options extends ActionBarActivity {

    TextView v1;
    TextView v2;
    TextView v3;
    TextView v4;
    TextView v5;
    TextView v6;
    EditText e1;
    EditText e2;
    Button b1;
    Button b2;

    public void change(View b){
        if (b==b1){
        e1 = (EditText) findViewById(R.id.editText1);
        String player1 = e1.getText().toString();
        final GlobalClass globalVariable = (GlobalClass) getApplicationContext();
        globalVariable.setP1name(player1);
        v3.setText(player1);
        }

        else if (b==b2) {
        e2 = (EditText) findViewById(R.id.editText2);
        String player2 = e2.getText().toString();
        final GlobalClass globalVariable = (GlobalClass) getApplicationContext();
        globalVariable.setP2name(player2);
        v5.setText(player2);
        }

        else if (b==v6) {
        finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_options);
        v1=(TextView) findViewById(R.id.textView1);
        v2=(TextView) findViewById(R.id.textView2);
        v3=(TextView) findViewById(R.id.textView3);
        v4=(TextView) findViewById(R.id.textView4);
        v5=(TextView) findViewById(R.id.textView5);
        v6=(TextView) findViewById(R.id.textView6);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/MadZombies.ttf");
        v1.setTypeface(tf);
        v2.setTypeface(tf);
        v3.setTypeface(tf);
        v4.setTypeface(tf);
        v5.setTypeface(tf);
        v6.setTypeface(tf);
        b1.setTypeface(tf);
        b2.setTypeface(tf);

        final GlobalClass globalVariable=(GlobalClass) getApplicationContext();
        final String p1name = globalVariable.getP1name();
        final String p2name = globalVariable.getP2name();
        v3.setText(p1name);
        v5.setText(p2name);

    }

}
