package com.example.webservices;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ContactService {
    @GET("fca")
    Call<List<Contact>> listContacts();
}
