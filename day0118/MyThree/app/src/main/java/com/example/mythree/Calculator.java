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
        editText = findViewById(R.id.edit); //숫자 7~0, 수식 / X - +
        textView = findViewById(R.id.view);

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

    public  void cal(String op){
        switch (op){

        }//switch end
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
                //입력값을 가져와서 0크면 +, 0적으면 -
                String my = editText.getText().toString();
                value1 = Float.parseFloat(editText.getText().toString());
                if(value1>0){
                    editText.setText("+"+value1);
                }else if(value1<0){ editText.setText("-"+value1);}
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
        }//switch end
    }//end

    public void equal(View vw){

    }//end

}//class END