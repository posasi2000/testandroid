package com.example.myapplication;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button btn1, btn2, btn3, btn4, btn5;
    ImageView iv ;
    TextView tv ;
    int[] images = {
            R.drawable.avocado,  R.drawable.apple, R.drawable.lemon,
            R.drawable.melon,  R.drawable.corgi,  R.drawable.aaa
    } ;
    int cnt = 0 ;

    public void onCreate(Bundle savedInstanceState) {
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
                tv.setText("버튼1 + 기린 이미지 ");
                //정석권장 iv.setImageResource(R.drawable.bt);
                iv.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.bc));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tv.setText("버튼2 + time이미지 ");
                iv.setImageResource(R.drawable.d22);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tv.setText("버튼3 + house 이미지 ");
                iv.setImageResource(R.drawable.d33);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tv.setText("버튼4 + close ");
                //Toast위젯은 팝업(Activity대상, 안내문, 시간) show()
                //Toast tt = Toast.makeText(1,2,3)
                Toast tt = Toast.makeText(getApplicationContext(), "프로그램닫기", Toast.LENGTH_LONG);
                tt.show();
                finish(); //프로그램닫기
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                tv.setText("버튼 클릭ClickListener  ");
                iv.setImageResource(images[cnt]);
                cnt++;
                if(cnt==6){ cnt=0;}
            }
        });


        //setOnTouch리스너대신 위에 있는 setOnClick리스너권장
//        btn5.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                tv.setText("~~~ setOnTouchListener");
//                iv.setImageResource(images[cnt]);
//                cnt++;
//                if(cnt==6){ cnt=0;}
//                return false;
//            }
//        });
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




