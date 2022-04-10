package com.example.arrayadapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list_view);

        customAdapter adapter=new customAdapter(this,getAndroidVersions());
        listView.setAdapter(adapter);
        /*     ArrayAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.android_versions));
        listView.setAdapter(adapter);
    */
    }
    private ArrayList<AndroidVersions> getAndroidVersions(){

        AndroidVersions androidVersions=new AndroidVersions();
        androidVersions.setVersionNum(4.1);
        androidVersions.setVersionName("Ice Cream Sandwich");

        AndroidVersions androidVersions1=new AndroidVersions();
        androidVersions1.setVersionNum(4.2);
        androidVersions1.setVersionName("Jelly Bean");

        AndroidVersions androidVersions2=new AndroidVersions();
        androidVersions2.setVersionNum(4.4);
        androidVersions2.setVersionName("KitKat");

        AndroidVersions androidVersions3=new AndroidVersions();
        androidVersions3.setVersionNum(5.0);
        androidVersions3.setVersionName("Lollipop");

        AndroidVersions androidVersions4=new AndroidVersions();
        androidVersions4.setVersionNum(6.0);
        androidVersions4.setVersionName("Marshmallow");

        AndroidVersions androidVersions5=new AndroidVersions();
        androidVersions5.setVersionNum(7.0);
        androidVersions5.setVersionName("Nougat");

        AndroidVersions androidVersions6=new AndroidVersions();
        androidVersions6.setVersionNum(8.0);
        androidVersions6.setVersionName("Oreo");

        AndroidVersions androidVersions7=new AndroidVersions();
        androidVersions7.setVersionNum(9.0);
        androidVersions7.setVersionName("Pie");

        ArrayList<AndroidVersions> versionsArrayList =new ArrayList<>();
        versionsArrayList.add(androidVersions);
        versionsArrayList.add(androidVersions1);
        versionsArrayList.add(androidVersions2);
        versionsArrayList.add(androidVersions3);
        versionsArrayList.add(androidVersions4);
        versionsArrayList.add(androidVersions5);
        versionsArrayList.add(androidVersions6);
        versionsArrayList.add(androidVersions7);
        versionsArrayList.add(androidVersions);
        versionsArrayList.add(androidVersions1);
        versionsArrayList.add(androidVersions2);
        versionsArrayList.add(androidVersions3);
        versionsArrayList.add(androidVersions4);
        versionsArrayList.add(androidVersions5);
        versionsArrayList.add(androidVersions6);
        versionsArrayList.add(androidVersions7);
        versionsArrayList.add(androidVersions);
        versionsArrayList.add(androidVersions1);
        versionsArrayList.add(androidVersions2);
        versionsArrayList.add(androidVersions3);
        versionsArrayList.add(androidVersions4);
        versionsArrayList.add(androidVersions5);
        versionsArrayList.add(androidVersions6);
        versionsArrayList.add(androidVersions7);

        return  versionsArrayList;

    }
}
