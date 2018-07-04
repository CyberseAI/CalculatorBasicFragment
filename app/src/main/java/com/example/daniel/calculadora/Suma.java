package com.example.daniel.calculadora;

import android.content.Context;
import android.os.Build;
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
import android.widget.Toast;

public class Suma extends Fragment
{
    EditText num1, num2;
    Button add;
    TextView rslt;
    Context root;
    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.suma, container, false);
        num1 = (EditText)v.findViewById(R.id.num1Sum);
        num2 = (EditText)v.findViewById(R.id.num2Sum);
        rslt = (TextView)v.findViewById(R.id.resAdd);
        add = (Button)v.findViewById(R.id.addBtn);
        add.setOnClickListener(new View.OnClickListener() {
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
                    rst=n1+n2;
                    rslt.setText(""+rst);
                }
            }
        });
        return v;
    }


}
