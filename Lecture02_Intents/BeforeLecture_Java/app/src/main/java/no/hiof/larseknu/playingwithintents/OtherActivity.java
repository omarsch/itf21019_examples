package no.hiof.larseknu.playingwithintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {
    // TODO 5.9: Create a constant integer for the image request

    // TODO 5.4: Create a field variable for the ImageView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        setTextFromPastView();

        // TODO 2.7: Get a reference to the intent we receive from MainActivity

        // TODO 2.8: Get the extra "name" information from the intent
        // TODO 2.9: Fill the TextView with the String from the extra-data

        // TODO 5.5: Instantiate the ImageView
    }

    public void setTextFromPastView(){

        Intent receiveIntent = getIntent();
        String name= receiveIntent.getStringExtra(MainActivity.KEY_NAME);
        TextView textView= findViewById(R.id.textView2);
        textView.setText(name);
    }

    // TODO 5.6: Create getPicture(View view) method to handle the click
    // TODO 5.7: Create Intent with ACTION_GET_CONTENT
    // TODO 5.8: Set the type of the intent to image/*
    // TODO 5.10: Call the setActivityResult with the intent and the int constant

    // TODO 5.11: Override onActivityResult to handle result of the image request
    // TODO 5.12: Check that the requestCode matches the int constant, and that the resultCode is OK
    // TODO 5.13: Get the data URI from the intent
    // TODO 5.14: Retrieve a bitmap of the picture from the URI, with the help of MediaStore.Images.Media.getBitMap
    // TODO 5.15: Set the bitmap to the imageView
}
