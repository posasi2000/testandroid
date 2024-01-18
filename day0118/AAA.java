package com.example.mythree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class AAA extends AppCompatActivity {
    String name;
    ArrayList<String> food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aaa);
        name = "이름:고길동" ;
        food = new ArrayList<String>();
        food.add("coffee커피");
        food.add("pizza피자");
        food.add("cake미니케익");
    }//end

    public void handleClick(View vw){
        int id = vw.getId();
        if(id == R.id.mybutton1){
          //BBB.java문서로 보내고 싶어요 Intent
        }
    }//end

}//class END