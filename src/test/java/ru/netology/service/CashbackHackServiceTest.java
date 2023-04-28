package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void remainTestEquivalence() {
        CashbackHackService service = new CashbackHackService();
//        int actual = service.remain(950);
//        int expected = 50;
        assertEquals(service.remain(950), 50);
    }
    @Test
    public void remainTestWhenMaxBoundary () {
        CashbackHackService service = new CashbackHackService();
//        int actual = service.remain(999);
//        int expected = 1;
        assertEquals(service.remain(999), 1);
    }
    @Test
    public void remainTestWhenMinBoundary () {
        CashbackHackService service = new CashbackHackService();
//        int actual = service.remain(1);
//        int expected = 999;
        assertEquals(service.remain(1), 999);
    }
    @Test
    public void remainTestWhenMin () {
        CashbackHackService service = new CashbackHackService();
//        int actual = service.remain(0);
//        int expected = 1000;
        assertEquals(service.remain(0), 1000);
    }
    @Test
    public void remainTestWhenMax () {
        CashbackHackService service = new CashbackHackService();
//        int actual = service.remain(1000);
//        int expected = 0;
        assertEquals(service.remain(1000), 0);
    }
}
