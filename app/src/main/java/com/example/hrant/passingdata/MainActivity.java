package com.example.hrant.passingdata;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int viewGroupId, nameLastnameId, genderId, picId;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(User user : UserList.getUsersList()){
            viewGroupId = getResources().getIdentifier("view_group_" + user.getId(), "id", getApplicationContext().getPackageName());
            picId = getResources().getIdentifier("vg" + user.getId() + "_pic", "id", getApplicationContext().getPackageName());

            if(user.getGender().equals("F")) {
                findViewById(viewGroupId).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                ((ImageView)findViewById(picId)).setBackgroundResource(R.drawable.f);
            }
            else {
                findViewById(viewGroupId).setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                ((ImageView)findViewById(picId)).setBackgroundResource(R.drawable.m);
            }

            nameLastnameId = getResources().getIdentifier("vg" + user.getId() + "_name_lastname", "id", getApplicationContext().getPackageName());
            ((TextView)findViewById(nameLastnameId)).setText(user.getName() + " " + user.getLastName());

            genderId = getResources().getIdentifier("vg" + user.getId() + "_gender", "id", getApplicationContext().getPackageName());
            ((TextView)findViewById(genderId)).setText(user.getGender());
        }
    }

    @Override
    public void onClick(View v) {

    }
}
