package com.example.piggybank.Firebase;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Map;
import java.util.HashMap;
public class Post {
    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private final static String TAG = Post.class.getName();

    public void createUser(final String userId,
                           final String name,
                           final String userType,
                           final OnSuccessListener<Void> successListener,
                           final OnFailureListener failureListener) {System.out.println(name);
        Map<String, Object> user = new HashMap<>();
        user.put("name", name);
        user.put("userType", userType);
        db.collection("users").document(userId).set(user).addOnSuccessListener(successListener).addOnFailureListener(failureListener);
    }
}
