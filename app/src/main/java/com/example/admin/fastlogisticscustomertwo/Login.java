package com.example.admin.fastlogisticscustomertwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    String uname,psswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Login");
        toolbar.setSubtitle("FastLogistics");
        Button btn=(Button) findViewById(R.id.b2);
        final EditText username=(EditText)findViewById(R.id.ed1);
        final EditText password=(EditText)findViewById(R.id.ed2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               uname=username.getText().toString();
               psswd=password.getText().toString();
               if(uname.isEmpty())
                   Toast.makeText(getApplicationContext(),"inavlid useranme",Toast.LENGTH_LONG).show();
               else if(psswd.isEmpty())
                   Toast.makeText(getApplicationContext(),"invalid password",Toast.LENGTH_LONG).show();
               else if(uname.isEmpty()&&psswd.isEmpty())
                   Toast.makeText(getApplicationContext(),"inavlid useranme and password",Toast.LENGTH_LONG).show();
               else {


                   Intent in = new Intent(Login.this, HomePage.class);
                   startActivity(in);
               }

            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
