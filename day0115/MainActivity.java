package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button btn1, btn2, btn3, btn4, btn5;
    ImageView iv ;
    TextView tv ;
    int[] images = {  R.drawable.cake1, R.drawable.cake2, R.drawable.cake3} ;
    int cnt = 0 ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //컴포넌트위젯 연결 findViewById()
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        tv = findViewById(R.id.textview1) ;
        iv = findViewById(R.id.imageview1);

        //버튼이벤트처리 btn1.setOnClickListener(new View.OnClickListener(onClick(){}));
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tv.setText("버튼1 + btn 이미지 ");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tv.setText("버튼2 + time이미지 ");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tv.setText("버튼3 + house 이미지 ");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tv.setText("버튼4 + close ");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tv.setText("버튼4 + 배열응용 ");
            }
        });
    }//onCreae end
}//class END


//첫번째 초간단 이미지 변경
/*
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends Activity {
    ArrayList  list ;
    Date wdate ;
    Button button1, button2, button3, button4, button5;
    ImageView myiv7;
    TextView mytv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytv7 = findViewById(R.id.textview7);
        button1 = findViewById(R.id.btn1);
        myiv7 = findViewById(R.id.imageview7);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                myiv7.setImageResource(R.drawable.a3);
                mytv7.setText("up image 변경");
            }
        });
    }
}//class END
 */




