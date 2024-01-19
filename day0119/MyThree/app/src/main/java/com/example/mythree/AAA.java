package com.example.mythree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
          //Intent it = new Intent(현재클래스 AAA, 받는쪽클래스BBB.class) ;
          Intent it = new Intent(AAA.this, BBB.class) ;
          it.putExtra("aaa", name);
          it.putExtra("bbb", food);
          startActivity(it);
        }
    }//end
}//class END

 // ㄴjava.lang.Object 자바클래스최상위 부모
  // ㄴandroid.content.Context
    // ㄴandroid.content.ContextWrapper
     // ㄴandroid.view.ContextThemeWrapper
      //ㄴandroid.app.Activity
        // ㄴcom.example.mythree.AAA클래스
