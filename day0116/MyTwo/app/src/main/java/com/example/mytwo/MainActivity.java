package com.example.mytwo;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends Activity {
    ListView listview ;
    ArrayList<SampleData> movieDataList;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //tv안내문,lv,iv강아지

        listview = findViewById(R.id.listview1);

        movieDataList = new ArrayList<SampleData>();
        movieDataList.add(new SampleData(R.drawable.d11, "녹차", "누구나 주문가능"));
        movieDataList.add(new SampleData(R.drawable.d22, "모래시계", "누구나 주문가능"));
        movieDataList.add(new SampleData(R.drawable.d33, "하우스", "누구나 주문가능"));
        SKUAdapter myAdapter1 =  new SKUAdapter(this, movieDataList);
        listview.setAdapter(myAdapter1);
    }//end

}//class END


















