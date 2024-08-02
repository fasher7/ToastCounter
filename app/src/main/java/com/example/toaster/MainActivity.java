package com.example.toaster;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView largeSpace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toastButton = findViewById(R.id.toastButton);
        largeSpace = findViewById(R.id.largeSpace);
        Button countButton = findViewById(R.id.countButton);
        Button resetButton = findViewById(R.id.resetButton);

        toastButton.setOnClickListener(v -> {
            largeSpace.setText(getString(R.string.toast));
            Toast.makeText(MainActivity.this, R.string.toast_happened, Toast.LENGTH_SHORT).show();
        });

        countButton.setOnClickListener(v -> {
            count++;
            largeSpace.setText(String.valueOf(count));
        });

        resetButton.setOnClickListener(v -> {
            count = 0;
            largeSpace.setText(String.valueOf(count));
        });
    }
}
