package com.example.admin.fastlogisticscustomertwo;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class New_order extends AppCompatActivity {
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_settings)
            startActivityForResult(new Intent(Settings.ACTION_SETTINGS),0);
        else {
            Intent in=new Intent(New_order.this,Login.class);
            startActivity(in);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_login,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("New Order");
        toolbar.setSubtitle("FastLogistics");
        setSupportActionBar(toolbar);
        Spinner sp = (Spinner) findViewById(R.id.spinner);
        String str[] = {"Payment", "Parcel"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, str);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(final AdapterView<?> adapterView, final View view, final int i, long l) {
                Button btn = (Button) findViewById(R.id.b2);
                btn.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        if (i==0) {
                            Intent in = new Intent(New_order.this, Payment.class);
                            startActivity(in);
                        } else {
                            Intent in = new Intent(New_order.this, Parcel.class);
                            startActivity(in);
                        }

                    }
                });
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
    }
}










