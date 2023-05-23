package agilemobiletech.com.demo1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String phoneno, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewcreateaccount= findViewById(R.id.textViewcreateaccount);
        TextView textViewforgotpassword= findViewById(R.id.textViewforgotpassword);
        final TextView editTextphonenumber= findViewById(R.id.editTextphonenumber);
        final TextView editTextpassword= findViewById(R.id.editTextpassword);
        Button buttonlogin= findViewById(R.id.buttonlogin);

        textViewcreateaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(LoginActivity.this, "Create Business button pressed", Toast.LENGTH_SHORT).show();
                Intent Aboutmeintent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(Aboutmeintent);
            }
        });

        textViewforgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(LoginActivity.this, "Create Business button pressed", Toast.LENGTH_SHORT).show();
                Intent Aboutmeintent = new Intent(MainActivity.this, ForgotPasswordActivity.class);
                startActivity(Aboutmeintent);
            }
        });

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneno = editTextphonenumber.getText().toString();
                password = editTextpassword.getText().toString();

                // testing if there are any empty fields submitted.

                if (phoneno.isEmpty()) {
                    editTextphonenumber.setError("Phone number is Required");
                }

                if (password.isEmpty()) {
                    editTextpassword.setError("Password is required");
                } else {
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent createbizintent= new Intent(MainActivity.this, DashboardActivity.class);
                    startActivity(createbizintent);}

    }
});

}
}