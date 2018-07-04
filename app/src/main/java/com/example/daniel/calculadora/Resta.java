package com.example.daniel.calculadora;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Resta extends Fragment
{
    EditText num1, num2;
    TextView rslt;
    Button sub;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.resta, container, false);
        num1 = (EditText)v.findViewById(R.id.num1R);
        num2 = (EditText)v.findViewById(R.id.num2R);
        rslt = (TextView)v.findViewById(R.id.rsltR);
        sub = (Button)v.findViewById(R.id.subBtn);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(num1.getText().toString()) || TextUtils.isEmpty(num2.getText().toString()))
                {
                    rslt.setText(">:v");
                }
                else
                {
                    int n1 = Integer.parseInt(num1.getText().toString());
                    int n2 = Integer.parseInt(num2.getText().toString());
                    int rst =0;
                    rst=n1-n2;
                    rslt.setText(""+rst);

                }
            }
        });
        return v;
    }
}
