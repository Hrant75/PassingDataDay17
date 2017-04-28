package com.example.hrant.passingdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    String idStr;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(User user : UserList.getUsersList()){
            idStr = "view_group_" + user.getId();
            id = getResources().getIdentifier(idStr, "id", getApplicationContext().getPackageName());
            Log.e("sss", idStr + id);
            if(user.getGender().equals("F"))
                findViewById(id).setBackgroundColor(getResources().getColor(R.color.colorAccent));
            else
                findViewById(id).setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

            idStr = "vg" + user.getId() + "_name_lastname";
            id = getResources().getIdentifier(idStr, "id", getApplicationContext().getPackageName());
            textView =  ((TextView)findViewById(id));
            textView.setText(user.getName() + " " + user.getLastName());

            idStr = "vg" + user.getId() + "_gender";
            id = getResources().getIdentifier(idStr, "id", getApplicationContext().getPackageName());
            textView =  ((TextView)findViewById(id));
            textView.setText(user.getGender());
        }

    }
}
