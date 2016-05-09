package com.example.savio.sppusmartparkingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrationForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);

        final TextView name = ( TextView ) findViewById( R.id.editText_reg_name );
        final TextView email = ( TextView ) findViewById( R.id.editText_reg_email_id );
        final TextView password = ( TextView ) findViewById( R.id.editText_reg_password );
        final TextView address = ( TextView ) findViewById( R.id.edit_text_reg_address );
        final RadioGroup role = ( RadioGroup ) findViewById( R.id.radioGroup_reg_role );
        final Button register = ( Button ) findViewById( R.id.button_reg_register );


        if( register != null ){

            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText( RegistrationForm.this, "Register", Toast.LENGTH_LONG ).show();

                    Intent login = new Intent( RegistrationForm.this, LoginForm.class );
                    RegistrationForm.this.startActivity( login );
                }
            });
        }

    }
}
