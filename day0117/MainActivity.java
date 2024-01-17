package com.example.mytwo;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
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

        //SKUAdapter myAdapter1 =  new SKUAdapter(this, movieDataList); //BBB.java=SKUAdapter.java
        MyAdapter myAdapter1 =  new MyAdapter(this, movieDataList); //BBB.java=SKUAdapter.java
        listview.setAdapter(myAdapter1);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), myAdapter1.getItem(i).getMovieName(), Toast.LENGTH_LONG).show();
            }
        });
    }//onCreat함수메소드 end

    //내부클래스
    public class MyAdapter extends BaseAdapter {
        Context mContext = null ;
        LayoutInflater mLayoutInflater = null ;
        ArrayList<SampleData> sample ;
        Integer[ ]  posterID = {
                R.drawable.d11, R.drawable.d22, R.drawable.d33,R.drawable.pizza1,R.drawable.pizza2,R.drawable.pizza3,
        };

        String[ ] posterName = {" 녹차"," 모래시계"," 나의집"," 초코케익"," 블루케익"," 미니케익", };

        //movieDataList.add(new SampleData(R.drawable.d11, " 녹차", "  주문가능"));
        //movieDataList.add(new SampleData(R.drawable.d22, " 모래시계", "  주문가능"));
        //movieDataList.add(new SampleData(R.drawable.d33, " 하우스", "  주문가능"));
        //movieDataList.add(new SampleData(R.drawable.pizza1, " 초코케익", "  주문가능"));
        //movieDataList.add(new SampleData(R.drawable.pizza2, " 블루케익", "  주문가능"));
        //movieDataList.add(new SampleData(R.drawable.pizza3, " 미니케익", "  주문가능"));

        public MyAdapter(Context mContext, ArrayList<SampleData> sample) {
            this.mContext = mContext;
            this.sample = sample;
            mLayoutInflater = LayoutInflater.from(mContext);
        }//end

        @Override
        public int getCount() { return sample.size(); }

        @Override
        public SampleData getItem(int i) {
            return sample.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int position, View convertview, ViewGroup viewGroup) {
            View view = mLayoutInflater.inflate(R.layout.listview_custom, null);
            ImageView iv = view.findViewById(R.id.poster);
            TextView movieName = view.findViewById(R.id.movieName);
            TextView grade = view.findViewById(R.id.grade);

            iv.setImageResource(sample.get(position).getPoster());
            movieName.setText(sample.get(position).getMovieName());
            grade.setText(sample.get(position).getGrade());
            //여기까지 기술해야 애뮬레이터에 데이터표시

            //2024-01-17-수요일  왼쪽 메인이미지클릭시 상세정보출력
            final  int pos = position;
            iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    View dialogView = (View)View.inflate(mContext.getApplicationContext(), R.layout.dialog, null);
                    AlertDialog.Builder dlg  = new AlertDialog.Builder(mContext.getApplicationContext());
                    ImageView ivPost = dialogView.findViewById(R.id.ivPoster);
                    TextView  tvPost = dialogView.findViewById(R.id.tvpopup);
                    ivPost.setImageResource(posterID[pos]);
                    tvPost.setText(posterName[pos]);
                    dlg.setTitle(posterName[pos]);
                    dlg.setIcon(R.drawable.x);
                    dlg.setNegativeButton("닫기", null);
                    dlg.show();
                }
            });

            return view;
        }
    }//MyAapter class END


}//MainActivity class END


















