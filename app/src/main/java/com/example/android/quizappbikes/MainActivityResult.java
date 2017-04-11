package com.example.android.quizappbikes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivityResult extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_result);

        Intent goToAnswer = getIntent();
        int score = goToAnswer.getExtras().getInt("Test");


        TextView finalView = (TextView) findViewById(R.id.answer_text_view);

        if (score < 11) {
            finalView.setText("CRUISER, you are rater laid-back. You embrace carefree days and thoroughly enjoy the sweet, simple things in life.");
        }

        if ((score >= 11) && (score < 16)) {
            finalView.setText("HYBRID BIKE. You are the person who is ready for anything and everything that your ride route (and life) may throw your way.");
        }

        if ((score >= 6) && (score < 24)) {
            finalView.setText("ROAD BIKE. Energetic and dedicated, you are both loyal leader and team player. You value endurance and doing what it takes to get a job done-and done right.");
        }

        if ((score >= 24) && (score < 32)) {
            finalView.setText("BMX BIKE. You are an adrenaline-junkie. You love the spotlight and will often do whatever it takes to maintain your audience, even if it involves some risk. The bigger the thrills and spills, the better!");
        }

        if (score >= 32) {
            finalView.setText("TREADLE BIKE. You are clearly a trend-setter. You are eccentric and love finding hobbies that set you apart from the crowd.");
        }

    }

    public void restartMainApp(View view) {
        Intent restartMainApp = new Intent(this, MainActivity.class);
        restartMainApp.putExtra("callingActivity", "MainActivity");
        startActivity(restartMainApp);
    }
}
