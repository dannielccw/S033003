package com.example.yvtc.s033003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> data = new ArrayList<>();

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listView);
        data.add("AA1");
        data.add("AA2");
        data.add("AA3");
        data.add("AA4");
        data.add("AA5");
        data.add("AA6");
        data.add("AA7");
        data.add("AA8");
        data.add("AA9");
        data.add("AA10");
        data.add("AA11");
        data.add("AA12");
        MyAdapter adapter = new MyAdapter(MainActivity.this, data);

        lv.setAdapter(adapter);
    }
}

