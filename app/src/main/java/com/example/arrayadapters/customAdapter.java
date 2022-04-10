package com.example.arrayadapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class customAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<AndroidVersions> versionsArrayList;

    public customAdapter(Context context, ArrayList<AndroidVersions> versionsArrayList){
        this.context=context;
        this.versionsArrayList=versionsArrayList;
    }
    @Override
    public int getCount() {
        if(versionsArrayList!=null && versionsArrayList.size()>0)
            return versionsArrayList.size();
        else
                return 0;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return versionsArrayList.get(position);
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        if (view == null)
        {
            view= LayoutInflater.from(context).inflate(R.layout.version_item_list,parent,false);
        }
        TextView txtVersionNum=view.findViewById(R.id.version_num);
        TextView txtVersionName=view.findViewById(R.id.version_name);

        LinearLayout mainLayout=view.findViewById(R.id.main_layout);

        txtVersionNum.setText("Version" + versionsArrayList.get(position).getVersionNum());
        txtVersionName.setText(versionsArrayList.get(position).getVersionName());

        mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Clicked " + versionsArrayList.get(position).getVersionName(),Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
