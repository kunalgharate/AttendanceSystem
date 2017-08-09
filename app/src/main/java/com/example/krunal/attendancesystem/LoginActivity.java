package com.example.krunal.attendancesystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends Activity {


    private TextView about_us;
    private Button login_btn;
    // UI references.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Set up the login form.

        login_btn = (Button) findViewById(R.id.login_btn);
        about_us = (TextView) findViewById(R.id.about_us);

        login_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.login_btn) {
                    Intent intent = new Intent(LoginActivity.this, Student_Grid.class);
                    startActivity(intent);
                }
            }
        });

    }

}

