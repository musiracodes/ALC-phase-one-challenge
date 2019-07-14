package ke.co.musira.alcphaseonechallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button about_btn;
    private Button profile_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        about_btn = findViewById(R.id.about_btn);
        profile_btn = findViewById(R.id.profile_btn);

        about_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbout();
            }
        });

        profile_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });
    }

    public void openAbout() {
        Intent intent = new Intent(this, AboutALC.class);
        startActivity(intent);
    }
    public void openProfile() {
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);
    }
}
