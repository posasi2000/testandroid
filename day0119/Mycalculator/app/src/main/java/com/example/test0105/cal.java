package com.example.test0105;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.util.StringTokenizer;

//숙제 : 사칙연산 제대로 나오도록, 결과값이 edittext에 나오고, 수식은 위의 textview에 표시되도록
//파일명: (이름)계산기숙제0106.zip
public class cal extends AppCompatActivity {
    EditText editText;
    TextView textView;
    String rule = "";
    float value1, value2;
    boolean check = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        editText = findViewById(R.id.edit);
        textView = findViewById(R.id.view);
        initialize(); // 초기화 함수 호출
        editText.setInputType(0); //자동으로 포커싱이 되도록
    }//end

    public void initialize() {
        rule = "";
        value1 = 0;
        value2 = 0;
        textView.setText("");
        editText.setText("");
        check = false;
    } //초기화를 위함

    public void calculate(String op) {
        Float answer = 0f;
        switch (op) {
            case "+":
                answer = value1 + value2;
                break;
            case "X":
                answer = value1 * value2;
                break;
            case "/":
                if (value2!=0) {
                    answer = value1 / value2;
                    break;
                }else{
                    editText.setText("0으로 나눌 수 없습니다");
                    return ;
                } // 0으로 나누는 경우 오류를 발생
            case "-":
                answer = value1 - value2;
                break;
        }
        editText.setText(String.valueOf(answer));
    } //계산작업

    public void num(View vw) {
        int a = vw.getId();
        Button c = findViewById(a);
        String str = c.getText().toString();
        editText.append(str);
    }//end

    //연산자 or 각종 기능 버튼들
    public void symbol(View vw) {
        int id = vw.getId();
        switch (id) {
            case R.id.btnLt://지우기
                String data = editText.getText().toString();
                editText.setText(data.substring(0, data.length() - 1)); //subString():문자열 추출
                break;
            case R.id.btnPoint://소수점 추가
                editText.append(".");
                break;
            case R.id.btnCE:
                initialize(); //입력란,결과값,연산자 초기화
                break;
            case R.id.btnSub:
                value1 = Float.parseFloat(editText.getText().toString());
                editText.append("-");
                break;
            case R.id.btnSum:
                value1 = Float.parseFloat(editText.getText().toString());
                editText.append("+");
                break;
            case R.id.btnDiv:
                value1 = Float.parseFloat(editText.getText().toString());
                editText.append("/");
                break;
            case R.id.btnMul:
                value1 = Float.parseFloat(editText.getText().toString());
                editText.append("X");
                break;
        }//end
    }

    public void equal(View vw) {
        String[] operator = {"+", "-", "X", "/"};
        String v = editText.getText().toString();
        int idx = 0;
        String op = ""; //찾은 연산자를 담는 변수
        for (String i : operator) {
            idx = v.indexOf(i);
            if (idx!=-1)//연산자를 찾은 경우 break
            {
                break;
            }
        }
        op = v.substring(idx, idx + 1);//연산자
        value2 = Float.parseFloat(v.substring(idx + 1));//두번째 value
        textView.setText(v);
        calculate(op);
    }//end
}//Cal class End