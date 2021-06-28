package ru.netology.stats;

public class StatsService {

    public long theSumOfAllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            // аналог sum = sum + purchase;
            sum += sale;
        }
        return sum;
    }

    public long averageSalesPerMonth(long[] sales) {

        long averageSalesPerMonth = theSumOfAllSales(sales) /sales.length;
        return averageSalesPerMonth;
    }

    public int maxMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public long lessThenMonthlyAverage(long[] sales) {

        int less = 0;
        for (long sale : sales)
            if (sale < averageSalesPerMonth(sales)) {
                less = less + 1;
            }
        return less;
    }

    public long moreThenMonthlyAverage(long[] sales){

        int more = 0;
        for (long sale : sales)
            if (sale > averageSalesPerMonth(sales)) {
                more = more + 1;
            }
        return more;
    }


}