package com.example.eunhan.csc201_ch1113_app;

import android.app.TabActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MainActivity extends TabActivity implements View.OnClickListener {

    private EditText input1;
    private EditText input2;
    private EditText input3;
    private EditText input4;
    private EditText input5;
    private EditText input6;
    private EditText input7;
    private EditText input8;
    private EditText input9;
    private EditText input10;
    private TextView answer;
    private Button resultbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TabHost tabHost = getTabHost();
        LayoutInflater.from(this).inflate(R.layout.tab, tabHost.getTabContentView(), true);

        tabHost.addTab(tabHost.newTabSpec("input")
                .setIndicator("input")
                .setContent(R.id.view1));
        tabHost.addTab(tabHost.newTabSpec("result")
                .setIndicator("result")
                .setContent(R.id.view2));


        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        input3 = (EditText) findViewById(R.id.input3);
        input4 = (EditText) findViewById(R.id.input4);
        input5 = (EditText) findViewById(R.id.input5);
        input6 = (EditText) findViewById(R.id.input6);
        input7 = (EditText) findViewById(R.id.input7);
        input8 = (EditText) findViewById(R.id.input8);
        input9 = (EditText) findViewById(R.id.input9);
        input10 = (EditText) findViewById(R.id.input10);

        answer = (TextView) findViewById(R.id.answer);
        resultbtn = (Button) findViewById(R.id.resultbtn);
        resultbtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (chknum(input1) && chknum(input2) && chknum(input3) && chknum(input4) && chknum(input5) && chknum(input6) && chknum(input7) && chknum(input8) && chknum(input9) && chknum(input10)) {

            answer.setText(removeDuplicate(
                    Integer.parseInt(input1.getText().toString()),
                    Integer.parseInt(input2.getText().toString()),
                    Integer.parseInt(input3.getText().toString()),
                    Integer.parseInt(input4.getText().toString()),
                    Integer.parseInt(input5.getText().toString()),
                    Integer.parseInt(input6.getText().toString()),
                    Integer.parseInt(input7.getText().toString()),
                    Integer.parseInt(input8.getText().toString()),
                    Integer.parseInt(input9.getText().toString()),
                    Integer.parseInt(input10.getText().toString())


            ));

        } else {
            answer.setText("please make sure you put the ten integers on the input tab");
        }


    }

    public static int converto(EditText temp) {
        int contemp = 0;


        return contemp;
    }

    public static boolean chknum(EditText temp) {
        try {
            Integer.parseInt(temp.getText().toString());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static String removeDuplicate(int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10) {
        String prt = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        list.add(a6);
        list.add(a7);
        list.add(a8);
        list.add(a9);
        list.add(a10);

        List<Integer> distinctlist = new ArrayList<Integer>(new HashSet<Integer>(list));
        for (Integer i : distinctlist) {
            prt += i + " ";
        }

        return prt;
    }

}
