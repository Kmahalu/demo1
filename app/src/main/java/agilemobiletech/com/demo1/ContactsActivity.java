package agilemobiletech.com.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        //make reference of widgets from XML TO Java
        Button buttonemail = findViewById(R.id.buttonemail);
        Button btnfacebook = findViewById(R.id.buttonFacebook);
        Button btntwitter = findViewById(R.id.buttonTwitter);
        Button btninstagram = findViewById(R.id.buttonInstagran);
        Button btnphone = findViewById(R.id.buttonPhone);
        Button btnlocator = findViewById(R.id.buttonBiasharalocation);


        //generate Intent between Source and Destination Activity

        buttonemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///Toast.makeText(ContactsActivity.this, "social button pressed", Toast.LENGTH_SHORT).show();
                Intent Emailintent = new Intent(Intent.ACTION_SEND);
                Emailintent.setType("text/html");
                Emailintent.putExtra(Intent.EXTRA_EMAIL, "demo@info.co.tz" +
                        "" +
                        "" +
                        "    ");
                Emailintent.putExtra(Intent.EXTRA_SUBJECT, " ");
                //  Emailintent.putExtra(Intent.EXTRA_TEXT, "I'myMapView email body.");

                startActivity(Intent.createChooser(Emailintent, "Send Email"));
            }
        });

        btnfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent Facebookintent = new Intent();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/afyadigital  ")));
            }
        });

        btntwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Intent twitterintent = new Intent();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com/DigitalAfya")));
            }
        });


        btninstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Intent instagramintent = new Intent();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/afyadigital")));
            }
        });

        btnphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(ContactsActivity.this, "Phone button pressed", Toast.LENGTH_SHORT).show();
                Intent Phoneintent = new Intent();
                Phoneintent.setAction(Intent.ACTION_DIAL);
                Phoneintent.setData(Uri.parse("tel:+255 739 210  598"));
                startActivity(Phoneintent);
            }
        });

        btnlocator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(ContactsActivity.this, "Location button pressed", Toast.LENGTH_SHORT).show();
                String uri = "https://www.google.com/maps/place/Dar+es+Salaam+Institute+of+Technology/@-6.8148018,39.2778339,17z/data=!4m5!3m4!1s0x185c4b09e848c92d:0x90d02db3c3d6c912!8m2!3d-6.8148071!4d39.2800226";
                Intent locintent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(locintent);

            }
        });
    }
}
