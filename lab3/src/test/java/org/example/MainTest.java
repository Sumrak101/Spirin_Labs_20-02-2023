package org.example;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void zadacha1() {
        String input = "300";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int a = Main.USN(200);
        assertEquals(12,a);
    }
}