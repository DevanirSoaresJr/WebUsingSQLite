package com.example.deva_.webusingsqlite;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private EditText etName, etNumber, etAge, etGender, etFaveAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding views

        etName = findViewById(R.id.etName);
        etNumber = findViewById(R.id.etNumber);
        etAge   = findViewById(R.id.etAge);
        etGender = findViewById(R.id.etGender);
        etFaveAnimal =findViewById(R.id.etFaveAnimal);

    }

    public void saveContact(View view){
        MyContact contact = new MyContact(etName.getText().toString(),etNumber.getText().toString(),etAge.getText().toString(),etGender.getText().toString(),etFaveAnimal.getText().toString());
        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        databaseHelper.saveNewContact(contact);
    }
    public void displayContact(View view){
        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        List<MyContact> myContacts = databaseHelper.getContacts();

        for(MyContact myContact : myContacts)
        {
            Log.d(TAG, "Display Contact " + myContact.getName() + " " + myContact.getNumber() + " " + myContact.getAge() + " " + myContact.getGender() + " " + myContact.getFaveAnimal());
        }
        }

    public void showTbl(View View){

    }
    }
