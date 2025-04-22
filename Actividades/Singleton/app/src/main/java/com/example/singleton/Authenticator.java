package com.example.singleton;

import java.util.Date;
import java.util.Random;

public class Authenticator {

    private static Authenticator instance = null;

    private Authenticator() {

    }

    public static Authenticator getInstance() {
        if (instance == null) {
            instance = new Authenticator();
        }
        return instance;
    }

    public Boolean isLogged(Usuario usuario) {
        if (usuario.authToken == null) {
            return false;
        }
        Date exp = usuario.authToken.expiration;
        Date now = new Date();
        long diff = exp.getTime() - now.getTime();
        if (diff > 0) {
            return true;
        }
        return false;
    }

    public Boolean isLogged(Usuario usuario) {
        if (usuario.authToken == null) {

        }
        return usuario.authToken == null;
    }

    public Usuario logIn(Usuario usuario) {
        Usuario newUsuario = usuario;
        String id = String.valueOf(new Random().nextLong());
        Date exp = new Date(System.currentTimeMillis() + 1000000000);
        usuario.setAuthToken(new AuthToken(id, exp));
        return usuario;
    }

    public void logOut(Usuario usuario) {
        usuario.setAuthToken(null);
    }
}
