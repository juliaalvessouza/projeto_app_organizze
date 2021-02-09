package com.example.apporganizze.activits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.apporganizze.R;
import com.example.apporganizze.helper.ConfigFirebase;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("App Organizze");
    }

    public void buttonEntrar(View view){
        Intent intent = new Intent(this, LoginActivity.class );
        startActivity(intent);
    }
    public void buttonCadastrar(View view){
        Intent intent = new Intent(this, CadastroActivity.class );
        startActivity(intent);
    }
    public void verificarUsuarioLogado(){
        auth = ConfigFirebase.getFirebaseAuth();
//        auth.signOut();
        if(auth.getCurrentUser()!= null){
            abrirTelaPrincipal();
        }
    }
    public void abrirTelaPrincipal(){
        Intent intent = new Intent(this, OrganizzeActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        verificarUsuarioLogado();
    }
}