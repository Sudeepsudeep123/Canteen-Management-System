package com.example.sudeep.listt;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Orders extends AppCompatActivity {
SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(Orders.this,MainActivity.class));

            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        sharedPreferences=getSharedPreferences("mypref", Context.MODE_PRIVATE);
        String op=sharedPreferences.getString("order",null);
        String plates1=sharedPreferences.getString("val1",null);
        String plates2=sharedPreferences.getString("val2",null);
        String plates3=sharedPreferences.getString("val3",null);
        String plates4=sharedPreferences.getString("val4",null);
        String plates5=sharedPreferences.getString("val5",null);
        String plates6=sharedPreferences.getString("val6",null);



        //Toast.makeText(this,op,Toast.LENGTH_LONG).show();
        TextView tv=(TextView)findViewById(R.id.textView5);
        TextView tv1=(TextView)findViewById(R.id.torder);

        tv.setText(op);
        tv1.setText(plates1+"\n"+plates2+"\n"+plates3+"\n"+plates4+"\n"+plates5+"\n"+plates6+"\n");
    }

}
