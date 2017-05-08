package com.example.hrant.passingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class EditActivity extends AppCompatActivity {
    User user;
    EditText editName;
    EditText editLastName;
    EditText userName;
    EditText gender;
    EditText age;
    ImageView image;
    Button buttonSave;
    Button buttonCancel;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        editName = ((EditText)findViewById(R.id.edit_view_name));
        editLastName = ((EditText)findViewById(R.id.edit_view_lastname));
        userName = ((EditText)findViewById(R.id.edit_view_username));
        gender = ((EditText)findViewById(R.id.edit_view_gender));
        age = ((EditText)findViewById(R.id.edit_view_age));
        image = (ImageView)findViewById(R.id.edit_image_view);

        intent = getIntent();
        user = (User)intent.getSerializableExtra("user");

        editName.setText(user.getName());
        editLastName.setText(user.getLastName());
        userName.setText(user.getUsername());
        gender.setText(user.getGender());
        age.setText(String.valueOf(user.getAge()));
        if(user.getGender().equals("F")) {
            image.setBackgroundResource(R.drawable.f);
        }
        else {
            image.setBackgroundResource(R.drawable.m);
        }
    }

    public void finish(View view) {
        user.setName(editName.getText().toString());
        user.setLastName(editLastName.getText().toString());
        user.setUsername(userName.getText().toString());

        String genderStr = gender.getText().toString();
        if(!genderStr.equals("F") && !genderStr.equals("M") && !genderStr.equals("f") && !genderStr.equals("m")){
            Toast.makeText(this, "Gender must be F or M", Toast.LENGTH_SHORT).show();
            return;
        }
        user.setGender(genderStr.toUpperCase());

        int ageInt = Integer.parseInt(age.getText().toString());
        if(ageInt < 1 || ageInt > 200) {
            Toast.makeText(this, "Age must be between 1 and 200", Toast.LENGTH_SHORT).show();
            return;
        }
        user.setAge(ageInt);
        // Prepare data intent
        Intent data = new Intent();
        data.putExtra("user", user);
        // Activity finished ok, return the data
        setResult(RESULT_OK, data);
        super.finish();
    }

    public void cancel(View view) {
        Log.i("testt", "CANCEL");
        setResult(RESULT_CANCELED, null);
        super.finish();
    }
}
