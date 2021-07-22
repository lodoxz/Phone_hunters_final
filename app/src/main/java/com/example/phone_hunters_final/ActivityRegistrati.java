package com.example.phone_hunters_final;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class ActivityRegistrati extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private EditText username;
    private EditText email;
    private EditText password;
    private EditText conferma_password;
    private Button registrati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrati);

        mAuth = FirebaseAuth.getInstance();

        username = findViewById(R.id.edit_registrati);
        email = findViewById(R.id.edit_registrati1);
        password = findViewById(R.id.edit_registrati2);
        conferma_password = findViewById(R.id.edit_registrati3);
        registrati=findViewById(R.id.button_login2);
        registrati.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        registraUtente();
    }

    private void registraUtente(){
        String username1= username.getText().toString().trim();
        String email1= email.getText().toString().trim();
        String password1= password.getText().toString().trim();
        String conferma_password1= conferma_password.getText().toString().trim();

        if(username1.isEmpty()){
            username.setError("username richiesto");
            username.requestFocus();
            return;
        }
        if(email1.isEmpty()){
            email.setError("indirizzo email richiesto");
            email.requestFocus();
            return;
        }
        if(password1.isEmpty()){
            password.setError("password richiesta");
            password.requestFocus();
            return;
        }
        if(conferma_password1.isEmpty()){
            conferma_password.setError("confermare la password");
            conferma_password.requestFocus();
            return;
        }else
        {
            if(!password1.equalsIgnoreCase(conferma_password1)){
                conferma_password.setError("le password non coincidono");
            }
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(email1).matches()){
            email.setError("inserire un indirizzo valido");
            email.requestFocus();
            return;

        }

        if(password1.length() < 6){
            password.setError("la password deve contenere almeno 6 caratteri");
            password.requestFocus();
            return;

        }
        mAuth.createUserWithEmailAndPassword(email1, password1)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Utente utente = new Utente(username1, email1);

                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(utente).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {

                                    if(task.isSuccessful()){

                                        Toast.makeText(ActivityRegistrati.this, "l'utente è stato registrato", Toast.LENGTH_LONG).show();
                                    }else{
                                        Toast.makeText(ActivityRegistrati.this,"utente non registrato", Toast.LENGTH_LONG).show();
                                    }
                                }
                            });
                        }else{
                            Toast.makeText(ActivityRegistrati.this,"utente non registrato", Toast.LENGTH_LONG).show();
                        }
                    }
                });


    }


}