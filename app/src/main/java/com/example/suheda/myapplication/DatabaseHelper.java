package com.example.suheda.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String table_name = "contacts";
    private static final String column_id = "id";
    private static final String column_name = "name";
    private static final String column_password = "pass";
    private static final String column_email = "email";
    SQLiteDatabase db;

    public DatabaseHelper(Context context) {
        super(context,"Login.db",null,1 );
    }

    private static final String table_create = "create table user(email text primary key, password text)";

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(table_create);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {
        String query= "drop table if exists user";
        db.execSQL(query);
    }

    //inserting in database
    public  boolean insert(String email, String password){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put("email", email);
        contentValues.put("password", password);
        long ins=db.insert("user",null, contentValues);
        if(ins==-1) return  false;
        else return  true;
    }
    //checking if email exists;
    public  Boolean chkemail(String email){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("Select * from user where email=?", new String[]{email});
        if(cursor.getCount()>0) return false;
        else return  true;
    }
    //checking email and password
    public Boolean chkemailpassword(String email, String password){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from user where email=? and password=?",new String[]{email,password});
        if(cursor.getCount()>0) return true;
        else return  false;
    }
}


