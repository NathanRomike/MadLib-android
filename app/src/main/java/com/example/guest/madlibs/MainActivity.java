package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    public String pluralNounOne, pluralNounTwo, partOfBodyOne, numberOne, pluralNounThree, partOfBodyTwo, liquidOne, partOfBodyPluralOne, partOfBodyThree, adjectiveOne, pluralNounFour, adjectiveTwo, adjectiveThree, verbEndingInIngOne, nounOne, pluralNounFive, nounTwo;
    private Button mSubmitButton;
    private EditText mPluralNounOne, mPluralNounTwo, mPartOfBodyOne, mNumberOne, mPluralNounThree, mPartOfBodyTwo, mLiquidOne, mPartOfBodyPluralOne, mPartOfBodyThree, mAdjectiveOne, mPluralNounFour, mAdjectiveTwo, mAdjectiveThree, mVerbEndingInIngOne, mNounOne, mPluralNounFive, mNounTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize edit texts using method below
        initializeEditTexts();

        mSubmitButton = (Button) findViewById(R.id.submitButton);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //get data from form using method below
                getDataFromForm();

                // create bundle object
                Bundle bundle = new Bundle();

                //store data in bundle
                bundle.putString("pluralNounOne", pluralNounOne);
                bundle.putString("pluralNounTwo", pluralNounTwo);
                bundle.putString("partOfBodyOne", partOfBodyOne);
                bundle.putString("numberOne", numberOne);
                bundle.putString("pluralNounThree", pluralNounThree);
                bundle.putString("partOfBodyTwo", partOfBodyTwo);
                bundle.putString("liquidOne", liquidOne);
                bundle.putString("partOfBodyPluralOne", partOfBodyPluralOne);
                bundle.putString("partOfBodyThree", partOfBodyThree);
                bundle.putString("adjectiveOne", adjectiveOne);
                bundle.putString("pluralNounFour", pluralNounFour);
                bundle.putString("adjectiveTwo", adjectiveTwo);
                bundle.putString("adjectiveThree", adjectiveThree);
                bundle.putString("verbEndingInIngOne", verbEndingInIngOne);
                bundle.putString("nounOne", nounOne);
                bundle.putString("pluralNounFive", pluralNounFive);
                bundle.putString("nounTwo", nounTwo);



                //create intent object
                Intent intent = new Intent(MainActivity.this, ResultsActivity.class);

                //store bundle object in intent
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    public void initializeEditTexts() {
        mPluralNounOne = (EditText) findViewById(R.id.pluralNounOne);
        mPluralNounTwo = (EditText) findViewById(R.id.pluralNounTwo);
        mPartOfBodyOne = (EditText) findViewById(R.id.partOfBodyOne);
        mNumberOne = (EditText) findViewById(R.id.numberOne);
        mPluralNounThree = (EditText) findViewById(R.id.pluralNounThree);
        mPartOfBodyTwo = (EditText) findViewById(R.id.partOfBodyTwo);
        mLiquidOne = (EditText) findViewById(R.id.liquidOne);
        mPartOfBodyPluralOne = (EditText) findViewById(R.id.partOfBodyPluralOne);
        mPartOfBodyThree = (EditText) findViewById(R.id.partOfBodyThree);
        mAdjectiveOne = (EditText) findViewById(R.id.adjectiveOne);
        mPluralNounFour = (EditText) findViewById(R.id.pluralNounFour);
        mAdjectiveTwo = (EditText) findViewById(R.id.adjectiveTwo);
        mAdjectiveThree = (EditText) findViewById(R.id.adjectiveThree);
        mVerbEndingInIngOne = (EditText) findViewById(R.id.verbEndingInIngOne);
        mNounOne = (EditText) findViewById(R.id.nounOne);
        mPluralNounFive = (EditText) findViewById(R.id.pluralNounFive);
        mNounTwo = (EditText) findViewById(R.id.nounTwo);
    }

    public void getDataFromForm() {
        pluralNounOne = mPluralNounOne.getText().toString();
        pluralNounTwo = mPluralNounTwo.getText().toString();
        partOfBodyOne = mPartOfBodyOne.getText().toString();
        numberOne = mNumberOne.getText().toString();
        pluralNounThree = mPluralNounThree.getText().toString();
        partOfBodyTwo = mPartOfBodyTwo.getText().toString();
        liquidOne = mLiquidOne.getText().toString();
        partOfBodyPluralOne = mPartOfBodyPluralOne.getText().toString();
        partOfBodyThree = mPartOfBodyThree.getText().toString();
        adjectiveOne = mAdjectiveOne.getText().toString();
        pluralNounFour = mPluralNounFour.getText().toString();
        adjectiveTwo = mAdjectiveTwo.getText().toString();
        adjectiveThree = mAdjectiveThree.getText().toString();
        verbEndingInIngOne = mVerbEndingInIngOne.getText().toString();
        nounOne = mNounOne.getText().toString();
        pluralNounFive = mPluralNounFive.getText().toString();
        nounTwo = mNounTwo.getText().toString();
    }
}
