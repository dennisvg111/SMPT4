package cac.fhict.org.coachingappcoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AppCoachStart extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_coach_start);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnNext = (Button)findViewById(R.id.btnStartNext);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(AppCoachStart.this, AppCoachQuestion.class);
        AppCoachStart.this.startActivity(i);
    }
}
