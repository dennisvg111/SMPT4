package cac.fhict.org.coachingappcoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AppCoachQuestion extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_coach_question);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnAnswer1 = (Button)findViewById(R.id.btnAnswer1);
        Button btnAnswer2 = (Button)findViewById(R.id.btnAnswer2);
        Button btnAnswer3 = (Button)findViewById(R.id.btnAnswer3);
        Button btnAnswer4 = (Button)findViewById(R.id.btnAnswer4);
        Button btnBack = (Button) findViewById(R.id.btnQuestion2Back);

        btnAnswer1.setOnClickListener(this);
        btnAnswer2.setOnClickListener(this);
        btnAnswer3.setOnClickListener(this);
        btnAnswer4.setOnClickListener(this);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCoachQuestion.this.finish();
            }
        });
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(AppCoachQuestion.this, AppCoachResult.class);
        AppCoachQuestion.this.startActivity(i);
    }
}
