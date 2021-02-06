package com.example.suheda.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    DatabaseHelper db;

    EditText e1,e2,e3;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        db=new DatabaseHelper(this);
        e1=(EditText) findViewById(R.id.email);
        e2=(EditText) findViewById(R.id.pass);
        e3=(EditText) findViewById(R.id.cpass);
        b1=(Button) findViewById(R.id.kayit);
        b2=(Button) findViewById(R.id.giris);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Giriş yapmak için kaydınızı oluşturunuz.",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public  void  btn(View v){
        String s1=e1.getText().toString();
        String s2=e2.getText().toString();
        String s3=e3.getText().toString();
        if(s1.equals("")|| s2.equals("")|| s3.equals("")){
            Toast.makeText(getApplicationContext(),"Boş alanları doldurunuz.",Toast.LENGTH_SHORT).show();
        }
        else {
            if(s2.equals(s3)){
                Boolean chkemail=db.chkemail(s1);
                if(chkemail==true){
                    Boolean insert=db.insert(s1,s1);
                    if (insert=true){
                        Toast.makeText(getApplicationContext(),"Kaydınız oluşturuldu.",Toast.LENGTH_SHORT).show();
                        b2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent= new Intent(Main2Activity.this,Main3Activity.class);
                                startActivity(intent);
                            }
                        });
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"Email zaten kayıtlı.", Toast.LENGTH_SHORT).show();
                }
            }
            else
                Toast.makeText(getApplicationContext(),"Şifreler aynı olmalıdır",Toast.LENGTH_SHORT).show();
            e2.setText("");
            e3.setText("");
        }

    }

}

