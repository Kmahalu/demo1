package agilemobiletech.com.demo1;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        BottomNavigationView navView = findViewById(R.id.bottom_navigation);

        navView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {

            }
        });

        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                //capture selecteditem id

                int selectedmenuitemid = menuItem.getItemId();
                // implement logic for each menu item
                if (selectedmenuitemid == R.id.navigation_account) {

                    //Toast.makeText(MainActivity.this, "hhh", Toast.LENGTH_SHORT).show();
                    Intent intentaccount = new Intent(DashboardActivity.this, AccountActivity.class);
                    startActivity(intentaccount);

                } else if (selectedmenuitemid == R.id.navigation_settings) {
                    Intent intentsettings = new Intent(DashboardActivity.this, SettingsActivity.class);
                    startActivity(intentsettings);

                }else if (selectedmenuitemid == R.id.navigation_contacts) {
                    Intent intentcontacts = new Intent(DashboardActivity.this, ContactsActivity.class);
                    startActivity(intentcontacts);
                }
                return false;
            }
        });

    }

//methods to implement the options Menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // connect activity with menu xml file
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    // handleling on click
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        //capture selecteditem id
        int selectedmenuitemid = item.getItemId();

        // implement logic for each menu item
        if (selectedmenuitemid == R.id.menu_about) {
            Intent about = new Intent(DashboardActivity.this, AboutActivity.class);
            startActivity(about);

        }else if (selectedmenuitemid == R.id.menu_logout) {
            //Toast.makeText(LoginActivity.this, "Create Business button pressed", Toast.LENGTH_SHORT).show();
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }
        return super.onOptionsItemSelected(item);
    }

}