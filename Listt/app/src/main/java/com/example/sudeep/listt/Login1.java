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
import android.widget.Toast;

public class Login1 extends AppCompatActivity {



    Databasehelper helper=new Databasehelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
/*

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this, MainActivity.class));
            }
        });
*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    public void login(View view)
    {
        EditText a = (EditText) findViewById(R.id.uname);
        String str = a.getText().toString();
        EditText b = (EditText) findViewById(R.id.pw);
        String pass = b.getText().toString();

        String password = helper.searchpass(str);
        if (pass.equals(password))
        {
            startActivity(new Intent(Login1.this,Main2Activity.class));
        }
        else
        {
            Toast.makeText(Login1.this, "Username and Passwords don't match", Toast.LENGTH_SHORT).show();
        }
    }
    public void toregister(View view)
    {
        startActivity(new Intent(Login1.this, SignupActivity.class));
    }

}

