package com.example.yvtc.s033003;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by YVTC on 2017/3/30.
 */

public class MyAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> data;

    public MyAdapter(Context c, ArrayList<String> d)
    {
        context = c;
        data = d;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = ((Activity) context).getLayoutInflater().inflate(R.layout.myitem, null);

        TextView tv = (TextView) v.findViewById(R.id.textView);
        tv.setText(data.get(position));
        return v;
    }
}
