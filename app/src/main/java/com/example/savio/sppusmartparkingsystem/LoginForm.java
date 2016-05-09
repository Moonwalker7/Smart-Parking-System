package com.example.savio.sppusmartparkingsystem;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class LoginForm extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        final TextView email = (TextView) findViewById(R.id.editText_email_id);
        final TextView password = (TextView) findViewById(R.id.editText_reg_password);
        final Button login = (Button) findViewById(R.id.button_login);
        final TextView register_link = (TextView) findViewById(R.id.textView_register);
        final ProgressBar load = ( ProgressBar ) findViewById( R.id.login_load );

        if (register_link != null) {

            register_link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(LoginForm.this, "Register", Toast.LENGTH_SHORT).show();

                    Intent intent_register = new Intent(LoginForm.this, RegistrationForm.class);
                    LoginForm.this.startActivity(intent_register);
                }
            });
        }

        if (login != null) {

            login.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    load.setVisibility( View.VISIBLE );
                    final String user_email = email.getText().toString();
                    final String user_password = password.getText().toString();

                    if (user_email.contains("admin") && user_password.contains( "admin") ) {
                        Toast.makeText(LoginForm.this, "Login Successfull:)", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginForm.this, CheckAvailability.class);
                        LoginForm.this.startActivity(intent);
                        LoginForm.this.finish();
                    }
                    //else {
                    //  Toast.makeText( LoginForm.this, "Login Failed\n Please Try Again !", Toast.LENGTH_LONG ).show();
                    //}

                }
            });
        }

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "LoginForm Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.savio.sppusmartparkingsystem/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "LoginForm Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.savio.sppusmartparkingsystem/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
