package com.example.customspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] countries = {"Japan", "Brazil", "Australia", "Canada", "South Korea", "Argentina", "Italy"};
    String[] capitals = {"Tokyo","Brasília","Canberra","Ottawa","Seoul","Buenos Aires","Rome"};
    String[] populations = {"126.5 million", "213.8 million", "25.4 million", "37.7 million", "51.7 million", "45.2 million", "60.4 million"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}