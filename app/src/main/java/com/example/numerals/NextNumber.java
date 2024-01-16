package com.example.numerals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NextNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_number);
    }
    // Called when the correct button is clicked
    public void onCorrectButtonClick(View view) {
        // Start another activity (you can replace AnotherActivity.class with the actual class)
        Intent intent = new Intent(this, CountGame.class);
        startActivity(intent);
    }
    // Called when any wrong button is clicked
    public void onWrongButtonClick(View view) {
        // Display a toast message
        Toast.makeText(this, "Try Again! Sorry, wrong answer.", Toast.LENGTH_SHORT).show();
    }
}