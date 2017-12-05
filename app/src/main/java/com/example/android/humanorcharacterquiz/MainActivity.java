package com.example.android.humanorcharacterquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//    This method calculates the final score.
//    Each RadioButton can offer +5, -5 or 0 points to the final score.

    public int calculateResults() {

        int personality_points = 0;

        RadioButton oneOne = findViewById(R.id.one_1);
        RadioButton oneThree = findViewById(R.id.one_3);

        if (oneOne.isChecked()) {
            personality_points += +10;
        } else if (oneThree.isChecked()) {
            personality_points += +5;
        }

        RadioButton twoThree = findViewById(R.id.two_3);
        RadioButton twoTwo = findViewById(R.id.two_2);

        if (twoThree.isChecked()) {
            personality_points += +10;
        } else if (twoTwo.isChecked()) {
            personality_points += +5;
        }

        RadioButton threeOne = findViewById(R.id.three_1);
        RadioButton threeThree = findViewById(R.id.three_3);

        if (threeOne.isChecked()) {
            personality_points += +10;
        } else if (threeThree.isChecked()) {
            personality_points += +5;
        }

        RadioButton fourTwo = findViewById(R.id.four_2);
        RadioButton fourOne = findViewById(R.id.four_1);

        if (fourTwo.isChecked()) {
            personality_points += +10;
        } else if (fourOne.isChecked()) {
            personality_points += +5;
        }

        RadioButton fiveTwo = findViewById(R.id.five_2);
        RadioButton fiveThree = findViewById(R.id.five_3);

        if (fiveTwo.isChecked()) {
            personality_points += +10;
        } else if (fiveThree.isChecked()) {
            personality_points += +5;
        }

        RadioButton sixOne = findViewById(R.id.six_1);
        RadioButton sixThree = findViewById(R.id.six_3);

        if (sixOne.isChecked()) {
            personality_points += +10;
        } else if (sixThree.isChecked()) {
            personality_points += +5;
        }

        RadioButton sevenThree = findViewById(R.id.seven_3);
        RadioButton sevenOne = findViewById(R.id.seven_1);

        if (sevenThree.isChecked()) {
            personality_points += +10;
        } else if (sevenOne.isChecked()) {
            personality_points += +5;
        }

        RadioButton eightTwo = findViewById(R.id.eight_2);
        RadioButton eightThree = findViewById(R.id.eight_3);

        if (eightTwo.isChecked()) {
            personality_points += +10;
        } else if (eightThree.isChecked()) {
            personality_points += +5;
        }

        RadioButton nineTwo = findViewById(R.id.nine_2);
        RadioButton nineOne = findViewById(R.id.nine_1);

        if (nineTwo.isChecked()) {
            personality_points += +10;
        } else if (nineOne.isChecked()) {
            personality_points += +5;
        }

        RadioButton tenOne = findViewById(R.id.ten_1);
        RadioButton tenTwo = findViewById(R.id.ten_2);

        if (tenOne.isChecked()) {
            personality_points += +10;
        } else if (tenTwo.isChecked()) {
            personality_points += +5;
        }

        return personality_points;
    }



//    This method shows the results of the points calculated in the previous method.
//    The image, score and text vary (5 categories in total).

    public void showResults(View view) {

        String resultsTitle;
        String resultsBody;

        ImageView imageResult = findViewById(R.id.image_result);

        if (calculateResults() >= 80) {
            resultsTitle = getString(R.string.very_human_title);
            resultsBody = getString(R.string.very_human);
            imageResult.setImageResource(R.drawable.very_human);
        }
        else if (calculateResults() >= 60) {
            resultsTitle = getString(R.string.human_title);
            resultsBody = getString(R.string.human);
            imageResult.setImageResource(R.drawable.human);
        }
        else if (calculateResults() >= 40) {
            resultsTitle = getString(R.string.unsure_title);
            resultsBody = getString(R.string.unsure);
            imageResult.setImageResource(R.drawable.unsure);
        }
        else if (calculateResults() >= 20) {
            resultsTitle = getString(R.string.character_title);
            resultsBody = getString(R.string.character);
            imageResult.setImageResource(R.drawable.character);
        }
        else  {
            resultsTitle = getString(R.string.very_character_title);
            resultsBody = getString(R.string.very_character);
            imageResult.setImageResource(R.drawable.very_character);
        }

        TextView humanScore = findViewById(R.id.human_score);
        TextView quizResultsTitle = findViewById(R.id.quiz_results_title);
        TextView quizResults = findViewById(R.id.quiz_results);
        quizResultsTitle.setPadding(0,20,0,20);
        humanScore.setPadding(0,100,0,0);
        humanScore.setText(getString(R.string.score, calculateResults()));
        quizResultsTitle.setText(resultsTitle);
        quizResults.setText(resultsBody);

    }

    }










