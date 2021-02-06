package com.example.suheda.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    EditText e1,e2;
    Button b1;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        db=new DatabaseHelper(this);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button);
    }

    public void  button(View v){
        String email=e1.getText().toString();
        String password=e2.getText().toString();

        Boolean Chkemailpass=db.chkemailpassword(email,password);

        if(Chkemailpass==true) {
                Toast.makeText(getApplication(), "Giriş Başarılı", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(intent);
            }
            else
                Toast.makeText(getApplicationContext(),"Email veya Şifre hatalı",Toast.LENGTH_SHORT).show();

        }
    }



