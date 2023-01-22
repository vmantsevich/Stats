package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;

        }
        return result;
    }

    public long mid(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSale(long[] sales) {
        int maxMonth = 0;
        long maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxMonth = i;
                maxSale = sales[i];
            }
        }
        return maxMonth + 1;

    }

    public int minSale(long[] sales) {
        int minMonth = 0;
        long minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minMonth = i;
                minSale = sales[i];
            }
        }
        return minMonth + 1;
    }

    public int calcMonthMin(long[] sales) {
        int calc = 0;
        for (long sale : sales) {
            if (sale < mid(sales)) {
                calc++;
            }
        }
        return calc;
    }

    public int calcMonthMax(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > mid(sales)) {
                count++;
            }
        }
        return count;
    }
}