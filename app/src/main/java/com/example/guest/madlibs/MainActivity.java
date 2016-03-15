package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mSubmitButton;
    private EditText mMainName;
    private EditText mAdjectiveOne;
    private EditText mNounOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainName = (EditText) findViewById(R.id.mainName);
        mAdjectiveOne = (EditText) findViewById(R.id.adjectiveOne);
        mNounOne = (EditText) findViewById(R.id.nounOne);
        mSubmitButton = (Button) findViewById(R.id.submitButton);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mainName = mMainName.getText().toString();
                String adjectiveOne = mAdjectiveOne.getText().toString();
                String nounOne = mNounOne.getText().toString();
                Log.d(TAG, mainName);
                Log.d(TAG, adjectiveOne);
                Log.d(TAG, nounOne);

                Intent intent = new Intent(MainActivity.this, ResultsActivity.class);
                startActivity(intent);
            }
        });
    }
}
