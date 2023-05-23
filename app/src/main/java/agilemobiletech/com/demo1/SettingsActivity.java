package agilemobiletech.com.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //make reference of widgets from XML TO Java

        TextView textViewlogout = findViewById(R.id.textViewlogout);
        TextView textViewhelp = findViewById(R.id.textViewhelp);

        //generate Intent between Source and Destination Activity

        textViewhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(LoginActivity.this, "Create Business button pressed", Toast.LENGTH_SHORT).show();
                Intent Aboutmeintent = new Intent(SettingsActivity.this, HelpActivity.class);
                startActivity(Aboutmeintent);
            }
        });

        textViewlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(LoginActivity.this, "Create Business button pressed", Toast.LENGTH_SHORT).show();
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
    }
}
