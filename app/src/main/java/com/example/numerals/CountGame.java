package com.example.numerals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CountGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_game);
    }
    // Called when any image button is clicked
    public void onImageButtonClick(View view) {
        int clickedButtonId = view.getId();

        if (clickedButtonId == R.id.bee9ChoiceButton) {
            // Correct button clicked, start another activity (replace AnotherActivity.class with the actual class)
            Intent intent = new Intent(this, FamiliarColor.class);
            startActivity(intent);
        } else {
            // Wrong button clicked, display a toast message
            Toast.makeText(this, "Try Again! Sorry, wrong answer.", Toast.LENGTH_SHORT).show();
        }
    }
}