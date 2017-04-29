package com.example.hrant.passingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        User user = (User)intent.getSerializableExtra("user");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ((TextView)findViewById(R.id.text_view_name)).setText(user.getName());
        ((TextView)findViewById(R.id.text_view_lastname)).setText(user.getLastName());
        ((TextView)findViewById(R.id.text_view_username)).setText(user.getUsername());
        ((TextView)findViewById(R.id.text_view_gender)).setText(user.getGender());
        ((TextView)findViewById(R.id.text_view_age)).setText(String.valueOf(user.getAge()));
        if(user.getGender().equals("F")) {
            findViewById(R.id.image_view).setBackgroundResource(R.drawable.f);
        }
        else {
            findViewById(R.id.image_view).setBackgroundResource(R.drawable.m);
        }
    }

    protected void editUser(View view){
        Intent intent = new Intent(this, EditActivity.class);
        User user = (User)intent.getSerializableExtra("user");
        intent.putExtra("user", user);
        startActivity(intent);
    }
}
