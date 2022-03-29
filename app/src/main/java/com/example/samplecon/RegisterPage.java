package com.example.samplecon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class RegisterPage extends AppCompatActivity {
    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;

    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtNama.getText().toString().isEmpty() ||
                edtAlamat.getText().toString().isEmpty() ||
                edtEmail.getText().toString().isEmpty() ||
                edtPassword.getText().toString().isEmpty() ||
                edtrepass.getText().toString().isEmpty()) {
                    Snackbar.make(view, "wajib isi seluruh data !!!", Snackbar.LENGTH_LONG).show();
                }
                else {
                    if (edtPassword.getText().toString().equals(edtrepass.getText().toString())) {
                        Toast.makeText(getApplicationContext(), "Pendaftran Berhasil...", Toast.LENGTH_SHORT).show();

                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    } else {
                        Snackbar.make(view, "Password dan Repassword haus sama!!!!",
                                Snackbar.LENGTH_LONG).show();
                    }


                    }
                }
            });

    }
}