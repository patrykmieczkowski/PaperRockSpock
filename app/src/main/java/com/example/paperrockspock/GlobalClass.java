package com.example.paperrockspock;

import android.app.Application;

public class GlobalClass extends Application{

    private String p1name = "Player 1";
    private String p2name = "Player 2";

    public String getP1name(){
        return p1name;
    }

    public void setP1name(String aP1name){
        p1name = aP1name;
    }

    public String getP2name(){
        return p2name;
    }

    public void setP2name(String aP2name){
        p2name = aP2name;
    }
}
