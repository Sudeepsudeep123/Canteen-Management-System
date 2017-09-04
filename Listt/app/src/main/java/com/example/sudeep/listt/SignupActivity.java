package com.example.sudeep.listt;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {
    Databasehelper helper = new Databasehelper(this);

    EditText email, Password, Name, Confirm, Uname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        email = (EditText) findViewById(R.id.email);
        Password = (EditText) findViewById(R.id.pw);
        Confirm = (EditText) findViewById(R.id.confirm);
        //    regbutton=(Button)findViewById(R.id.regbutton);
        Name = (EditText) findViewById(R.id.name);
        Uname = (EditText) findViewById(R.id.uname);


    }

    public void regbutton(View view) {
        String struname = Uname.getText().toString();
        String stremail = email.getText().toString();
        String strpw = Password.getText().toString();
        String strname = Name.getText().toString();
        String strconfrim = Confirm.getText().toString();
        if (!strpw.equals(strconfrim))
        {
            Toast.makeText(SignupActivity.this, "Passwords don't match", Toast.LENGTH_SHORT).show();
        } else
        {

            Contact1 r = new Contact1();
            r.setUname(struname);
            r.setName(strname);
            r.setEmail(stremail);
            r.setPassword(strpw);
            helper.insertContact(r);
            startActivity(new Intent(SignupActivity.this,Login1.class));
        }
    }

    // public void printData() {
    //   EditText tv=(EditText)findViewById(R.id.textView3)
    //         tv.setText(strna);

}



