package com.example.admin.fastlogisticscustomertwo;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Parcel extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_settings)
            startActivityForResult(new Intent(Settings.ACTION_SETTINGS),0);
        else {
            Intent in=new Intent(Parcel.this,Login.class);
            startActivity(in);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_login,menu);
        return super.onCreateOptionsMenu(menu);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcel);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Parcel");
        toolbar.setSubtitle("FastLogistics");
        setSupportActionBar(toolbar);
        Button btn=(Button) findViewById(R.id.b5);
        final EditText name=(EditText)findViewById(R.id.e1);
        final EditText address=(EditText) findViewById(R.id.e2);
        final EditText Mobno=(EditText) findViewById(R.id.e3);
        final EditText countrycode=(EditText) findViewById(R.id.e13);
        final EditText Height=(EditText) findViewById(R.id.e4);
        final EditText Breadth=(EditText) findViewById(R.id.e5);
        final EditText length=(EditText)findViewById(R.id.e6);
        final EditText weight=(EditText) findViewById(R.id.e7);
        final EditText time=(EditText) findViewById(R.id.e8);
        final EditText dd=(EditText) findViewById(R.id.e9);
        final EditText destination=(EditText) findViewById(R.id.e10);
        final EditText receivername=(EditText) findViewById(R.id.e11);
        final EditText mobno=(EditText) findViewById(R.id.e12);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().isEmpty())
                    name.setError("enter name");
                else if(address.getText().toString().isEmpty())
                    address.setError("enter address");
                else if(Mobno.getText().toString().isEmpty())
                    Mobno.setError("enter mobno");
                else if(countrycode.getText().toString().isEmpty())
                    countrycode.setError("enter countrycode");
                else if(Height.getText().toString().isEmpty())
                    Height.setError("enter height");
                else if(Breadth.getText().toString().isEmpty())
                    Breadth.setError("enter breadth");
                else if(length.getText().toString().isEmpty())
                    length.setError("enter length");
                else if(weight.getText().toString().isEmpty())
                    weight.setError("enter weight");
                else if(time.getText().toString().isEmpty())
                    time.setError("enter time");
                else if(dd.getText().toString().isEmpty())
                    dd.setError("enter date month year");
                else if(destination.getText().toString().isEmpty())
                    destination.setError("enter destination");
                else if(receivername.getText().toString().isEmpty())
                    receivername.setError("enter receivername");
                else if(mobno.getText().toString().isEmpty())
                    mobno.setError("enter mobileno");
                else {


                    Intent in = new Intent(Parcel.this, Success.class);
                }

            }
        });
            }

    }


