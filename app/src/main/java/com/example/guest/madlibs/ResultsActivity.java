package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    public static final String TAG = ResultsActivity.class.getSimpleName();
    public TextView showMadLib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        //initialize textviews
        initializeTextViews();

        //get the intent that started this activity
        Intent intent = getIntent();

        //get the bundle that stores the data of this activity
        Bundle bundle = intent.getExtras();

        //get the data from the bundle
        String pluralNounOne = bundle.getString("pluralNounOne");
        String pluralNounTwo = bundle.getString("pluralNounTwo");
        String partOfBodyOne = bundle.getString("partOfBodyOne");
        String numberOne = bundle.getString("numberOne");
        String pluralNounThree = bundle.getString("pluralNounThree");
        String partOfBodyTwo = bundle.getString("partOfBodyTwo");
        String liquidOne = bundle.getString("liquidOne");
        String partOfBodyPluralOne = bundle.getString("partOfBodyPluralOne");
        String partOfBodyThree = bundle.getString("partOfBodyThree");
        String adjectiveOne = bundle.getString("adjectiveOne");
        String pluralNounFour = bundle.getString("pluralNounFour");
        String adjectiveTwo = bundle.getString("adjectiveTwo");
        String adjectiveThree = bundle.getString("adjectiveThree");
        String verbEndingInIngOne = bundle.getString("verbEndingInIngOne");
        String nounOne = bundle.getString("nounOne");
        String pluralNounFive = bundle.getString("pluralNounFive");
        String nounTwo = bundle.getString("nounTwo");

        //show data to layout
        String giraffeString = getResources().getString(R.string.haveIGotAGiraffeForYou);
        giraffeString = String.format(giraffeString, pluralNounOne, pluralNounTwo, partOfBodyOne, numberOne, pluralNounThree, partOfBodyTwo, liquidOne, partOfBodyPluralOne, partOfBodyThree, adjectiveOne, pluralNounFour, adjectiveTwo, adjectiveThree, verbEndingInIngOne, nounOne, pluralNounFive, nounTwo);
        showMadLib.setText(giraffeString);



    }

    public void initializeTextViews() {
        showMadLib = (TextView) findViewById(R.id.showMadLib);
    }
}
