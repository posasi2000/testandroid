package com.example.mytwo;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {
    ListView listview ;
    ArrayList<SampleData> movieDataList = new ArrayList<SampleData>();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //tv안내문,lv,iv강아지

        listview = findViewById(R.id.listview1);

        //멤버객체화 movieDataList = new ArrayList<SampleData>(); 객체화후 add(1,2,3)
        movieDataList.add(new SampleData(R.drawable.d11, " 녹차", "  주문가능"));
        movieDataList.add(new SampleData(R.drawable.d22, " 모래시계", "  주문가능"));
        movieDataList.add(new SampleData(R.drawable.d33, " 하우스", "  주문가능"));

        movieDataList.add(new SampleData(R.drawable.pizza1, " 초코케익", "  주문가능"));
        movieDataList.add(new SampleData(R.drawable.pizza2, " 블루케익", "  주문가능"));
        movieDataList.add(new SampleData(R.drawable.pizza3, " 미니케익", "  주문가능"));

        android.util.Log.i( "ArrayList추가데이터 확인",  movieDataList.toString());
        System.out.println("ArrayList추가데이터 확인 " + movieDataList.toString());

        SKUAdapter myAdapter1 =  new SKUAdapter(this, movieDataList); //BBB.java=SKUAdapter.java
        listview.setAdapter(myAdapter1);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), myAdapter1.getItem(i).getMovieName(), Toast.LENGTH_LONG).show();
            }
        });

    }//onCreat함수메소드 end

}//MainActivity class END


















