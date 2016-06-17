package cac.fhict.org.coachingappcoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;

public class AppFinderResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_finder_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TableLayout table = (TableLayout)findViewById(R.id.tloAppResult);
        final LinearLayout lloApp = (LinearLayout)findViewById(R.id.lloApp);
        final Button btnAFResultNext = (Button)findViewById(R.id.btnAFResultNext);
        final Button btnAFResultBack = (Button)findViewById(R.id.btnAFResultBack);

        btnAFResultNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AppFinderResult.this, AppFinderProduct.class);
                AppFinderResult.this.startActivity(i);
            }
        });

        btnAFResultBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppFinderResult.this.finish();
            }
        });

        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                lloApp.setVisibility(View.VISIBLE);
                btnAFResultNext.setVisibility(View.VISIBLE);
            }
        });

    }

}
