package com.example.sudeep.listt;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;

public class Mydb extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 3;
    private static final String DATABASE_NAME = "menu.db";
    private static final String TABLE_PRODUCT = "menu";
    private static final String COLUMN_ID = "ID";
    private static final String COLUMN_NAME = "ITEMS";
    private static final String COLUMN_PRICE = "PRICE";

    public Mydb(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_PRODUCT + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT, " +
                COLUMN_PRICE + " INTEGER "+ ")";
            db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_PRODUCT);
        onCreate(db);
    }
//ok add new row

    public void addProduct(Food food){
        ContentValues values=new ContentValues();
        values.put(COLUMN_NAME, food.get_name());
        values.put(COLUMN_PRICE, food.get_price());
        //values.put(COLUMN_PRICE,100);
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_PRODUCT, null, values);

        //db.insert(TABLE_PRODUCT, null, values);
        db.close();
       //
    }
    //deleter
    public void deleteProduct(String productName){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_PRODUCT + " WHERE " + COLUMN_NAME + " =\"" + productName + "\"");

    }
    /*
    public void deleteProduct(String productName){
        SQLiteDatabase db= getWritableDatabase();
       // db.execSQL("DELETE from '"+ TABLE_PRODUCT +"' WHERE "+ COLUMN_NAME +"=\""+ productName +"\"");
        db.execSQL("DELETE FROM " + TABLE_PRODUCT + " WHERE " + COLUMN_NAME + "=\")" + productName + "\";");
    }
*/

//printout
public String databaseToString() {
    String dbString = "";
    SQLiteDatabase db = getWritableDatabase();
    String query = "SELECT * FROM " + TABLE_PRODUCT + " WHERE 1";
    //Curson point to a location in your results
    Cursor c = db.rawQuery(query, null);
    //Move to first row in results
    c.moveToFirst();
    while (!c.isAfterLast()) {
        if (c.getString(c.getColumnIndex("ITEMS")) != null) {
            dbString += c.getString(c.getColumnIndex("ITEMS"));
            dbString += "\t\t\t";
        }
        if (c.getString(c.getColumnIndex("PRICE")) != null) {
            dbString += c.getString(c.getColumnIndex("PRICE"));
            dbString += "\n";
        }
        c.moveToNext();
    }
    db.close();
    return dbString;
}
/*

    public String databaseToString(){
        String dbString= "";
        SQLiteDatabase db = getWritableDatabase();
        String query= "SELECT * FROM " + TABLE_PRODUCT;

        Cursor c= db.rawQuery(query, null);
        c.moveToFirst();

        while (!c.isAfterLast()) {
            if (c.getString(c.getColumnIndex("ITEMS")) != null) {
                dbString += c.getString(c.getColumnIndex("ITEMS"));
                dbString += "\n";
            }
        }
        db.close();
        return dbString;
    }*/
}
