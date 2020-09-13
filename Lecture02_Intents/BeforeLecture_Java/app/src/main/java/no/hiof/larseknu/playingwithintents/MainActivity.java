package no.hiof.larseknu.playingwithintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

       private Button navigateToOtherButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        navigateToOtherButton=findViewById(R.id.main_activityb);
        navigateToOtherButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

            }
        });

    }

    public void goToOtherActivity(){
        final Intent intent= new Intent(this,OtherActivity.class);
        startActivity(intent);
    }

    public void sendTextToOtherActivity(){
        final Intent textIntent= new Intent(MainActivity.this,OtherActivity.class);
        TextView textView=(TextView) findViewById(R.id.textView);
        String message= String.valueOf(textView.getText());
        textIntent.putExtra("message" , message);
        startActivity(textIntent);
    }

    public void openWebPage(String url){

        final Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void openGPS(){
        
    }
    // TODO 3.3: Create openWebPage(View view) method to handle the click
    // TODO 3.4: Create an Intent
    // TODO 3.5: Set action ACTION_VIEW to the intent
    // TODO 3.6: Create an URI to a webpage and set it as data for the intent
    // TODO 3.7: Start the activity with the intent


    // TODO 4.3: Create openMaps(View view) method to handle the click
    // TODO 4.4: Create an URI to https://maps.google.com?q=59.128708,11.353176

    // TODO 4.7: Create an URI with the geo:lan,lot instead

    // TODO 4.5: Create an Intent with ACTION_VIEW and the URI
    // TODO 4.6: Start the activity with the intent
}
