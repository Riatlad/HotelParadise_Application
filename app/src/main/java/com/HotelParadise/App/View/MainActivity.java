package com.HotelParadise.App.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.HotelParadise.App.R;

public class MainActivity extends AppCompatActivity {
    private EditText etUsername;
    private EditText etPassword;
    private TextView tvError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.et_Username);
        etPassword = findViewById(R.id.et_Password);
        Button bLogin = findViewById(R.id.bLogin);
        tvError = findViewById(R.id.textViewError);
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (isValidCredentials(username, password)) {
                    tvError.setText(""); // Limpiamos el error
                    Toast.makeText(MainActivity.this, "Inicio de sesión correcto!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, menu_activity.class);
                    startActivity(intent);

                    // Finalizar la activity para no volver a la login screen (bendisiones a internet)
                    finish();
                } else {
                    tvError.setText("Login incorrecto.");
                }
            }
        });
    }

    protected boolean isValidCredentials(String username, String password) {
        return (username.equals("cliente") && password.equals("cliente") || username.equals("admin") && password.equals("admin"));
    }
}