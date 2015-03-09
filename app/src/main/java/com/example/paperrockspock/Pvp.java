package com.example.paperrockspock;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Pvp extends Activity {

ImageView i1;
ImageView i2;
ImageView i3;
ImageView i4;
ImageView i5;
ImageView i6;
ImageView i7;
TextView v1;
TextView v2;
TextView v3;
TextView v4;
TextView v5;
TextView v6;
TextView v7;
int p1=-1,p2=-1,lp1=0,lp2=0;
String player1="off";
String player2="off";
String player1name;
String player2name;
String[] item = new String[5];
int[][] beat = new int[5][5];


public void setActivityBackgroundColor(int color) {
    View view = this.getWindow().getDecorView();
    view.setBackgroundColor(color);
}

public void roll(View v){
	ImageView x =(ImageView) v;	
    if(player1.equals("off")){
            if(x==i1){
                p1=0;}
            else if(x==i2){
                p1=1;}
            else if(x==i3){
                p1=2;}
            else if(x==i4){
                p1=3;}
            else if(x==i5){
                p1=4;}
            player1="on";
            setActivityBackgroundColor(0xffedb579);
            v1.setText(player2name);
    }
    else if(player2.equals("off")){
            if(x==i1){
                p2=0;}
            else if(x==i2){
                p2=1;}
            else if(x==i3){
                p2=2;}
            else if(x==i4){
                p2=3;}
            else if(x==i5){
                p2=4;}
        player2="on";
     }
    if(player1.equals("on") && player2.equals("on")){
            setActivityBackgroundColor(0xffffffff);
            v2.setText("SCORE");
            i1.setVisibility(ImageView.INVISIBLE);
            i2.setVisibility(ImageView.INVISIBLE);
            i3.setVisibility(ImageView.INVISIBLE);
            i4.setVisibility(ImageView.INVISIBLE);
            i5.setVisibility(ImageView.INVISIBLE);
            i6.setVisibility(ImageView.VISIBLE);
            i7.setVisibility(ImageView.VISIBLE);
            v1.setVisibility(TextView.INVISIBLE);
            v2.setVisibility(TextView.VISIBLE);
            v3.setVisibility(TextView.VISIBLE);
            v4.setVisibility(TextView.VISIBLE);
            v5.setVisibility(TextView.VISIBLE);
            v6.setVisibility(TextView.VISIBLE);
            v7.setVisibility(TextView.VISIBLE);

            if(beat[p1][p2]==1){
                if(p1==0){
                    i6.setImageResource(R.drawable.paper);}
                else if(p1==1){
                    i6.setImageResource(R.drawable.scissors);}
                else if(p1==2){
                    i6.setImageResource(R.drawable.rock);}
                else if(p1==3){
                    i6.setImageResource(R.drawable.lizard);}
                else if(p1==4){
                    i6.setImageResource(R.drawable.spock);}
                if(p2==0){
                    i7.setImageResource(R.drawable.paper);}
                else if(p2==1){
                    i7.setImageResource(R.drawable.scissors);}
                else if(p2==2){
                    i7.setImageResource(R.drawable.rock);}
                else if(p2==3){
                    i7.setImageResource(R.drawable.lizard);}
                else if(p2==4){
                    i7.setImageResource(R.drawable.spock);}

                v4.setText(player1name + " WINS");
                v4.setTextColor(0xffdbe6af);
                v5.setText("beats");
                lp1++;
            }
            else if(beat[p1][p2]==-1){
                if(p2==0){
                    i6.setImageResource(R.drawable.paper);}
                else if(p2==1){
                    i6.setImageResource(R.drawable.scissors);}
                else if(p2==2){
                    i6.setImageResource(R.drawable.rock);}
                else if(p2==3){
                    i6.setImageResource(R.drawable.lizard);}
                else if(p2==4){
                    i6.setImageResource(R.drawable.spock);}
                if(p1==0){
                    i7.setImageResource(R.drawable.paper);}
                else if(p1==1){
                    i7.setImageResource(R.drawable.scissors);}
                else if(p1==2){
                    i7.setImageResource(R.drawable.rock);}
                else if(p1==3){
                    i7.setImageResource(R.drawable.lizard);}
                else if(p1==4){
                    i7.setImageResource(R.drawable.spock);}

                v4.setText(player2name + " WINS");
                v4.setTextColor(0xffedb579);
                v5.setText("beats");
                lp2++;}

            else{
                if(p1==0){
                    i6.setImageResource(R.drawable.paper);
                    i7.setImageResource(R.drawable.paper);}
                else if(p1==1){
                    i6.setImageResource(R.drawable.scissors);
                    i7.setImageResource(R.drawable.scissors);}
                else if(p1==2){
                    i6.setImageResource(R.drawable.rock);
                    i7.setImageResource(R.drawable.rock);}
                else if(p1==3){
                    i6.setImageResource(R.drawable.lizard);
                    i7.setImageResource(R.drawable.lizard);}
                else if(p1==4){
                    i6.setImageResource(R.drawable.spock);
                    i7.setImageResource(R.drawable.spock);}

                v4.setText("Tie");
                v4.setTextColor(Color.BLACK);
                v5.setText("equals");
                }

            v3.setText(new StringBuilder(player1name).append(": ").append(lp1).append("\n").append(player2name).append(": ").append(lp2).toString());
    }

StringBuilder sb = new StringBuilder();
sb.append("P1: ");
sb.append(p1);
sb.append(" P2: ");
sb.append(p2);
//v2.setText(sb.toString());
   }

public void reset(View v){
    if(v==v6) {
        v1.setText(player1name);
        player1 = "off";
        player2 = "off";
        i1.setVisibility(ImageView.VISIBLE);
        i2.setVisibility(ImageView.VISIBLE);
        i3.setVisibility(ImageView.VISIBLE);
        i4.setVisibility(ImageView.VISIBLE);
        i5.setVisibility(ImageView.VISIBLE);
        i6.setVisibility(ImageView.INVISIBLE);
        i7.setVisibility(ImageView.INVISIBLE);
        v1.setVisibility(TextView.VISIBLE);
        v2.setVisibility(TextView.INVISIBLE);
        v3.setVisibility(TextView.INVISIBLE);
        v4.setVisibility(TextView.INVISIBLE);
        v5.setVisibility(TextView.INVISIBLE);
        v6.setVisibility(TextView.INVISIBLE);
        v7.setVisibility(TextView.INVISIBLE);
        setActivityBackgroundColor(0xffdbe6af);
    }
    else if(v==v7){
        finish();
    }
}

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_pvp);
		setActivityBackgroundColor(0xffdbe6af);
		i1=(ImageView) findViewById(R.id.imageView1);
		i2=(ImageView) findViewById(R.id.imageView2);
		i3=(ImageView) findViewById(R.id.imageView3);
		i4=(ImageView) findViewById(R.id.imageView4);
		i5=(ImageView) findViewById(R.id.imageView5);
        i6=(ImageView) findViewById(R.id.imageView6);
        i7=(ImageView) findViewById(R.id.imageView7);
        v1=(TextView) findViewById(R.id.textView1);
        v2=(TextView) findViewById(R.id.textView2);
        v3=(TextView) findViewById(R.id.textView3);
		v4=(TextView) findViewById(R.id.textView4);
        v5=(TextView) findViewById(R.id.textView5);
        v6=(TextView) findViewById(R.id.textView6);
        v7=(TextView) findViewById(R.id.textView7);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/MadZombies.ttf");
        v1.setTypeface(tf);
        v2.setTypeface(tf);
        v3.setTypeface(tf);
        v4.setTypeface(tf);
        v5.setTypeface(tf);
        v6.setTypeface(tf);
        v7.setTypeface(tf);
        final GlobalClass globalVariable=(GlobalClass) getApplicationContext();
        final String p1name = globalVariable.getP1name();
        final String p2name = globalVariable.getP2name();
        player1name = p1name;
        player2name = p2name;
        v1.setText(player1name);

        beat[0][0]=0;
        beat[1][0]=1;
        beat[2][0]=-1;
        beat[3][0]=1;
        beat[4][0]=-1;
        beat[0][1]=-1;
        beat[1][1]=0;
        beat[2][1]=1;
        beat[3][1]=-1;
        beat[4][1]=1;
        beat[0][2]=1;
        beat[1][2]=-1;
        beat[2][2]=0;		
        beat[3][2]=-1;
        beat[4][2]=1;
        beat[0][3]=-1;
        beat[1][3]=1;
        beat[2][3]=1;		
        beat[3][3]=0;
        beat[4][3]=-1;
        beat[0][4]=1;
        beat[1][4]=-1;
        beat[2][4]=-1;		
        beat[3][4]=1;
        beat[4][4]=0;
	}
}
