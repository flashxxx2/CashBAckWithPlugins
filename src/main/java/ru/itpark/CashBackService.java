package ru.itpark;

public class CashBackService {
    private int percent1 = 1;
    private int percent2 = 5;
    private int percent3 = 30;

    public int calculateCashback(int category1, int category2, int category3) {
        int bonus1 = category1 * percent1 / 100;

        int bonus2 = category2 * percent2 / 100;
        int bonus3 = category3 * percent3 / 100;
        int cashBack = bonus1 + bonus2 + bonus3;
        return cashBack;

    }
}