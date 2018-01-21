package com.example.android.humanorcharacterquiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String resultsTitle;
    String resultsBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //    This method calculates the final score.
    //    Each RadioButton can offer +5, -5 or 0 points to the final score.
    private int calculateAnswers() {

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

    private String findResultsTitle() {
        EditText nameGiven = findViewById(R.id.name_given);
        String name = nameGiven.getText().toString();

        if (calculateAnswers() >= 80) {
            resultsTitle = getString(R.string.very_human_title, name);
        } else if (calculateAnswers() >= 60) {
            resultsTitle = getString(R.string.human_title, name);
        } else if (calculateAnswers() >= 40) {
            resultsTitle = getString(R.string.unsure_title, name);
        } else if (calculateAnswers() >= 20) {
            resultsTitle = getString(R.string.character_title, name);
        } else {
            resultsTitle = getString(R.string.very_character_title, name);
        }
        return resultsTitle;
    }

    private String findResultsBody() {
        if (calculateAnswers() >= 80) {
            resultsBody = getString(R.string.very_human);
        } else if (calculateAnswers() >= 60) {
            resultsBody = getString(R.string.human);
        } else if (calculateAnswers() >= 40) {
            resultsBody = getString(R.string.unsure);
        } else if (calculateAnswers() >= 20) {
            resultsBody = getString(R.string.character);
        } else {
            resultsBody = getString(R.string.very_character);
        }
        return resultsBody;
    }
    
    //    This method shows the results of the points calculated in the previous method.
    //    The image, score and text vary (5 categories in total).
    public void showResults(View view) {

        EditText nameGiven = findViewById(R.id.name_given);
        RadioGroup radioGroup1 = findViewById(R.id.radio_group_1);
        RadioGroup radioGroup2 = findViewById(R.id.radio_group_2);
        RadioGroup radioGroup3 = findViewById(R.id.radio_group_3);
        RadioGroup radioGroup4 = findViewById(R.id.radio_group_4);
        RadioGroup radioGroup5 = findViewById(R.id.radio_group_5);
        RadioGroup radioGroup6 = findViewById(R.id.radio_group_6);
        RadioGroup radioGroup7 = findViewById(R.id.radio_group_7);
        RadioGroup radioGroup8 = findViewById(R.id.radio_group_8);
        RadioGroup radioGroup9 = findViewById(R.id.radio_group_9);
        RadioGroup radioGroup10 = findViewById(R.id.radio_group_10);

        // Check if all answers are answered and if a name is entered
        if ((radioGroup1.getCheckedRadioButtonId() != -1) && (radioGroup2.getCheckedRadioButtonId() != -1) &&
                (radioGroup3.getCheckedRadioButtonId() != -1) && (radioGroup4.getCheckedRadioButtonId() != -1) &&
                (radioGroup5.getCheckedRadioButtonId() != -1) && (radioGroup6.getCheckedRadioButtonId() != -1) &&
                (radioGroup7.getCheckedRadioButtonId() != -1) && (radioGroup8.getCheckedRadioButtonId() != -1) &&
                (radioGroup9.getCheckedRadioButtonId() != -1) && (radioGroup10.getCheckedRadioButtonId() != -1) &&
                (nameGiven.getText().toString().trim().length() > 0)) {

            // Make results visible
            LinearLayout results = findViewById(R.id.results);
            results.setVisibility(View.VISIBLE);
            nameGiven.clearFocus();
            results.requestFocus();

            // Show the correct image
            ImageView imageResult = findViewById(R.id.image_result);
            if (calculateAnswers() >= 80) {
                imageResult.setImageResource(R.drawable.very_human);
            } else if (calculateAnswers() >= 60) {
                imageResult.setImageResource(R.drawable.human);
            } else if (calculateAnswers() >= 40) {
                imageResult.setImageResource(R.drawable.unsure);
            } else if (calculateAnswers() >= 20) {
                imageResult.setImageResource(R.drawable.character);
            } else {
                imageResult.setImageResource(R.drawable.very_character);
            }

            // Show results on screen
            TextView humanScore = findViewById(R.id.human_score);
            TextView quizResultsTitle = findViewById(R.id.quiz_results_title);
            TextView quizResults = findViewById(R.id.quiz_results);
            humanScore.setText(getString(R.string.score, calculateAnswers()));
            quizResultsTitle.setText(findResultsTitle());
            quizResults.setText(findResultsBody());

            // Show a toast in case of unanswered questions and empty name box
        } else if (nameGiven.getText().toString().isEmpty()) {
            Toast.makeText(this, getString(R.string.name_toast), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, getString(R.string.radiobuttons_toast), Toast.LENGTH_SHORT).show();
        }

    }

    public void quit(View view) {

        // Check if the user wants to share the results before quitting
        CheckBox email = findViewById(R.id.email);
        if (email.isChecked()) {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra(Intent.EXTRA_SUBJECT, findResultsTitle());
            intent.putExtra(Intent.EXTRA_TEXT, findResultsBody());
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
        finish();
    }

}










