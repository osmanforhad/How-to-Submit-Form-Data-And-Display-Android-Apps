package com.osmanforhad.friendsinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Create object
    EditText friend,contact;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initial XML Layout Using XML id
        friend = (EditText) findViewById(R.id.fname);
        contact = (EditText) findViewById(R.id.cno);
        btn = (Button) findViewById(R.id.btnsave);

        //For Making the Button Clickable
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //For Displaying data after Submit input
                String _friendname = friend.getText().toString();
                String _friendno = contact.getText().toString();
                //For Display  Text After Click the Button
                Toast.makeText(getApplicationContext(), "Name: "+_friendname+", Number: "+_friendno, Toast.LENGTH_LONG).show();

            }
        });
    }
}
