package com.example.test0107;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListTwo extends AppCompatActivity {
    ArrayList<Fruit> al  ;
    KakaoAdapter dap ;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_two);

        lv=findViewById(R.id.listView1);
        al = new ArrayList<Fruit>();
        al.add(new Fruit(R.drawable.melon,"메론","인도",R.drawable.flag_india, "2024.01.02"));
        al.add(new Fruit(R.drawable.remon,"레몬","호주",R.drawable.flag_myanmar, "2023.12.21"));
        al.add(new Fruit(R.drawable.jadoo,"자두","영천",R.drawable.flag_southkorea, "2024.01.03"));
        al.add(new Fruit(R.drawable.singer4,"소냐","미국",R.drawable.flag_us, "2023.11.24"));

        dap = new KakaoAdapter(ListTwo.this, R.layout.kakao, al );
        lv.setAdapter(dap);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                View dlg= View.inflate(ListTwo.this,R.layout.display,null);
                ImageView img=dlg.findViewById(R.id.ivPoster);
                AlertDialog.Builder ad =new AlertDialog.Builder(adapterView.getContext());
                ad.setView(dlg);
                ad.setNegativeButton("close",null); //cancel 버튼
                ad.show();
            }
        });
    }//onCreate end
}//class END