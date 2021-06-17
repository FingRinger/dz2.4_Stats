package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void averageSalesPerMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageSalesPerMonth(sales);

        assertEquals(expected, actual);}

    @Test
    void maxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxMonth(sales);

        assertEquals(expected, actual);}


    @Test
    void minSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void lessThenMonthlyAverage() {
        StatsService service = new StatsService ();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.lessThenMonthlyAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void theSumOfAllSales() {
        StatsService service = new StatsService ();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.theSumOfAllSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void moreThenMonthlyAverage() {
    StatsService service = new StatsService ();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expected = 5;

    long actual = service.moreThenMonthlyAverage(sales);

    assertEquals(expected, actual);
    }
}