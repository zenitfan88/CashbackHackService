package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void buyingLessThousand() {
        int actual = service.remain(879);
        int expected = 121;
        assertEquals(actual, expected);
    }

    @Test
    public void buyingOverThousand() {
        int actual = service.remain(2375);
        int expected = 625;
        assertEquals(actual, expected);
    }

    @Test
    public void buyingThousand() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void buyingLessThousandJunitJupiter() {
        int actual = service.remain(879);
        int expected = 121;
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void buyingOverThousandJunitJupiter() {
        int actual = service.remain(2375);
        int expected = 625;
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void buyingThousandJunitJupiter() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}