package com.example.test0107;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        lv=findViewById(R.id.listView);
        ArrayList<String> list=new ArrayList<>();
        list.add("오렌지");
        list.add("토마토");
        list.add("바나나");
        list.add("한라봉");
        list.add("복숭아");
        ArrayAdapter<String> dap=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        lv.setAdapter(dap);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                tv.setText(list.get(pos).toString()); //tv대신 java.widget 패키지에 있는 AlertDialog.Builder ab =new ~
            }
        });
    }//onCreate end
}//class END


















