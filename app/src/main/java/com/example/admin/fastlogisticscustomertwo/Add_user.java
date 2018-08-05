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

public class Add_user extends AppCompatActivity {
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_settings)
            startActivityForResult(new Intent(Settings.ACTION_SETTINGS),0);
        else {
            Intent in=new Intent(Add_user.this,Login.class);
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
        setContentView(R.layout.activity_add_user);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Add User");
        toolbar.setSubtitle("FastLogistics");
        setSupportActionBar(toolbar);

        Button btn=(Button) findViewById(R.id.b3);
        final EditText name=(EditText) findViewById(R.id.editText2);
        final EditText address=(EditText) findViewById(R.id.editText3);
        final EditText Email=(EditText) findViewById(R.id.editText4);
        final EditText Mobno=(EditText) findViewById(R.id.editText5);
        final EditText Organization=(EditText) findViewById(R.id.editText6);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().isEmpty())
                    name.setError("please enter name");
                else if (address.getText().toString().isEmpty())
                    address.setError("please enter address");
                else if (Email.getText().toString().isEmpty())
                    Email.setError("please enter email");
                else if (Mobno.getText().toString().isEmpty())
                    Mobno.setError("please enter mobile no");
                else if (Organization.getText().toString().isEmpty())
                    Organization.setError("please enter organization");
                else {

                    Intent in = new Intent(Add_user.this, Success.class);
                    startActivity(in);

                }
            }
        });
            }
    }







