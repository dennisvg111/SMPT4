package cac.fhict.org.coachingappcoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SportAppCoach extends AppCompatActivity {

    Button btnAppfinder;
    Button btnAppCoach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport__app__coach);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnAppCoach = (Button)findViewById(R.id.btnMakeApp);
        btnAppfinder = (Button)findViewById(R.id.btnFindApp);

        btnAppfinder.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SportAppCoach.this, AppFinderStart.class);
                SportAppCoach.this.startActivity(intent);
            }
        });

        btnAppCoach.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SportAppCoach.this, AppCoachStart.class);
                SportAppCoach.this.startActivity(intent);
            }
        });
    }


}
