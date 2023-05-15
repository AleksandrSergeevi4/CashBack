package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldReturn900() {
        int amount = 100;

        int expected = 900;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}