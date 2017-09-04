package com.example.sudeep.listt;

/**
 * Created by sudeep on 2/24/17.
 */
/*
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Databasefeedback extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="feedback.db";
    private static final String TABLE_NAME="feedback";
    private static final String COLUMN_ID="id";
    private static final String COLUMN_NAME="message";
    private static final String COLUMN_RATING="Rating";
    private static final String COLUMN_EMAIL="email";


    SQLiteDatabase db;
    private static final String TABLE_CREATE="create table feedback (id integer primary key not null,"+
            "message text not null, Rating text not null, email text not null);";
    public Databasefeedback(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db=db;
    }

    public void insertFeedback(Feedback1 r)
    {
        //inserts contact info in database
        db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        String query="select * from feedback";
        Cursor cursor=db.rawQuery(query,null);
        int count=cursor.getCount();

        values.put(COLUMN_ID,count);
        values.put(COLUMN_NAME, r.getMessage());
        values.put(COLUMN_RATING, r.getRating());
        values.put(COLUMN_EMAIL,r.getEmail());

        db.insert(TABLE_NAME, null, values);
        db.close();

    }
    @Override
    public void onUpgrade(SQLiteDatabase db){

        db.execSQL(query);
        this.onCreate(db);
    }
}
*/