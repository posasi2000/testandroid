package com.example.test0105;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements CompoundButton.OnCheckedChangeListener {
    TextView tv1, tv2,tv3;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    LinearLayout LL;
    RadioGroup rbGroup;
    ToggleButton toggleBtn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = findViewById(R.id.checkbox1);
        cb2 = findViewById(R.id.checkbox2);
        cb3 = findViewById(R.id.checkbox3);
        cb4 = findViewById(R.id.checkbox4);
        cb5 = findViewById(R.id.checkbox5);
        tv1 = findViewById(R.id.tv1);//체크박스 출력결과
        LL = findViewById(R.id.checkboxLinear);

        cb1.setOnCheckedChangeListener(this);
        cb2.setOnCheckedChangeListener(this);
        cb3.setOnCheckedChangeListener(this);
        cb4.setOnCheckedChangeListener(this);
        cb5.setOnCheckedChangeListener(this);
        tv2 = findViewById(R.id.tv2); // 라디오버튼 출력결과
        rbGroup=findViewById(R.id.rdGroup);
        toggleBtn1=findViewById(R.id.toggleBtn1);
        tv3 = findViewById(R.id.tv3);//체크박스 출력결과
        toggleBtn1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean flag) {
                if(flag==true){
                  tv3.setText("피자 커피 사과 도너츠");
                }else{
                    tv3.setText("pizza coffee apple donuts");
                }
            }
        });
        rbGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                if(id==R.id.rbMan){
                    tv2.setText("남자");
                }else{
                    tv2.setText("여자");
                }
            }
        });
    }//end

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        String message = "";
        if (cb1.isChecked()) {
            message += "red,";
        }
        if (cb2.isChecked()) {
            message += "yellow,";
        }
        if (cb3.isChecked()) {
            message += "blue,";
        }
        if (cb4.isChecked()) {
            message += "green,";
        }
        if (cb5.isChecked()) {
            message += "orange,";
        }
        tv1.setText(message);
    }

}//MainActivity class End