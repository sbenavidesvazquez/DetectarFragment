package com.example.samsung.detectarfragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by samsung on 25/11/2015.
 */
public class Activity2 extends MainActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        getIntent();
        TextView tx1= (TextView) findViewById(R.id.textView);
        tx1.setText("PORT");
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode==1){
            if(resultCode== Activity.RESULT_OK){
                String mensaje = data.getStringExtra(MainActivity.mensaje);
                TextView edtmensaje = (TextView) findViewById(R.id.textView);
                edtmensaje.setText(mensaje);
            }
        }
    }
}
