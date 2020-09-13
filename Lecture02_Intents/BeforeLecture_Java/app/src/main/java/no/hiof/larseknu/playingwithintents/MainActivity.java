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
        public static final String KEY_NAME = "name";
       private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);


        navigateToOtherButton=findViewById(R.id.main_activityb);
        navigateToOtherButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                sendTextFromThisPage(view);
            }
        });

    }

    public void sendTextFromThisPage(View view){
        Intent intent=new Intent(view.getContext(), OtherActivity.class);

        String name = textView.getText().toString();

        intent.putExtra(KEY_NAME, name);

        startActivity(intent);
    }

    public void openWebPage(String url){

        final Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void openGPS(){
        Uri uri= Uri.parse("geo:59.128708,11.353176");
        Intent intent=new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
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
