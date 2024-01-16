package com.example.numerals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class NumberOrder extends AppCompatActivity {

    private int expectedClick = 1;
    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_order);

        ImageButton imageButton = findViewById(R.id.close_button);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an intent to start the second activity
                Intent intent = new Intent(NumberOrder.this, NumberOrder.class);

                // Start the second activity
                startActivity(intent);
            }
        });

        // Initialize TextView for messages
        messageTextView = findViewById(R.id.messageTextView);

        // Initialize buttons
        Button button1 = findViewById(R.id.octagonButton5);
        Button button2 = findViewById(R.id.octagonButton9);
        Button button3 = findViewById(R.id.octagonButton3);
        Button button4 = findViewById(R.id.octagonButton8);
        Button button5 = findViewById(R.id.octagonButton6);
        Button button6 = findViewById(R.id.octagonButton1);
        Button button7 = findViewById(R.id.octagonButton7);
        Button button8 = findViewById(R.id.octagonButton2);
        Button button9 = findViewById(R.id.octagonButton10);
        Button button10 = findViewById(R.id.octagonButton4);

        // Set click listeners for buttons
        // Set click listeners for buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkButtonClick((Button) view, 1);
            }
        });

        // Add similar click listeners for Button 2 to Button 10
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButtonClick((Button) v, 2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButtonClick((Button) v, 3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButtonClick((Button) v, 4);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButtonClick((Button) v, 5);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButtonClick((Button) v, 6);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButtonClick((Button) v, 7);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButtonClick((Button) v, 8);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButtonClick((Button) v, 9);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButtonClick((Button) v, 10);
            }
        });


    }

    private void checkButtonClick(Button button, int buttonClicked) {
        if (buttonClicked == expectedClick) {
            // Correct button clicked, update expectedClick
            expectedClick++;

            // Change the background color of the correct button to white
            button.setBackgroundResource(R.drawable.rounded_square_button);

            // Check if all buttons are clicked in order
            if (expectedClick > 10) {
                // All buttons clicked correctly, transition to SuccessActivity
                Intent intent = new Intent(NumberOrder.this, NextNumber.class);
                startActivity(intent);

                // Reset expectedClick for a new sequence if needed
                expectedClick = 1;

                // Reset all buttons to mustard color background
                resetButtons();
            } else {
                // Set message for the next expected number
                messageTextView.setText("Tap the number " + expectedClick);
            }
        } else {
            // Wrong button clicked, show an error message
            Toast.makeText(this, "Try Again! The next number should be " + expectedClick, Toast.LENGTH_SHORT).show();
            // You can reset the expectedClick to start over
            expectedClick = 1;
            // Set message for the next expected number
            messageTextView.setText("Tap the number " + expectedClick);
            // Reset all buttons to mustard color background
            resetButtons();
        }
    }

    private void resetButtons() {
        Button button1 = findViewById(R.id.octagonButton1);
        // Reset background for Button 1 to Button 10
        button1.setBackgroundResource(R.drawable.button_background);

        Button button2 = findViewById(R.id.octagonButton2);
        // Reset background for Button 1 to Button 10
        button2.setBackgroundResource(R.drawable.button_background);

        Button button3 = findViewById(R.id.octagonButton3);
        // Reset background for Button 1 to Button 10
        button3.setBackgroundResource(R.drawable.button_background);

        Button button4 = findViewById(R.id.octagonButton4);
        // Reset background for Button 1 to Button 10
        button4.setBackgroundResource(R.drawable.button_background);

        Button button5 = findViewById(R.id.octagonButton5);
        // Reset background for Button 1 to Button 10
        button5.setBackgroundResource(R.drawable.button_background);

        Button button6 = findViewById(R.id.octagonButton6);
        // Reset background for Button 1 to Button 10
        button6.setBackgroundResource(R.drawable.button_background);

        Button button7 = findViewById(R.id.octagonButton7);
        // Reset background for Button 1 to Button 10
        button7.setBackgroundResource(R.drawable.button_background);

        Button button8 = findViewById(R.id.octagonButton8);
        // Reset background for Button 1 to Button 10
        button8.setBackgroundResource(R.drawable.button_background);

        Button button9 = findViewById(R.id.octagonButton9);
        // Reset background for Button 1 to Button 10
        button9.setBackgroundResource(R.drawable.button_background);

        Button button10 = findViewById(R.id.octagonButton10);
        // Reset background for Button 1 to Button 10
        button10.setBackgroundResource(R.drawable.button_background);
    }
}