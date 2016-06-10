package cac.fhict.org.coachingappcoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AppCoachResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_coach_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnResultBack = (Button)findViewById(R.id.btnFindApp);
        Button btnResultSave = (Button)findViewById(R.id.btnResultSave);

        btnResultBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCoachResult.this.finish();
            }
        });

        btnResultSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AppCoachResult.this, AppCoachSave.class);
                AppCoachResult.this.startActivity(i);
            }
        });
    }

}
