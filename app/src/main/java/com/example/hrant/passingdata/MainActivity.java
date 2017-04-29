package com.example.hrant.passingdata;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        // Capture our button from layout
        RelativeLayout group1 = (RelativeLayout) findViewById(R.id.view_group_1);
        RelativeLayout group2 = (RelativeLayout) findViewById(R.id.view_group_2);
        RelativeLayout group3 = (RelativeLayout) findViewById(R.id.view_group_3);
        RelativeLayout group4 = (RelativeLayout) findViewById(R.id.view_group_4);
        RelativeLayout group5 = (RelativeLayout) findViewById(R.id.view_group_5);
        // Register the onClick listener with the implementation above
        group1.setOnClickListener(this);
        group2.setOnClickListener(this);
        group3.setOnClickListener(this);
        group4.setOnClickListener(this);
        group5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String idStr = getResources().getResourceName(v.getId());
        String idNumber = idStr.substring(idStr.length()-1);
        int picId = getResources().getIdentifier("vg" + idNumber + "_pic", "id", getApplicationContext().getPackageName());
        if(findViewById(picId).getVisibility() == View.GONE) {
            findViewById(R.id.vg1_pic).setVisibility(View.GONE);
            findViewById(R.id.vg2_pic).setVisibility(View.GONE);
            findViewById(R.id.vg3_pic).setVisibility(View.GONE);
            findViewById(R.id.vg4_pic).setVisibility(View.GONE);
            findViewById(R.id.vg5_pic).setVisibility(View.GONE);
            findViewById(picId).setVisibility(View.VISIBLE);
        }
        else {
            Intent intent = new Intent(this, InfoActivity.class);
            findViewById(picId).setVisibility(View.GONE);
            intent.putExtra("user", UserList.getUsersList().get(Integer.parseInt(idNumber)-1));
            startActivity(intent);
        }
    }

}
