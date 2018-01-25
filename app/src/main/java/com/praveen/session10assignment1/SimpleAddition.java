package com.praveen.session10assignment1;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class SimpleAddition extends Fragment {

    View thisView; // View object to reference the fragment layout
    TextView outputTextView; // Textview object to reference the TextView view from fragment's layout

    public SimpleAddition() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        thisView =  inflater.inflate(R.layout.fragment_simple_addition, container, false);

        // create a text view object from layout and initialize it to empty string
        outputTextView = thisView.findViewById(R.id.outputText);
        outputTextView.setText("");


        return thisView;
    }

    public void changeText(String inputText){

        // Sets the value of outputTextView from inputText parameter
        outputTextView.setText(inputText);
    }

}
