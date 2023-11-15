package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.github.hariprasanths.floatingtoast.FloatingToast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText username=(EditText) findViewById(R.id.username);
        EditText password=(EditText) findViewById(R.id.password);
        Button login=(Button) findViewById(R.id.button);



        int duration = FloatingToast.LENGTH_MEDIUM;

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin")&& password.getText().toString().equals("1234")) {

                    FloatingToast toast = FloatingToast.makeToast(login, "welcome admin", FloatingToast.LENGTH_MEDIUM);
                    toast.show();

                }else if (username.getText().toString().equals("amir")&& password.getText().toString().equals("123")){

                    FloatingToast toast = FloatingToast.makeToast(login, "welcome amir", FloatingToast.LENGTH_MEDIUM);
                    toast.show();

                }else if (username.getText().toString().equals("ali")&& password.getText().toString().equals("12345678")){

                    FloatingToast toast = FloatingToast.makeToast(login, "welcome ali", FloatingToast.LENGTH_MEDIUM);
                    toast.show();

                }else {
                    FloatingToast toast = FloatingToast.makeToast(login, "user or password is wrong", FloatingToast.LENGTH_MEDIUM);
                    toast.show();
                }


            }
        });

    }
}