package com.example.sharedpreferences;

public interface Storage {
    <T> void setValue(T value, String key) throws StorageException;
    <T> T getValue(String key, T optional);
}
