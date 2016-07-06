package com.example.pratikratnaparkhi.intent2;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Declaration of variables.
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialisation of variables.
        mButton= (Button) findViewById(R.id.Btn);

        //Setting click listener to the button.
        mButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        //Switch case.
        switch(view.getId()){

            //This case has been written to open the contacts from the phone using intent.
            case R.id.Btn:

                Intent iContacts = new Intent(Intent.ACTION_PICK ,  ContactsContract.Contacts.CONTENT_URI);
                startActivityForResult(iContacts.createChooser(iContacts,"CONTACT_NUMBER"),1 );
                break;

        }
    }
}