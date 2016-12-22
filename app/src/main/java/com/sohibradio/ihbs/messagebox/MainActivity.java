package com.sohibradio.ihbs.messagebox;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1, btn2, btn3, btn4;
    Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.msg1);
        btn1.setOnClickListener(this);
        btn2=(Button)findViewById(R.id.msg2);
        btn2.setOnClickListener(this);
        btn3=(Button)findViewById(R.id.msg3);
        btn3.setOnClickListener(this);
        btn4=(Button)findViewById(R.id.msg4);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==btn1){
            //Menampilkan Toast Lenglong
            Toast.makeText(getApplicationContext(), "Ini Toast Leng Long",
                    Toast.LENGTH_LONG).show();
        }else if (v==btn2){
            //Menampilkan Toast Lenglong
            Toast.makeText(getApplicationContext(), "Ini Toast Leng Short",
                    Toast.LENGTH_SHORT).show();
        }else if (v==btn3){
            AlertDialog.Builder alert1 = new AlertDialog.Builder(context);
            alert1.setTitle("Pesan Masuk");
            alert1.setMessage("Google Developer");

            alert1.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            }).show();

        }else if (v==btn4) {
            AlertDialog.Builder alert2 = new AlertDialog.Builder(context);
            alert2.setTitle("WARNING");
            alert2.setMessage("Are You Sure");
            alert2.setIcon(R.drawable.android);
            alert2.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(), "Anda memilih No",
                            Toast.LENGTH_SHORT).show();


                }
            });
            alert2.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            alert2.show();
        }
    }
}
