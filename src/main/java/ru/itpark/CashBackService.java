package ru.itpark;

public class CashBackService {
    private int percent1 = 1;
    private int percent2 = 5;
    private int percent3 = 30;

    public int calculateCashback(int category1, int category2, int category3) {
        int bonus1 = category1 * percent1 / 100;
        if (bonus1 > 3000) {
            bonus1 = 3000;
        }

        int bonus2 = category2 * percent2 / 100;
        if (bonus2 > 3000) {
            bonus2 = 3000;
        }
        int bonus3 = category3 * percent3 / 100;
        if (bonus3 > 3000) {
            bonus3 = 3000;
        }
        int bonus = bonus1 + bonus2 + bonus3;
        return bonus;

    }
}