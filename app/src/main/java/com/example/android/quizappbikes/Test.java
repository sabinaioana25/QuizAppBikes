package com.example.android.quizappbikes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

/**
 * Created by Sabina on 4/10/2017.
 */


public class Test extends Activity {

    RadioButton q1A1, q1A2, q1A3, q2A1, q2A2, q2A3, q3A1, q3A2, q3A3, q4A1, q4A2, q4A3, q5A1, q5A2, q5A3, q6A1, q6A2, q6A3,
            q7A1, q7A2, q7A3, q8A1, q8A2, q8A3, q9A1, q9A2, q9A3;

    CheckBox q10A1, q10A2, q10A3, q10A4, q10A5;

    int points = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_questions);
        q1A1 = (RadioButton) findViewById(R.id.q1a1);
        q1A2 = (RadioButton) findViewById(R.id.q1a2);
        q1A3 = (RadioButton) findViewById(R.id.q1a3);

        q2A1 = (RadioButton) findViewById(R.id.q2a1);
        q2A2 = (RadioButton) findViewById(R.id.q2a2);
        q2A3 = (RadioButton) findViewById(R.id.q2a3);

        q3A1 = (RadioButton) findViewById(R.id.q3a1);
        q3A2 = (RadioButton) findViewById(R.id.q3a2);
        q3A3 = (RadioButton) findViewById(R.id.q3a3);

        q4A1 = (RadioButton) findViewById(R.id.q4a1);
        q4A2 = (RadioButton) findViewById(R.id.q4a2);
        q4A3 = (RadioButton) findViewById(R.id.q4a3);

        q5A1 = (RadioButton) findViewById(R.id.q5a1);
        q5A2 = (RadioButton) findViewById(R.id.q5a2);
        q5A3 = (RadioButton) findViewById(R.id.q5a3);

        q6A1 = (RadioButton) findViewById(R.id.q6a1);
        q6A2 = (RadioButton) findViewById(R.id.q6a2);
        q6A3 = (RadioButton) findViewById(R.id.q6a3);

        q7A1 = (RadioButton) findViewById(R.id.q7a1);
        q7A2 = (RadioButton) findViewById(R.id.q7a2);
        q7A3 = (RadioButton) findViewById(R.id.q7a3);

        q8A1 = (RadioButton) findViewById(R.id.q8a1);
        q8A2 = (RadioButton) findViewById(R.id.q8a2);
        q8A3 = (RadioButton) findViewById(R.id.q8a3);

        q9A1 = (RadioButton) findViewById(R.id.q9a1);
        q9A2 = (RadioButton) findViewById(R.id.q9a2);
        q9A3 = (RadioButton) findViewById(R.id.q9a3);

        q10A1 = (CheckBox) findViewById(R.id.q10a1);
        q10A2 = (CheckBox) findViewById(R.id.q10a2);
        q10A3 = (CheckBox) findViewById(R.id.q10a3);
        q10A4 = (CheckBox) findViewById(R.id.q10a4);
        q10A5 = (CheckBox) findViewById(R.id.q10a5);
    }

    public void submitAnswer(View view) {

        if (q1A1.isChecked()) {
            points += 1;
        }
        if (q1A2.isChecked()) {
            points += 2;
        }
        if (q1A3.isChecked()) {
            points += 3;
        }

        if (q2A1.isChecked()) {
            points += 1;
        }
        if (q2A2.isChecked()) {
            points += 2;
        }
        if (q2A3.isChecked()) {
            points += 3;
        }

        if (q3A1.isChecked()) {
            points += 1;
        }
        if (q3A2.isChecked()) {
            points += 2;
        }
        if (q1A3.isChecked()) {
            points += 3;
        }

        if (q4A1.isChecked()) {
            points += 1;
        }
        if (q4A2.isChecked()) {
            points += 2;
        }
        if (q4A3.isChecked()) {
            points += 3;
        }

        if (q5A1.isChecked()) {
            points += 1;
        }
        if (q5A2.isChecked()) {
            points += 2;
        }
        if (q5A3.isChecked()) {
            points += 3;
        }

        if (q6A1.isChecked()) {
            points += 1;
        }
        if (q6A2.isChecked()) {
            points += 2;
        }
        if (q6A3.isChecked()) {
            points += 3;
        }

        if (q7A1.isChecked()) {
            points += 1;
        }
        if (q7A2.isChecked()) {
            points += 2;
        }
        if (q7A3.isChecked()) {
            points += 3;
        }

        if (q8A1.isChecked()) {
            points += 1;
        }
        if (q8A2.isChecked()) {
            points += 2;
        }
        if (q8A3.isChecked()) {
            points += 3;
        }

        if (q9A1.isChecked()) {
            points += 1;
        }
        if (q9A2.isChecked()) {
            points += 2;
        }
        if (q9A3.isChecked()) {
            points += 3;
        }

        if (q10A1.isChecked()) {
            points += 1;
        }
        if (q10A2.isChecked()) {
            points += 2;
        }
        if (q10A3.isChecked()) {
            points += 3;
        }
        if (q10A4.isChecked()) {
            points += 4;
        }
        if (q10A5.isChecked()) {
            points += 5;
        }

        // display the final answer / conclusion depending on the user's choices

        Intent goToAnswerPage = new Intent(this, MainActivityResult.class);
        goToAnswerPage.putExtra("Test", points);
        startActivity(goToAnswerPage);
    }
}
