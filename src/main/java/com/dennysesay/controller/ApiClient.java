package com.dennysesay.controller;

import com.dennysesay.model.User;

public class ApiClient {
    public interface ApiCallback {
        void onSuccess(User user);
        void onFailure(String error);
    }

    public static void fetchUser(ApiCallback callback) {
        // Simulate network request
        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (Math.random() < 0.5) {
                callback.onSuccess(new User("Alice", 25));
            } else {
                callback.onFailure("Failed to fetch user");
            }
        }).start();
    }
}
