package com.example.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

public class LocalStorage<T> implements Storage {
    private static String id = "com.local.storage";
    Context context;
    SharedPreferences sharedPreferences;

    public LocalStorage(Context context) {
        this.context = context;
        this.sharedPreferences = context.getSharedPreferences(id, Context.MODE_PRIVATE);
    }

    @Override
    public <T> void setValue(T value, String key) throws StorageException {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        if (value instanceof String) {
            editor.putString(key, (String) value);
        } else if (value instanceof Integer) {
            editor.putInt(key, (Integer) value);
        } else if (value instanceof Float) {
            editor.putFloat(key, (Float) value);
        } else if (value instanceof Long) {
            editor.putLong(key, (Long) value);
        } else {
            throw new StorageException();
        }
        editor.apply();
    }

    @Override
    public <T> T getValue(String key, T optional) {
        if (optional instanceof String) {
            String value = sharedPreferences.getString(key, (String) optional);
            return (T) value;
        } else if (optional instanceof Integer) {
            Integer value = sharedPreferences.getInt(key, (Integer) optional);
            return (T) value;
        } else if (optional instanceof Float) {
            Float value = sharedPreferences.getFloat(key, (Float) optional);
            return (T) value;
        } else if (optional instanceof Long) {
            Long value = sharedPreferences.getLong(key, (Long) optional);
            return (T) value;
        } else {
            return null;
        }
    }
}
