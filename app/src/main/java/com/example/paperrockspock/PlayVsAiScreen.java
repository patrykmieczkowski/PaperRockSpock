package com.example.paperrockspock;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayVsAiScreen extends Activity {

    int u,k,lu=0,lk=0,play=0;
    ImageView i1;
    ImageView i2;
    ImageView i3;
    ImageView i4;
    ImageView i5;
    ImageView i6;
    TextView v1;
    TextView v2;
    TextView v3;
    TextView v4;
    TextView v5;
    TextView v7;
    TextView v8;


String[] item = new String[5];
int[][] beat = new int[5][5];

Random generator = new Random();

public void roll(View v){
	ImageView x =(ImageView) v;
if(play==0){
	if(x==i1){
		u=0;
		i2.setVisibility(ImageView.INVISIBLE);
		i3.setVisibility(ImageView.INVISIBLE);
		i4.setVisibility(ImageView.INVISIBLE);
		i5.setVisibility(ImageView.INVISIBLE);}
	else if(x==i2){
		u=1;
		i1.setVisibility(ImageView.INVISIBLE);
		i3.setVisibility(ImageView.INVISIBLE);
		i4.setVisibility(ImageView.INVISIBLE);
		i5.setVisibility(ImageView.INVISIBLE);}
	else if(x==i3){
		u=2;
		i1.setVisibility(ImageView.INVISIBLE);
		i2.setVisibility(ImageView.INVISIBLE);
		i4.setVisibility(ImageView.INVISIBLE);
		i5.setVisibility(ImageView.INVISIBLE);}
	else if(x==i4){
		u=3;
		i1.setVisibility(ImageView.INVISIBLE);
		i2.setVisibility(ImageView.INVISIBLE);
		i3.setVisibility(ImageView.INVISIBLE);
		i5.setVisibility(ImageView.INVISIBLE);}
	else if(x==i5){
		u=4;
		i1.setVisibility(ImageView.INVISIBLE);
		i2.setVisibility(ImageView.INVISIBLE);
		i3.setVisibility(ImageView.INVISIBLE);
		i4.setVisibility(ImageView.INVISIBLE);}
	
k=generator.nextInt(5);

StringBuilder sb = new StringBuilder();
//v6.setText(item[k]);
i6.setVisibility(ImageView.VISIBLE);

if(k==0){
	i6.setImageResource(R.drawable.paper);}
else if(k==1){
	i6.setImageResource(R.drawable.scissors);}
else if(k==2){
	i6.setImageResource(R.drawable.rock);}
else if(k==3){
	i6.setImageResource(R.drawable.lizard);}
else if(k==4){
	i6.setImageResource(R.drawable.spock);}

v7.setVisibility(TextView.VISIBLE);
if(beat[u][k]==1){
	v7.setText("You win");
	v7.setTextColor(Color.GREEN);
	lu++;
}
else if(beat[u][k]==-1){
	v7.setText("You lose");
	v7.setTextColor(Color.RED);
	lk++;}
else{
	v7.setText("Tie");
	v7.setTextColor(Color.BLACK);
	}

sb=new StringBuilder();
sb.append(" ");
sb.append(lu);
v4.setText(sb.toString());
sb=new StringBuilder();
sb.append(" ");
sb.append(lk);
v5.setText(sb.toString());
play=1;
}

}
public void reset (View v){
    if(v==v8){
        finish();
    }
}


@Override
public boolean onTouchEvent(MotionEvent event) {
	if(play==1){
	i1.setVisibility(ImageView.VISIBLE);
	i2.setVisibility(ImageView.VISIBLE);
	i3.setVisibility(ImageView.VISIBLE);
	i4.setVisibility(ImageView.VISIBLE);
	i5.setVisibility(ImageView.VISIBLE);
	i6.setVisibility(ImageView.INVISIBLE);
	v7.setVisibility(TextView.INVISIBLE);
	play=0;
	 
}
return super.onTouchEvent(event);
 }
	@Override

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_play_vs_ai_screen);
		i1=(ImageView) findViewById(R.id.imageView1);
		i2=(ImageView) findViewById(R.id.imageView2);
		i3=(ImageView) findViewById(R.id.imageView3);
		i4=(ImageView) findViewById(R.id.imageView4);
		i5=(ImageView) findViewById(R.id.imageView5);
		i6=(ImageView) findViewById(R.id.imageView6);
        v1=(TextView) findViewById(R.id.textView1);
        v2=(TextView) findViewById(R.id.textView2);
        v3=(TextView) findViewById(R.id.textView3);
        v4=(TextView) findViewById(R.id.textView4);
        v5=(TextView) findViewById(R.id.textView5);
        v7=(TextView) findViewById(R.id.textView7);
        v8=(TextView) findViewById(R.id.textView8);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/MadZombies.ttf");
        v1.setTypeface(tf);
        v2.setTypeface(tf);
        v3.setTypeface(tf);
        v4.setTypeface(tf);
        v5.setTypeface(tf);
        v7.setTypeface(tf);
        v8.setTypeface(tf);
		
		item[0]="paper";
		item[1]="scissors";
		item[2]="rock";
		item[3]="lizard";
		item[4]="spock";
		
		
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
