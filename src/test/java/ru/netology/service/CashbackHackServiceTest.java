package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;
public class CashbackHackServiceTest {
    @Test
    public void remainTestEquivalence() {
        CashbackHackService service = new CashbackHackService();
        int expected = 50;
        int actual = service.remain(950);

        assertEquals(expected, actual);
    }
    @Test
    public void remainTestWhenMaxBoundary () {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int actual = service.remain(999);

        assertEquals(expected, actual);
    }
    @Test
    public void remainTestWhenMinBoundary () {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1);

        assertEquals(expected, actual);
    }
    @Test
    public void remainTestWhenMin () {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(expected, actual);
    }
    @Test
    public void remainTestWhenMax () {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }
}