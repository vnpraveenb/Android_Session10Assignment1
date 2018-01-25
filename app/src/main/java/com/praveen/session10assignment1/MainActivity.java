package com.praveen.session10assignment1;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText inputText;
    Button submitButton;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.inputText);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                SimpleAddition simpleAdditionFragment = (SimpleAddition) getSupportFragmentManager().findFragmentById(R.id.simpleAddtionFragment);
                simpleAdditionFragment.changeText(inputText.getText().toString());
            }

        });

     }
}
