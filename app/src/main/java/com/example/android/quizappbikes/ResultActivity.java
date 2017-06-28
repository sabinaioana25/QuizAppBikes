package com.example.android.quizappbikes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent goToAnswer = getIntent();
        int score = goToAnswer.getExtras().getInt("TestActivity");

        TextView finalView = (TextView) findViewById(R.id.answer_text_view);
        ImageView finalImage = (ImageView) findViewById(R.id.result_image);

        if (score < 11) {
            finalView.setText("CRUISER, you are rater laid-back. You embrace carefree days and thoroughly enjoy the sweet, simple things in life.");
            finalImage.setImageResource(R.drawable.cruiser_bike);
            Toast.makeText(getApplicationContext(), R.string.summary1, Toast.LENGTH_SHORT).show();
        } else  if ((score >= 11) && (score < 16)) {
            finalView.setText("HYBRID BIKE. You are the person who is ready for anything and everything that your ride route (and life) may throw your way.");
            finalImage.setImageResource(R.drawable.hybrid_bike);
            Toast.makeText(getApplicationContext(), R.string.summary2, Toast.LENGTH_SHORT).show();
        } else if ((score >= 6) && (score < 24)) {
            finalView.setText("ROAD BIKE. Energetic and dedicated, you are both loyal leader and team player. You value endurance and doing what it takes to get a job done-and done right.");
            finalImage.setImageResource(R.drawable.road_bike);
            Toast.makeText(getApplicationContext(), R.string.summary3, Toast.LENGTH_SHORT).show();
        } else if ((score >= 24) && (score < 32)) {
            finalView.setText("BMX BIKE. You are an adrenaline-junkie. You love the spotlight and will often do whatever it takes to maintain your audience, even if it involves some risk. The bigger the thrills and spills, the better!");
            finalImage.setImageResource(R.drawable.bmx_bike);
            Toast.makeText(getApplicationContext(), R.string.summary4, Toast.LENGTH_SHORT).show();
        } else {
            finalView.setText("TREADLE BIKE. You are clearly a trend-setter. You are eccentric and love finding hobbies that set you apart from the crowd.");
            finalImage.setImageResource(R.drawable.treadle_bike);
            Toast.makeText(getApplicationContext(), R.string.summary5, Toast.LENGTH_SHORT).show();
        }
    }

    public void restartQuiz(View view) {
        Intent restartMainApp = new Intent(this, MainActivity.class);
        restartMainApp.putExtra("callingActivity", "MainActivity");
        startActivity(restartMainApp);
    }
}
