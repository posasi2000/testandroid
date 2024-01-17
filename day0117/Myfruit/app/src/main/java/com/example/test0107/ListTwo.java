package com.example.test0107;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListTwo extends AppCompatActivity {
    ArrayList<Fruit> al  ;
    MyAdapter dap ;
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

        dap = new MyAdapter(ListTwo.this, R.layout.kakao, al );
        lv.setAdapter(dap);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(), myAdapter1.getItem(i).getMovieName(), Toast.LENGTH_LONG).show();

                //View dlg= View.inflate(ListTwo.this,R.layout.display,null);
                //ImageView img=dlg.findViewById(R.id.ivPoster);
                //AlertDialog.Builder ad =new AlertDialog.Builder(adapterView.getContext());
                //AlertDialog.Builder ad =new AlertDialog.Builder(ListTwo.this);
                //ad.setView(dlg);
                //ad.setNegativeButton("close SKU",null); //cancel 버튼
                //ad.show();
            }
        });
    }//onCreate end

    //내부클래스
    class MyAdapter extends BaseAdapter {
        Context ct;
        int layout;
        LayoutInflater inf;
        ArrayList<Fruit> al;
        Integer[ ] posterID = {R.drawable.melon, R.drawable.remon, R.drawable.jadoo,R.drawable.singer4 };
        String[ ] posterName = {" 메론"," 레몬"," 자두"," 소냐"};


        public MyAdapter(Context ct) {
            this.ct = ct;
        }//end

        public MyAdapter(Context ct, int layout,  ArrayList<Fruit> al) {
            this.ct = ct;
            this.layout = layout;
            this.inf = (LayoutInflater)ct.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.al = al;
        }//생성자end

        @Override
        public int getCount() {
            return al.size();
        }//end

        @Override
        public Object getItem(int position) {
            return al.get(position);
        }//end

        @Override
        public long getItemId(int position) {
            return position;
        }//end

        @Override
        public View getView(int position, View cv, ViewGroup parent) {
            if(cv==null) cv=inf.inflate(layout, null); //꼭기술하삼 안그럼 안보임

            ImageView iv=cv.findViewById(R.id.imageView1);
            TextView tName=cv.findViewById(R.id.tvName);
            TextView tFrom=cv.findViewById(R.id.tvFrom);
            TextView tDate=cv.findViewById(R.id.tvDate);
            ImageView iFrom=cv.findViewById(R.id.ivFrom);
            Fruit f = al.get(position);
            iv.setImageResource(f.img);
            tName.setText(f.name);
            tFrom.setText(f.from);
            iFrom.setImageResource(f.from_flag);
            tDate.setText(f.date);

            final int pos = position;
            iv.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    View dialogView = (View) View.inflate(ListTwo.this, R.layout.display, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(ListTwo.this);
                    ImageView ivPoster = dialogView.findViewById(R.id.ivPoster);

                    ivPoster.setImageResource(posterID[pos]);
                    dlg.setTitle(posterName[pos]);
                    dlg.setIcon(R.drawable.flower1);
                    dlg.setView(dialogView);
                    dlg.setNegativeButton("sku닫기", null);
                    dlg.show();
                }
            });

            return cv;
        }//end
    }//MyAdpter클래스 end

}//ListTwo class END