package com.pharos.a1_homework_1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    // Объявляем об использовании следующих объектов:
    private EditText username;
    private EditText password;
    private Button login;
    private TextView loginLocked;
    private TextView attempts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.edit_user);
        password = (EditText) findViewById(R.id.edit_password);
        login = (Button) findViewById(R.id.button_login);

    }

    public void Login(View view) {
        if (username.getText().toString().equals("geektech") &&
                password.getText().toString().equals("geektech")) {
            Toast.makeText(getApplicationContext(), "Успешно!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Вы ввели не правильные данные!", Toast.LENGTH_SHORT).show();
        }
    }
}