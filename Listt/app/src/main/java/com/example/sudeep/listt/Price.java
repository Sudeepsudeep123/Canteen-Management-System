package com.example.sudeep.listt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

import static java.lang.Integer.parseInt;

public class Price extends AppCompatActivity {

    EditText buckysInput,priceInput;
    TextView buckyText;
    Mydb dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);
        buckysInput = (EditText) findViewById(R.id.editText7);
        priceInput=(EditText)findViewById(R.id.editText8);
        buckyText = (TextView) findViewById(R.id.textView7);
        dbHandler = new Mydb(this, null, null, 1);
        printDatabase();



    /*    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    */
    }
            //add product to db
    public  void addButtonClicked(View view){
        int price= Integer.parseInt(priceInput.getText().toString());
        String foodname=buckysInput.getText().toString();
        Food food=new Food(foodname,price);
        dbHandler.addProduct(food);
        printDatabase();
    }
    //delete

    public void deleteButtonClicked(View view){
        String inputText= buckysInput.getText().toString();
        dbHandler.deleteProduct(inputText);
        printDatabase();

    }


    public void printDatabase(){
        String dbString = dbHandler.databaseToString();
        buckyText.setText(dbString);
        buckysInput.setText("");
        priceInput.setText("");

    }

    public void orderr(View view){
        TextView tv=(TextView)findViewById(R.id.order);
        Intent intent= new Intent(Price.this, Orders.class);
        startActivity(intent);
    }

}
