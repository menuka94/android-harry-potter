package com.android.menuka.harrypotter.db_operations;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

/**
 * Created by menuka on 2/10/17.
 */

public class FirebaseHelper {
    private FirebaseApp app;
    private FirebaseStorage storage;
    private FirebaseAuth auth;
    private FirebaseDatabase database;

    private DatabaseReference databaseRef;
    private StorageReference storageRef;

    private static FirebaseHelper singletonInstance;

    private FirebaseHelper(){
        initFirebase();
    }

    private void initFirebase(){
        app = FirebaseApp.getInstance();
        database = FirebaseDatabase.getInstance(app);
        auth = FirebaseAuth.getInstance(app);
        storage = FirebaseStorage.getInstance(app);
    }

    public static FirebaseHelper getInstance(){
        singletonInstance = new FirebaseHelper();
        return singletonInstance;
    }

    public DatabaseReference getDatabaseReference(){
        return this.databaseRef;
    }

    public DatabaseReference getDatabaseReference(String child){
        return this.database.getReference(child);
    }

    public StorageReference getStorageReference(){
        return this.storageRef;
    }
}
