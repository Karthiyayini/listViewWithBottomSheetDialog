package com.example.grajendran.listviewwithbottomsheetdialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by grajendran on 5/10/18.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    String nameList[];
    int flags[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] nameList) {
        this.context = context;
        this.nameList = nameList;
        this.flags = flags;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return nameList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = inflter.inflate(R.layout.activity_list_view, null);
        TextView name = (TextView) view.findViewById(R.id.names);
        ImageView menuImg =(ImageView) view.findViewById(R.id.menuDot);

        menuImg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // things you want to do
//                ExampleBottomSheetDialog bottomSheet = new ExampleBottomSheetDialog();
//                bottomSheet.show(, "exampleBottomSheet");
            }
        });
        name.setText(nameList[i]);
        return view;
    }

}
