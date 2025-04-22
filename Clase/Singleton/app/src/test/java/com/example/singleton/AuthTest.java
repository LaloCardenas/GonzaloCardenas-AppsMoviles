package com.example.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.Random;

public class AuthTest {

    static Usuario create() {
        Random random = new Random();
        String id = String.valueOf(random.nextLong());
        String id2 = String.valueOf(random.nextLong());
        Date exp = new Date();
        AuthToken token = new AuthToken(id2, exp);
        return new Usuario(id, "mario", "lalo@gmail.com");
    }

    @Test
    public void testUser() {
        Usuario usuario = AuthTest.create();
        Assert.assertEquals(usuario.getName(), "Mario");
        Assert.assertEquals(usuario.getEmail(), "lalo@gmail.com");
        Assert.assertNotNull(usuario.authToken);
    }

    @Test
    public void testTokenExpired() {
        Usuario usuario = AuthTest.create();
        Assert.assertFalse(Authenticator.getInstance().isLogged(usuario));
    }

    @Test
    public void testTokenNotExpired() {
        Usuario usuario = AuthTest.create();
        Authenticator.getInstance().logIn(usuario);
        Assert.assertNotNull(usuario.authToken);
    }

    @Test
    public void testTokenSuccess() {
        Usuario usuario = AuthTest.create();
        Authenticator.getInstance().logIn(usuario);
        Assert.assertNotNull(usuario.authToken);
    }

    @Test
    public void testUserIsLogged() {
        Usuario usuario = AuthTest.create();
        Authenticator.getInstance().logIn(usuario);
        Assert.assertTrue(Authenticator.getInstance().isLogged(usuario));
    }

    @Test
    public void testUserIsNotLogged() {
        Usuario usuario = AuthTest.create();
        Assert.assertFalse(Authenticator.getInstance().isLogged(usuario));
    }
}
