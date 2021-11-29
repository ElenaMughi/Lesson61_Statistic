package ru.netology.stats;

public class StatsService {

    public int calculateSum(long[] sales) {  //сумма продаж
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAverage(long[] sales) {  //средняя сумма в месяц

        return calculateSum(sales) / sales.length;
    }

    public int minSales(long[] sales) {  //месяц минимальной продажи
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {  //месяц максимальной продажи
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }

        return maxMonth + 1;
    }

    public int countMonthMinSales(long[] sales) {  //количество месяцев, в которых продажи ниже среднего
        int countMinMonth = 0;
        int average = findAverage(sales);
        for (long sale : sales) {
            // sale - продажи в рассматриваемом месяце
            if (sale < average) {
                countMinMonth += 1;
            }
        }

        return countMinMonth;
    }

    public int countMonthMaxSales(long[] sales) {  //количество месяцев, в которых продажи выше среднего
        int countMaxMonth = 0;
        int average = findAverage(sales);
        for (long sale : sales) {
            // sale - продажи в рассматриваемом месяце
            if (sale > average) {
                countMaxMonth += 1;
            }
        }

        return countMaxMonth;
    }
}
