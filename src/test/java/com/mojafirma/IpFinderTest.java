package com.mojafirma;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bartek on 2017-07-31.
 */
public class IpFinderTest {

    IpFinder ipFinder = new IpFinder();

    @Before
    public void setUp() throws Exception {
    ipFinder = new IpFinder();
    }

    @Test
    public void hasIp() throws Exception {
        String testIp1 = "Serwer gry dostępny jest pod adresem 1.2.2.9 - miłej zabawy!";
        assertTrue(ipFinder.hasIp(testIp1));
        String testIp2= "Adres domeny mojafirma.com to 23.345.45.900";
        assertTrue(ipFinder.hasIp(testIp2));
        String testIp3 = "Współrzędne to 90.3454 stopnie na północ";
        assertFalse(ipFinder.hasIp(testIp3));
        String testIp4 = "Tu nie ma nawet żadnych cyfr!";
        assertFalse(ipFinder.hasIp(testIp4));
    }

    @Test
    public void getIp() throws Exception {
        String testIp1 = "Serwer gry dostępny jest pod adresem 10.245.20.90 - miłej zabawy!";
        assertEquals("10.245.20.90",ipFinder.getIp(testIp1));
        String testIp2= "Adres domeny mojafirma.com to 23.345.45.900";
        assertEquals("23.345.45.900",ipFinder.getIp(testIp2));
        String testIp3 = "Współrzędne to 90.3454 stopnie na północ";
        assertNull(ipFinder.getIp(testIp3));
        String testIp4 = "Tu nie ma nawet żadnych cyfr!";
        assertNull(ipFinder.getIp(testIp4));
    }

}