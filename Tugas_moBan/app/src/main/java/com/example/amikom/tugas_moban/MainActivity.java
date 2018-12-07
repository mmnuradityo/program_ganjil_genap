package com.example.amikom.tugas_moban;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnPros;
    private EditText input, output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findID();
        initListener();
    }

    private void findID(){
        btnPros = (Button) findViewById(R.id.button_Ok);
        input = (EditText) findViewById(R.id.eT_input);
        output = (EditText) findViewById(R.id.editText2);
    }

    private void initListener(){
        btnPros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(input.getText().toString());
                if (n % 2 == 0){
                    output.setText("genap");
                }else{
                    output.setText("ganjil");
                }
            }
        });
    }
}
