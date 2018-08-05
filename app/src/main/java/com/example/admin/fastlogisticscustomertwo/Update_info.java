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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Update_info extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_settings)
            startActivityForResult(new Intent(Settings.ACTION_SETTINGS),0);
        else {
            Intent in=new Intent(Update_info.this,Login.class);
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
        setContentView(R.layout.activity_update_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Update Information");
        toolbar.setSubtitle("FastLogistics");
        setSupportActionBar(toolbar);


        final EditText oldvalue=(EditText)findViewById(R.id.e1);
        final EditText newvalue=(EditText)findViewById(R.id.e2);
        Spinner sp=(Spinner)findViewById(R.id.spinner3);
        String str[] = {"Name", "Address","Mobno","organization","emailS"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, str);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    oldvalue.setText("sowjanya");

                }
                else if (i==1){
                    oldvalue.setText("kudrebettu");
                }
                else if (i==2){
                    oldvalue.setText("8105490956");
                }
                else if (i==3){
                    oldvalue.setText("VCET");
                }
                else if (i==4){
                    oldvalue.setText("sowjanya.oct06@gmail.com");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        Button btn=(Button) findViewById(R.id.b7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (oldvalue.getText().toString().isEmpty())
                    oldvalue.setError("please enter old value");
                else if(newvalue.getText().toString().isEmpty())
                    newvalue.setError("please fill this");
                else
                {

                    Intent in = new Intent(Update_info.this,Success.class);
                    startActivity(in);
                }
            }
        });
            }

    }


