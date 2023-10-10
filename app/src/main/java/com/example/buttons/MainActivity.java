package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button outlinedButton = findViewById(R.id.outlinedButton);
        final Button containedButton = findViewById(R.id.containedButton);
        final FloatingActionButton floatingActionButton = findViewById(R.id.fabButton);

        outlinedButton.setOnClickListener(view -> Toast.makeText(getApplicationContext(), getString(R.string.button_clicked), Toast.LENGTH_SHORT).show());
        containedButton.setOnClickListener(view -> Toast.makeText(getApplicationContext(), getString(R.string.contained_button_clicked), Toast.LENGTH_SHORT).show());
        floatingActionButton.setOnClickListener(view -> Toast.makeText(getApplicationContext(), getString(R.string.floating_action_button_clicked), Toast.LENGTH_SHORT).show());
    }
}