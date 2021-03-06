package com.mongodb.stitch.android.auth.apiKey;

import android.support.annotation.NonNull;

import com.mongodb.stitch.android.auth.AuthProvider;

import org.bson.Document;

/**
 * APIKeyProvider provides a way to authenticate using a generated apiKey.
 */
public class APIKeyProvider implements AuthProvider {
    public static final String AUTH_TYPE = "api-key";

    @NonNull
    private final String _key;

    public APIKeyProvider(@NonNull final String key) {
        this._key = key;
    }

    @Override
    public String getType() {
        return AUTH_TYPE;
    }

    @Override
    public Document getAuthPayload() {
        return new Document("key", this._key);
    }
}
