package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView storyText;
    private Button topButton;
    private Button bottomButton;
    private int storyIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyText = findViewById(R.id.storyTextView);
        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (storyIndex == 1 || storyIndex == 2) {
                    storyText.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                    storyIndex = 3;
                } else  {
                    storyText.setText(R.string.T6_End);
                    topButton.setVisibility(View.INVISIBLE);
                    bottomButton.setVisibility(View.INVISIBLE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (storyIndex == 1) {
                    storyText.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    bottomButton.setText(R.string.T2_Ans2);
                    storyIndex = 2;
                } else if (storyIndex == 2) {
                    storyText.setText(R.string.T4_End);
                    topButton.setVisibility(View.INVISIBLE);
                    bottomButton.setVisibility(View.INVISIBLE);
                } else{
                    storyText.setText(R.string.T5_End);
                    topButton.setVisibility(View.INVISIBLE);
                    bottomButton.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}
