package com.example.android.humanorcharacterquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

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
        RadioButton oneTwo = findViewById(R.id.one_2);

        if (oneOne.isChecked()) {
            personality_points += +5;
        } else if (oneTwo.isChecked()) {
            personality_points += -5;
        }

        RadioButton twoThree = findViewById(R.id.two_3);
        RadioButton twoOne = findViewById(R.id.two_1);

        if (twoThree.isChecked()) {
            personality_points += +5;
        } else if (twoOne.isChecked()) {
            personality_points += -5;
        }

        RadioButton threeOne = findViewById(R.id.three_1);
        RadioButton threeTwo = findViewById(R.id.three_2);

        if (threeOne.isChecked()) {
            personality_points += +5;
        } else if (threeTwo.isChecked()) {
            personality_points += -5;
        }

        RadioButton fourTwo = findViewById(R.id.four_2);
        RadioButton fourThree = findViewById(R.id.four_3);

        if (fourTwo.isChecked()) {
            personality_points += +5;
        } else if (fourThree.isChecked()) {
            personality_points += -5;
        }

        RadioButton fiveTwo = findViewById(R.id.five_2);
        RadioButton fiveOne = findViewById(R.id.five_1);

        if (fiveTwo.isChecked()) {
            personality_points += +5;
        } else if (fiveOne.isChecked()) {
            personality_points += -5;
        }

        RadioButton sixOne = findViewById(R.id.six_1);
        RadioButton sixTwo = findViewById(R.id.six_2);

        if (sixOne.isChecked()) {
            personality_points += +5;
        } else if (sixTwo.isChecked()) {
            personality_points += -5;
        }

        RadioButton sevenThree = findViewById(R.id.seven_3);
        RadioButton sevenTwo = findViewById(R.id.seven_2);

        if (sevenThree.isChecked()) {
            personality_points += +5;
        } else if (sevenTwo.isChecked()) {
            personality_points += -5;
        }

        RadioButton eightTwo = findViewById(R.id.eight_2);
        RadioButton eightOne = findViewById(R.id.eight_1);

        if (eightTwo.isChecked()) {
            personality_points += +5;
        } else if (eightOne.isChecked()) {
            personality_points += -5;
        }

        RadioButton nineTwo = findViewById(R.id.nine_2);
        RadioButton nineThree = findViewById(R.id.nine_3);

        if (nineTwo.isChecked()) {
            personality_points += +5;
        } else if (nineThree.isChecked()) {
            personality_points += -5;
        }

        RadioButton tenOne = findViewById(R.id.ten_1);
        RadioButton tenThree = findViewById(R.id.ten_3);

        if (tenOne.isChecked()) {
            personality_points += +5;
        } else if (tenThree.isChecked()) {
            personality_points += -5;
        }

        return personality_points;
    }



//    This method shows the results of the points calculated in the previous method.
//    The image, score and text vary (5 categories in total).

    public void showResults(View view) {

        String resultsTitle;
        String resultsBody;

        ImageView imageResult = findViewById(R.id.image_result);

        if (calculateResults() >= 35) {
            resultsTitle = getString(R.string.very_human_title);
            resultsBody = getString(R.string.very_human);
            imageResult.setImageResource(R.drawable.very_human);
        }
        else if (calculateResults() >= 15) {
            resultsTitle = getString(R.string.human_title);
            resultsBody = getString(R.string.human);
            imageResult.setImageResource(R.drawable.human);
        }
        else if (calculateResults() >= -15) {
            resultsTitle = getString(R.string.unsure_title);
            resultsBody = getString(R.string.unsure);
            imageResult.setImageResource(R.drawable.unsure);
        }
        else if (calculateResults() >= -35) {
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
        humanScore.setText(getString(R.string.score) + " " + calculateResults());
        quizResultsTitle.setText(resultsTitle);
        quizResults.setText(resultsBody);

    }

    }










