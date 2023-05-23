package agilemobiletech.com.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPasswordActivity extends AppCompatActivity {
    String newpassword, newconfirmpw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        final EditText editTextnewpassword= findViewById(R.id.editTextnewpassword);
        final EditText editTextconfirmnewpasw= findViewById(R.id.editTextconfirmnewpasw);
        Button buttonsubmit=findViewById(R.id.buttonsubmit);

        buttonsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                newpassword = editTextnewpassword.getText().toString();
                newconfirmpw = editTextconfirmnewpasw.getText().toString();


                // testing if there is any field which is empty

                if(newpassword.isEmpty()){
                    editTextnewpassword.setError("Password number is required");
                }

                if(newconfirmpw.isEmpty()){
                    editTextconfirmnewpasw.setError("Confirm Password");
                }
                else {
                    // not connected
                    Toast.makeText(ForgotPasswordActivity.this, "No internet Connection", Toast.LENGTH_SHORT).show();
                }}
        });
    }
}
