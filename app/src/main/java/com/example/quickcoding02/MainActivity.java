package com.example.quickcoding02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



class BinarySearch
{
    static int count=0;
    static int s,e;
    public int H_cal()//high call
    {
        if(count == 0)
        {
            s = 1;
            e = 100;
            return (s+e)/2;
        }
        else
        {
            s = (s+e)/2;
            return (s+e)/2;
        }
    }
    public int L_cal()
    {
        if(count == 0)
        {
            s=1;
            e=100;
            return (s+e)/2;
        }
        else
        {
            e=(s+e)/2;
            return (s+e)/2;
        }
    }
}


public class MainActivity extends AppCompatActivity {

    static int answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final BinarySearch Bs = new BinarySearch();
        final EditText editText = (EditText)findViewById(R.id.editText);
        final EditText editText2 = (EditText)findViewById(R.id.editText2);
        Button Send = (Button)findViewById(R.id.button4);
        Button Bigger = (Button)findViewById(R.id.button);
        Button Smaller = (Button)findViewById(R.id.button2);
        Button Bingo = (Button)findViewById(R.id.button3);
        //int answer = Integer.parseInt(String.valueOf(editText.getText()));
        Send.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Bs.count =0;
                answer = Integer.parseInt(String.valueOf(editText.getText()));
                editText2.setText("Your Number is" + Bs.H_cal());
                Bs.count++;
            }
        });

        Bigger.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                editText2.setText("Your Number is  " + Bs.H_cal());
                Bs.count++;
            }
        });
        Smaller.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                editText2.setText("Your Number is  " + Bs.L_cal());
                Bs.count++;
            }
        });
        Bingo.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                editText2.setText("Count is  " + Bs.count);
            }
        });





    }
}
