package com.example.samsung.detectarfragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

final static String mensaje="PORT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DetailFragment fragmentB= (DetailFragment) getFragmentManager().findFragmentById(R.id.fragmentB_id);
        TextView tx1= (TextView) findViewById(R.id.textView);
/*
        if(fragmentB==null||!fragmentB.isInLayout()){
            tx1.setText("PORT");
        }else{
            tx1.setText("LAND");
        }



        if(getResources().getBoolean(R.bool.dual_panel)){
            tx1.setText("LAND");
        }else{
            tx1.setText("PORT");
        }
*/
    }

    public void onClick(View view){

        DetailFragment fragmentB= (DetailFragment) getFragmentManager().findFragmentById(R.id.fragmentB_id);
        TextView tx1= (TextView) findViewById(R.id.textView);

        if(fragmentB==null||!fragmentB.isInLayout()){

            Intent a2=new Intent(this,Activity2.class);
            startActivity(a2);
        }else{
            tx1.setText("LAND");
        }
    }
}
