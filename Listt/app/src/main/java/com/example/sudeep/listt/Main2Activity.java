package com.example.sudeep.listt;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    int count=0;
    ArrayList<String> selection = new ArrayList<String>();
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    //TextView final_text;

    Mydb merodb;
    TextView result;
    String spinnerval1,spinnerval2,spinnerval3,spinnerval4,spinnerval5,spinnerval6,spinnerval7;
    String  output,output1;
    //SharedPreferences.Editor edit;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor edit;
    public static final String pref="mypref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        sharedPreferences=getSharedPreferences(pref, Context.MODE_PRIVATE);
        edit=sharedPreferences.edit();

       // CheckBox momo=(CheckBox)findViewById(R.id.checkBox);
        spinner = (Spinner) findViewById(R.id.spinner);
        //if (momo.isChecked()==true)
        //{

            //spinner.setVisibility(View.VISIBLE);
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ " selected", Toast.LENGTH_LONG).show();
                spinnerval1=parent.getItemAtPosition(position).toString();
                edit.putString("val1",spinnerval1);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spinner=(Spinner)findViewById(R.id.spinner2);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                              @Override
                                              public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                                  // Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ " selected", Toast.LENGTH_LONG).show();
                                                  spinnerval2=parent.getItemAtPosition(position).toString();
                                                  edit.putString("val2",spinnerval2);
                                              }

                                              @Override
                                              public void onNothingSelected(AdapterView<?> parent) {

                                              }
                                          });

        spinner=(Spinner)findViewById(R.id.spinner3);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ " selected", Toast.LENGTH_LONG).show();
                spinnerval3=parent.getItemAtPosition(position).toString();
                edit.putString("val3",spinnerval3);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner=(Spinner)findViewById(R.id.spinner4);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ " selected", Toast.LENGTH_LONG).show();
                spinnerval4=parent.getItemAtPosition(position).toString();
                edit.putString("val4",spinnerval4);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner=(Spinner)findViewById(R.id.spinner5);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ " selected", Toast.LENGTH_LONG).show();
                spinnerval5=parent.getItemAtPosition(position).toString();
                edit.putString("val5",spinnerval5);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner=(Spinner)findViewById(R.id.spinner6);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spinnerval6=parent.getItemAtPosition(position).toString();
                edit.putString("val6",spinnerval6);
                // Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ " selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

                // final_text= (TextView)findViewById(R.id.complete);
                //final_text.setEnabled(false);
                result=(TextView)findViewById(R.id.menutext);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
                merodb=new Mydb(this,null,null,1);
                printDatabase();

                //merodb.databaseToString();
                getSupportActionBar()

                .

                setDisplayHomeAsUpEnabled(true);

            }

    public void printDatabase(){
        String dbString = merodb.databaseToString();
        result.setText(dbString);


    }
    public void selectitem(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        switch ((view.getId()))
        {
            case R.id.checkBox:
                if(checked)
                {
                    selection.add("MOMO");
                    count++;
                    break;
                }
                else
                {
                    selection.remove("MOMO");
                }
                break;

            case R.id.checkBox2:
                if(checked)
                {
                    count++;
                    selection.add("Chowmin");
                }
                else
                {
                    selection.remove("Chowmin");
                }
                break;

            case R.id.checkBox3:
                if(checked)
                {
                    count++;
                    selection.add("Samosa");
                }
                else
                {
                    selection.remove("Samosa");
                }
                break;

            case R.id.checkBox4:
                if(checked)
                {
                    count++;
                    selection.add("Pakauda");
                }
                else
                {
                    selection.remove("Pakauda");
                }
                break;

            case R.id.checkBox5:
                if(checked)
                {
                    count++;
                    selection.add("Noodles");
                }
                else
                {
                    selection.remove("Noodles");
                }
                break;

            case R.id.checkBox6:
                if(checked)
                {
                    count++;
                    selection.add("Cold Drink");
                }
                else
                {
                    selection.remove("Cold Drink");
                }
                break;

        }
    }
        public void selectbutton(View view)
        {
           TextView tv=(TextView)findViewById(R.id.complete);
            CheckBox c1= (CheckBox)findViewById(R.id.checkBox);
            CheckBox chowmin= (CheckBox)findViewById(R.id.checkBox2);
            CheckBox pakauda= (CheckBox)findViewById(R.id.checkBox3);
            CheckBox samosa= (CheckBox)findViewById(R.id.checkBox4);
            CheckBox noodle= (CheckBox)findViewById(R.id.checkBox5);
            CheckBox ColdDrink= (CheckBox)findViewById(R.id.checkBox6);



            // switch()
            if(c1.isChecked() || chowmin.isChecked()|| pakauda.isChecked()||samosa.isChecked()||noodle.isChecked()||ColdDrink.isChecked())
                {
                        tv.setText("Your order has been received");
                 }


            String output="";
            for(String Selections: selection)
            {
                output= output + Selections + "\n";

            }
            for(int i=0;i<count;i++){
                output+='\n';
            }
            //final_text.setText(output);
            //final_text.setEnabled(true);
            output1=output;
           // SharedPreferences sharedPreferences=getSharedPreferences(pref, Context.MODE_PRIVATE);
             //SharedPreferences.Editor edit=sharedPreferences.edit();
            edit.putString("order", output);
            //edit.putString("value",spinnerval);
            edit.apply();

        }

}

