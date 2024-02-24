package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void Calc() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1800);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void Calc1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
