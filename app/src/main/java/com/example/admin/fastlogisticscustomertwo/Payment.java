package com.example.admin.fastlogisticscustomertwo;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Payment extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_settings)
            startActivityForResult(new Intent(Settings.ACTION_SETTINGS),0);
        else {
            Intent in=new Intent(Payment.this,Login.class);
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
        setContentView(R.layout.activity_payment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Payment");
        toolbar.setSubtitle("FastLogistics");
        setSupportActionBar(toolbar);
        Button btn=(Button)findViewById(R.id.b1);
        Spinner sp=(Spinner)findViewById(R.id.sp1);
        String str[] = {"cash", "card"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, str);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
        Spinner sp1=(Spinner)findViewById(R.id.sp2);
        String str1[] = {"Dollar", "Rupees"};
        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, str1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adapter1);
        final EditText name=(EditText)findViewById(R.id.e1);
        final EditText address=(EditText)findViewById(R.id.e2);
        final EditText mobno=(EditText)findViewById(R.id.e3);
        final EditText countrycode=(EditText)findViewById(R.id.e4);
        final EditText amount=(EditText)findViewById(R.id.e5);
        final EditText receivername=(EditText)findViewById(R.id.e6);
        final EditText receiverphoneno=(EditText)findViewById(R.id.e7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().isEmpty())
                    name.setError("enter name");
                else if(address.getText().toString().isEmpty())
                    address.setError("enter address");
                else if(mobno.getText().toString().isEmpty())
                    mobno.setError("enter mobile no");
                else if(countrycode.getText().toString().isEmpty())
                    countrycode.setError("enter countrycode");
                else if(amount.getText().toString().isEmpty())
                    amount.setError("enter amonut");
                else if(receivername.getText().toString().isEmpty())
                    receivername.setError("enter receivername");
                else if(receiverphoneno.getText().toString().isEmpty())
                    receiverphoneno.setError("enter phone no");
                else{
                    Intent in=new Intent(Payment.this,Success.class);
                    startActivity(in);


            }


            }
        });
    }

}
