package ru.netology.stats;

public class StatsService {

    public int getSumSales(int[] sales) { //1.сумма продаж
        int sum = 0;
        for (int i = 0; i < sales.length; i++) { //или через forEach
            sum = sum + sales[i]; //к накопившейся сумме прибавляй и-ячейку массива
        }
        return sum;
    }

    public double getAvgSumSales(int[] sales) { //2. средняя сумма
        double avg = 0;
        for (int i : sales) {
            avg = avg + i; //к каждым продажам прибавляем следующую продажу
        }
        return avg / sales.length; //добавить скобок весь ретерн?
    }

    public int getNumOfMonthMaxSale(int[] sales) { //3. месяц макс.суммы
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) { //перебери все значения
            if (sales[i] >= sales[maxMonth]) { //или равно?
                maxMonth = i; //сохрани, если i-продажа большая
            }
        }
        return maxMonth + 1;
    }

    public int getNumOfMonthMinSale(int[] sales) { //4. месяц мин.суммы
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) { //перебери всех
            if (sales[i] <= sales[minMonth]) { //или равно? //если меньше минимального
                minMonth = i; //сохрани, если i-продажа большая
            }
        }
        return minMonth + 1; //номер месяца, а не индекс
    }

    public int getAmountMonthUnderAvg(int[] sales) { //где-то дабл?
        double avg = getAvgSumSales(sales);
        int monthUnderAvg = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                monthUnderAvg++;
            }
        }
        return monthUnderAvg;
    }

    public int getAmountMonthOverAvg(int[] sales) { //где-то дабл?
        double avg = getAvgSumSales(sales);
        int monthOverAvg = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                monthOverAvg++;
            }
        }
        return monthOverAvg;
    }

}
