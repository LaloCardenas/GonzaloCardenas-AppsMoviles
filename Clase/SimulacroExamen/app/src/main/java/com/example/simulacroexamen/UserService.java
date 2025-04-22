package com.example.simulacroexamen;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService {
    @GET("/fca")
    Call<List<User>> listUsers();
}
