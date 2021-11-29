package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    long[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldCalculateSum() {
        long expected = 180;
        long actual = service.calculateSum(managerSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAverageSales() {
        long expected = 15;
        long count = service.findAverage(managerSales);

        assertEquals(expected, count);
    }

    @Test
    void shouldMinSales() {
        long expected = 9;
        long count = service.minSales(managerSales);

        assertEquals(expected, count);
    }

    @Test
    void shouldMaxSales() {
        long expected = 8;
        long count = service.maxSales(managerSales);

        assertEquals(expected, count);
    }

    @Test
    void shouldCountMinSales() {
        long expected = 5;
        long count = service.countMonthMinSales(managerSales);

        assertEquals(expected, count);
    }

    @Test
    void shouldCountMaxSales() {
        long expected = 5;
        long count = service.countMonthMaxSales(managerSales);

        assertEquals(expected, count);
    }

}