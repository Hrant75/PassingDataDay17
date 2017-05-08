package com.example.hrant.passingdata;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
    static final int REQUEST_CODE = 1;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Intent intent = getIntent();
        user = (User)intent.getSerializableExtra("user");

        draw(user);
    }

    protected void editUser(View view){
        Intent intent = new Intent(this, EditActivity.class);
        intent.putExtra("user", user);
        startActivityForResult(intent, REQUEST_CODE);
    }

    protected void cancelInfo(View view){
        finish();
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            user = (User) data.getSerializableExtra("user");
            draw(user);
        }
    }

    public void draw(User user){
        ((TextView)findViewById(R.id.text_view_name)).setText(user.getName());
        ((TextView)findViewById(R.id.text_view_lastname)).setText(user.getLastName());
        ((TextView)findViewById(R.id.text_view_username)).setText(user.getUsername());
        ((TextView)findViewById(R.id.text_view_gender)).setText(user.getGender());
        ((TextView)findViewById(R.id.text_view_age)).setText(String.valueOf(user.getAge()));
        if(user.getGender().equals("F") || user.getGender().equals("f")) {
            findViewById(R.id.image_view).setBackgroundResource(R.drawable.f);
        }
        else {
            findViewById(R.id.image_view).setBackgroundResource(R.drawable.m);
        }
    }
}
