package com.HotelParadise.App.View;

import junit.framework.TestCase;
import com.HotelParadise.App.View.MainActivity;

import org.junit.Test;

public class MainActivityTest extends TestCase {
    @Test
    public void isValidCredentialsTest() {
        MainActivity ma = new MainActivity();
        assertTrue(ma.isValidCredentials("cliente", "cliente"));
        assertTrue(ma.isValidCredentials("admin", "admin"));
    }

}