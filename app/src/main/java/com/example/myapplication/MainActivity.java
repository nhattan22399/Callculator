package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer so1 = 0;
    Integer so2 = 0;
    Character dau = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txtkq = (TextView) findViewById(R.id.KQ);
        Button btn0 = (Button) findViewById(R.id.btn0); btn0.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { txtkq.setText(txtkq.getText().toString() + "0"); if (dau == null) { so1 = Integer.parseInt(txtkq.getText().toString()); } else { so2 = Integer.parseInt(txtkq.getText().toString());}}});
        Button btn1 = (Button) findViewById(R.id.btn1); btn1.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { txtkq.setText(txtkq.getText().toString() + "1"); if (dau == null) { so1 = Integer.parseInt(txtkq.getText().toString()); } else { so2 = Integer.parseInt(txtkq.getText().toString());}}});
        Button btn2 = (Button) findViewById(R.id.btn2); btn2.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { txtkq.setText(txtkq.getText().toString() + "2"); if (dau == null) { so1 = Integer.parseInt(txtkq.getText().toString()); } else { so2 = Integer.parseInt(txtkq.getText().toString());}}});
        Button btn3 = (Button) findViewById(R.id.btn3); btn3.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { txtkq.setText(txtkq.getText().toString() + "3"); if (dau == null) { so1 = Integer.parseInt(txtkq.getText().toString()); } else { so2 = Integer.parseInt(txtkq.getText().toString());}}});
        Button btn4 = (Button) findViewById(R.id.btn4); btn4.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { txtkq.setText(txtkq.getText().toString() + "4"); if (dau == null) { so1 = Integer.parseInt(txtkq.getText().toString()); } else { so2 = Integer.parseInt(txtkq.getText().toString());}}});
        Button btn5 = (Button) findViewById(R.id.btn5); btn5.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { txtkq.setText(txtkq.getText().toString() + "5"); if (dau == null) { so1 = Integer.parseInt(txtkq.getText().toString()); } else { so2 = Integer.parseInt(txtkq.getText().toString());}}});
        Button btn6 = (Button) findViewById(R.id.btn6); btn6.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { txtkq.setText(txtkq.getText().toString() + "6"); if (dau == null) { so1 = Integer.parseInt(txtkq.getText().toString()); } else { so2 = Integer.parseInt(txtkq.getText().toString());}}});
        Button btn7 = (Button) findViewById(R.id.btn7); btn7.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { txtkq.setText(txtkq.getText().toString() + "7"); if (dau == null) { so1 = Integer.parseInt(txtkq.getText().toString()); } else { so2 = Integer.parseInt(txtkq.getText().toString());}}});
        Button btn8 = (Button) findViewById(R.id.btn8); btn8.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { txtkq.setText(txtkq.getText().toString() + "8"); if (dau == null) { so1 = Integer.parseInt(txtkq.getText().toString()); } else { so2 = Integer.parseInt(txtkq.getText().toString());}}});
        Button btn9 = (Button) findViewById(R.id.btn9); btn9.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { txtkq.setText(txtkq.getText().toString() + "9"); if (dau == null) { so1 = Integer.parseInt(txtkq.getText().toString()); } else { so2 = Integer.parseInt(txtkq.getText().toString());}}});

        Button btncong = (Button) findViewById(R.id.btncong);
        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '+';
                txtkq.setText("");
            }
        });
        Button btntru = (Button) findViewById(R.id.btntru);
        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '-';
                txtkq.setText("");

            }
        });
        Button btnnhan = (Button) findViewById(R.id.btnnhan);
        btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '*';
                txtkq.setText("");
            }
        });
        Button btnchia = (Button) findViewById(R.id.btnchia);
        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dau = '/';
                txtkq.setText("");
            }
        });
        Button bang = (Button) findViewById(R.id.btnKq);
        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dau != null){
                    Integer Ketqua =0;
                    switch (dau){
                        case '+': Ketqua = so1 + so2; break;
                        case '-': Ketqua = so1 - so2; break;
                        case '*': Ketqua = so1 * so2; break;
                        case '/': Ketqua = so1 / so2; break;
                    }
                    txtkq.setText(Ketqua.toString());
                    so1 = Ketqua;
                    dau = null;
                }

            }
        });

        Button xoa = (Button) findViewById(R.id.btnC);
        xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so1 = 0;
                so2 = 0;
                dau = null;
                txtkq.setText("");
            }
        });

        ;}
}