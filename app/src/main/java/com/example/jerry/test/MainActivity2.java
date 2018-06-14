package com.example.jerry.test;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button btn1,btn2,btn3,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test4);

        btn1 = (Button)findViewById(R.id.button1);//버튼 객체 만들기
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn5 = (Button)findViewById(R.id.button5);
        btn6 = (Button)findViewById(R.id.button6);
        final TextView tv = (TextView)findViewById(R.id.editText1);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //이곳에 버튼을 눌렀을때 동작 설정
                switch (v.getId()){
                    case R.id.button1:
                        btn1.setText("눌러짐");
                        break;
                    case R.id.button2:
                        Toast.makeText(MainActivity2.this,"꺄르르르륽",Toast.LENGTH_SHORT).show();
                        //makeText는 Toast 클래스의 static 메소드이다.
                        break;
                }
            }
        };
        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setBackgroundColor(Color.GREEN);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("text",String.valueOf(tv.getText()));
                startActivity(intent);
                finish();//intent후에 MainActivity2를 종료하고 싶을때 finish 사용
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,PopupActivity.class);
                startActivity(intent);
                finish();//intent후에 MainActivity2를 종료하고 싶을때 finish 사용
            }
        });

    }
    public void f1(){
        Button btn4 = (Button)findViewById(R.id.button4);
        btn4.setVisibility(View.INVISIBLE);
    }
}
