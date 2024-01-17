package com.example.mythree;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends Activity {
    TextView tv1 ;
    EditText et1 ;
    Button bt1 ;

    EditText editText ;
    TextView textView ;
    String rule= "";
    float  value1, value2;
    boolean check = false ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }//end

    public void initialize(){
        //변수초기화
    }//end

    public  void cal(String op){
        switch (op){

        }//switch end
    }//end

    public void num(View vw){

    }//end

    public void symbol(View vw){
        int id=vw.getId();
        switch (id){

        }//switch end
    }//end

    public void equal(View vw){

    }//end

}//class END