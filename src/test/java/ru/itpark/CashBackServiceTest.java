package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @Test
    void calculateCashback() {
        CashBackService cashback = new CashBackService();
        int bonus = cashback.calculateCashback(1000, 2000, 3000);
        assertEquals(1010, bonus);
    }@Test
    void calculateCashbackMaxLimit() {
        CashBackService cashback = new CashBackService();
        int bonus = cashback.calculateCashback(90000000, 900000000, 900000000);
        assertEquals(9000, bonus);
    }
}