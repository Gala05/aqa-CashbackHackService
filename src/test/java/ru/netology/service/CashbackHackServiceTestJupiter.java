package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTestJupiter {

    @Test
    void remainTestEquivalence() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(950);
        int expected = 50;
        assertEquals(actual, expected);
    }
    @Test
    void remainTestWhenMaxBoundary () {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }
    @Test
    void remainTestWhenMinBoundary () {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(actual, expected);
    }
    @Test
    void remainTestWhenMin () {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }
    @Test
    void remainTestWhenMax () {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
