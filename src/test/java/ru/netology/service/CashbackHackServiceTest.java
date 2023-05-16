package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldReturn700() {
        int amount = 300;

        int expected = 700;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturn1000() {
        int amount = 0;

        int expected = 1_000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturn999() {
        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturn1() {
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturn800() {
        int amount = 1_200;

        int expected = 800;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturn0() {
        int amount = 1_000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}