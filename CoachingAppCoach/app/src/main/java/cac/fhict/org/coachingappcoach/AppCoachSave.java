package cac.fhict.org.coachingappcoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AppCoachSave extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_coach_save);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnSaveCancel = (Button)findViewById(R.id.btnFindApp);
        Button btnSaveSave = (Button)findViewById(R.id.btnSaveSave);

        btnSaveCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCoachSave.this.finish();
            }
        });

        btnSaveSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar sb = Snackbar.make(view, "Application Saved", Snackbar.LENGTH_SHORT);
                sb.show();

                Intent i = new Intent(AppCoachSave.this, SportAppCoach.class);
                AppCoachSave.this.startActivity(i);
            }
        });
    }

}
