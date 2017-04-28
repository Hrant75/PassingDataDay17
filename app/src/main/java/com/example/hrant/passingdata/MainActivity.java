package com.example.hrant.passingdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    UserList userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(User user : userList.getUsersList()){
            TextView textView = (TextView)findViewById(R.id.all);
        }
    }
}
