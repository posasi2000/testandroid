package com.example.mythree;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class BBB extends Activity {
    TextView tv1 ;
    TextView tv2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbb);
        tv1 = findViewById(R.id.tvdata1);
        tv2 = findViewById(R.id.tvdata2);

        Intent my  = this.getIntent();
        String dt1 = my.getStringExtra("aaa");
        tv1.setText(dt1);

        ArrayList<String> dt2 = my.getStringArrayListExtra("bbb");
        //추가할때 add(), 출력할때 for반복문 항목가져올때 get()
        for(int i=0; i<dt2.size(); i++){
            tv2.setText(tv2.getText() + " " + dt2.get(i));
        }
    }
}//class END




