package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldCountSumOfSales() { //1
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.getSumSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCountAvgSumOfSalesInMonth() { //2
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;
        double actual = service.getAvgSumSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindNumOfLastMonthWithMaxSales() { //3
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.getNumOfMonthMaxSale(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindNumOfLastMonthWithMinSales() { //4
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.getNumOfMonthMinSale(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindAmountOfMonthsWithSalesUnderAvg() { //5
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getAmountMonthUnderAvg(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindAmountOfMonthsWithSalesOverAvg() { //6
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getAmountMonthOverAvg(sales);
        Assertions.assertEquals(expected, actual);
    }
}
