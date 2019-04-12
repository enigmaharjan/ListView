package com.s.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public static final String countries[]={
        "Nepal",
        "US",
        "China",
        "UK",
        "Canada"
    };

    private ListView ltCountries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ltCountries = findViewById(R.id.stCountries);

        ArrayAdapter countriesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1, countries
        );
        ltCountries.setAdapter(countriesAdapter);
    }
}


