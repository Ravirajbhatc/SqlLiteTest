package sqllite.nd.khan.jubair.mohammad.sqllitetest;


import android.os.Bundle;
import android.view.Menu;

import java.util.List;
import android.app.Activity;
import android.util.Log;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Application", "starting application sql lite test..");

        DatabaseHandler db = new DatabaseHandler(this);

        // Inserting Contacts
        Log.d("Application", "Inserting the contacts.");
        db.addContact(new Contact("Mohammad", "9100000000"));
        db.addContact(new Contact("Jubair", "9199999999"));
        db.addContact(new Contact("Khan", "9522222222"));


        // Reading all contacts
        Log.d("Application", "Reading the contacts from sqllite!");
        List<Contact> contacts = db.getAllContacts();

        for (Contact cn : contacts) {
            String log = "Id: "+cn.getID()+" ,Name: " + cn.getName() + " ,Phone: " +
                    cn.getPhoneNumber();
            // Writing Contacts to log
            Log.d("Application", log);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}