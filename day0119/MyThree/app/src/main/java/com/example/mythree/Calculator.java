package com.example.mythree;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends Activity {
    EditText editText ;
    TextView textView ;
    String rule= "";
    float  value1, value2;
    boolean check = false ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        editText = findViewById(R.id.edittext1); //숫자 7~0, 수식 / X - +
        textView = findViewById(R.id.textview1);

        //initialize()메소드호출
        initialize();
    }//end

    public void initialize(){
        editText.setText(""); //입력란초기화
        textView.setText(""); //수식데이터 초기화
        editText.setInputType(0); //자동으로 초점지정
        check=false;
        rule= "";
        value1 = 0;
        value2 = 0;
    }//end

    public  void mycal(String op){
        Float ret = 0f;
        switch (op){
            case "+":
                ret = value1+value2;
                break;
            case "-":
                ret = value1-value2;
                break;
            case "X":
                ret = value1*value2;
                break;
            case "/":
                if(value2 != 0) { ret = value1 / value2;}
                else{ editText.setText("0으로 나눌수 없습니다");}
                break;
        }//switch end
        editText.setText(String.valueOf(ret));
    }//end

    public void num(View vw){
      //7 ~ 0 숫자클릭이벤트 xml문서명시  Onclick="num" 숫자id접근 getId()
      int a = vw.getId();
      Button c = findViewById(a);
      String str = c.getText().toString();
      editText.append(str);
    }//end

    public void symbol(View vw){
        //연산 / x - + 이벤트 xml문서명시
        int id=vw.getId();
        switch (id){ //아직 계산처리 아니고
            case R.id.btnCE:
                initialize();
                break;
            case R.id.btnLt: //editText입력란 숫자연산기호 맨뒤쪽에서 하나씩 지우기
                String data = editText.getText().toString();
                editText.setText(data.substring(0, data.length()-1));
                break;
            case R.id.btnWhole:
                //그냥 숫자일때 버튼누르면 -숫자
                String my = editText.getText().toString();
                if(my.charAt(0)=='+'){editText.setText("-"+my.substring(1,my.length()));}
                else if(my.charAt(0)=='-'){editText.setText("+"+my.substring(1,my.length())); }
                else{editText.setText("-"+ editText.getText().toString()); }
                break;
            case R.id.btnDiv:
                value1 = Float.parseFloat(editText.getText().toString());
                editText.append("/");
                break;
            case R.id.btnMul:
                value1 = Float.parseFloat(editText.getText().toString());
                editText.append("X");
                break;
            case R.id.btnSub:
                value1 = Float.parseFloat(editText.getText().toString());
                editText.append("-");
                break;
            case R.id.btnSum:
                value1 = Float.parseFloat(editText.getText().toString());
                editText.append("+");
                break;
            case R.id.btnPoint:
                editText.append(".");
                break;
        }//switch end
    }//end

    public void equal(View vw){
        //숫자 연산자 숫자
        String[] operator = {"+", "-", "X", "/"};
        String my = editText.getText().toString();
        int idx = 0 ;
        String op = "" ;
        for( String i: operator){
            idx = my.indexOf(i);
            if(idx != -1){ break;}
        }
        op = my.substring(idx, idx+1);
        value2 = Float.parseFloat(my.substring(idx+1));  // 78x2300
        textView.setText(my);
        mycal(op); //실제계산
    }//end

}//Calculator class END






