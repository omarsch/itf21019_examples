package no.hiof.larseknu.playingwithandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private String LOG_TAG = "PlayingWithAndroid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //TODO 1: Override the onStart() ActivityLifecycle event and add logging (Ctrl + O - Override shortcut)

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG,"onStart() kjører");
    }

    //TODO 2: Override the onResume() ActivityLifecycle event and add logging

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(LOG_TAG,"onStart() kjører");
    }

    //TODO 3: Override the onPause() ActivityLifecycle event and add logging

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG,"onPause() kjører");
    }


    //TODO 4: Override the onStop() ActivityLifecycle event and add logging

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG,"On stop kjører");
    }


    //TODO 5: Override the onRestart() ActivityLifecycle event and add logging

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG,"OnRestart() kjører");
    }


    //TODO 6: Override the onDestroy() ActivityLifecycle event and add logging

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy() kjører");
    }


    //TODO 7: Create OtherActivity.java with the "New->Activity->Empty activity" dropdown menu
    //TODO 8: Add a TextView to OtherActivity with the text "Hello Android!"

    //TODO 11: Add a navigateToOtherActivity(View view), method for a button-click
    public void navigateToOtherActivity(View view){
        Intent intent= new Intent(this,OtherActivity.class);
        startActivity(intent);
    }
    //TODO 12: Create an Intent to start OtherActivity in the navigate... method
    //TODO 13: Start OtherActivity with the intent
}
