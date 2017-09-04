package com.example.sudeep.listt;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    // EditText input, pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void login(View view) {
        EditText user = (EditText) findViewById(R.id.uname);
        EditText pass = (EditText) findViewById(R.id.pw);
        if (user.getText().toString().equals("sudeep") && pass.getText().toString().equals("admin")) {
            // if (user.getText().toString().equals(pass.getText().toString())) {
            Intent intent = new Intent(Login.this, Price.class);
            startActivity(intent);
        }
         else
        {
            AlertDialog alert=new AlertDialog.Builder(Login.this).create();
            alert.setTitle("Message");
            alert.setMessage("Please enter the valid username and password.");
           // alert.setMessage;
            alert.setIcon(R.drawable.denied);
            alert.show();
            /*Dialog dialog=new Dialog(this);
            dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            dialog.setContentView(getLayoutInflater().inflate(R.layout.gandalf,null));
            dialog.show();*/
        }
    }
}
