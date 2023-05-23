package agilemobiletech.com.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SignUpActivity extends AppCompatActivity {


    String fullname, username, country, userphone, useremail, userpassword,confirmpw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //make reference of widgets from XML TO Java
            final EditText editTextccfullname= findViewById(R.id.editTextccfullname);
            final EditText editTextccphoneno= findViewById(R.id.editTextccphoneno);
            final EditText editTextccemail= findViewById(R.id.editTextccemail);
            final EditText editTextccusername= findViewById(R.id.editTextccusername);
            final EditText editTextccpassword= findViewById(R.id.editTextccpassword);
            final EditText editTextccconfirmpassword= findViewById(R.id.editTextccconfirmpassword);
            Button buttonccregister=findViewById(R.id.buttonccregister);

        // final Spinner spinnercategory= findViewById(R.id.spinnercategory); if global, leave it here
        displaySpinner();

        // Enable the Clicking listener to submit BUTTON

            buttonccregister.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fullname = editTextccfullname.getText().toString();
                    username = editTextccusername.getText().toString();
                    userphone = editTextccphoneno.getText().toString();
                    useremail = editTextccemail.getText().toString();
                    userpassword = editTextccpassword.getText().toString();
                    confirmpw = editTextccconfirmpassword.getText().toString();


                    // testing if there is any field which is empty

                    if (fullname.isEmpty()) {
                        editTextccfullname.setError("Full Name is Required");
                    }

                    if (username.isEmpty()) {
                        editTextccusername.setError("Username is Required");
                    }

                    if(userphone.isEmpty()){
                        editTextccphoneno.setError("Phone number is required");
                    }

                    if (useremail.isEmpty()) {
                        editTextccemail.setError("Email is Required");
                    }

                    if(userpassword.isEmpty()){
                        editTextccpassword.setError("Password number is required");
                    }

                    if(confirmpw.isEmpty()){
                        editTextccconfirmpassword.setError("Confirm Password");
                    }
                        else{
                            Toast.makeText(SignUpActivity.this, "Submission Successfully", Toast.LENGTH_SHORT).show();

                        Intent dashboardmeintent = new Intent(SignUpActivity.this, DashboardActivity.class);
                        startActivity(dashboardmeintent);
                        }


                    }
            });

    }

    // method to implement android spinner.

    public void displaySpinner() {

        // SPECIFY THE DATA SOURCE

        //1. Generate an array of data source
        final String countries[] = {"Country", "The United Republic of Tanzania", "The Republic of Kenya", "The Republic of Uganda", "The Republic of Rwanda", "The Republic of Burundi", "The Republic of South Sudan"};

        //2. make reference of Spinner widget from XML TO Java
        final Spinner spinnercountry = findViewById(R.id.spinnercountry);

        //3. Generate the Spinner adapter for carrying the array data source
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(SignUpActivity.this, R.layout.spinnerdesign, R.id.textViewspinner, countries);
        spinnercountry.setAdapter(spinnerAdapter);

        //4. For Item selection, generate the onItemSelectedListener
        spinnercountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // passing index of item selected.
                //index= position, any variable
                country = countries[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                country = "nothing";
            }
        });

    }
}
