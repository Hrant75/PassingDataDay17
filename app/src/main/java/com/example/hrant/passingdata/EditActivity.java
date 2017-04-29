package com.example.hrant.passingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);


        Intent intent = getIntent();
        User user = (User)intent.getSerializableExtra("user");
        if(user != null) {
            Log.e("sss", user.getClass().getSimpleName());
            Log.e("sss", user.getName());
        }
        Log.e("sss", "user is null");
        ((EditText)findViewById(R.id.edit_view_name)).setText("sdsdsdsds");
//        ((EditText)findViewById(R.id.edit_view_name)).setText(user.getName());
//        ((EditText)findViewById(R.id.edit_view_lastname)).setText(user.getLastName());
//        ((EditText)findViewById(R.id.edit_view_username)).setText(user.getUsername());
//        ((EditText)findViewById(R.id.edit_view_gender)).setText(user.getGender());
//        ((EditText)findViewById(R.id.edit_view_age)).setText(String.valueOf(user.getAge()));
//        if(user.getGender().equals("F")) {
//            findViewById(R.id.image_view).setBackgroundResource(R.drawable.f);
//        }
//        else {
//            findViewById(R.id.image_view).setBackgroundResource(R.drawable.m);
//        }
    }
}
