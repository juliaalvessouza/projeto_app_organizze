package com.example.apporganizze.helper;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ConfigFirebase {
    private static FirebaseAuth auth;
    private static DatabaseReference firebase;

//    retorna a instancia do firebase
    public static FirebaseAuth getFirebaseAuth(){
        if(auth==null){
            auth = FirebaseAuth.getInstance();
        }
        return auth;
    }

//    retorna a instancia do firebase DB
    public static DatabaseReference getFirebaseDB(){
        if(firebase == null){
           firebase = FirebaseDatabase.getInstance().getReference();
        }
        return firebase;
    }
}
