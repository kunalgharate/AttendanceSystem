package com.example.krunal.attendancesystem;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends Activity implements OnClickListener{



    // UI references.
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private View mProgressView;
    private View mLoginFormView;
    private TextView about;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Set up the login form.
        mEmailView = (AutoCompleteTextView) findViewById(R.id.email);
        about = (TextView) findViewById(R.id.about_us);
        mPasswordView = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login_btn);

        about.setOnClickListener(this);
        login.setOnClickListener(this);

    }




    /**
     * Attempts to sign in or register the account specified by the login form.
     * If there are form errors (invalid email, missing fields, etc.), the
     * errors are presented and no actual login attempt is made.
     */




    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.login_btn) {

            Toast.makeText(this,"This is test Msg",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(LoginActivity.this, Student_Grid.class);
            startActivity(intent);

        }
        
      /*  if (v.getId()==R.id.about_us)
        {
            RelativeLayout linearLayout = (RelativeLayout) findViewById(R.id.Login_relative);
            View child = getLayoutInflater().inflate(R.layout.about_us, null);
            linearLayout.addView(child);
        }
*/




    }


}

