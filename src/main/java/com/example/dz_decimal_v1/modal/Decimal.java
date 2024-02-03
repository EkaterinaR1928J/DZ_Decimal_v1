package com.example.dz_decimal_v1.modal;

public class Decimal {
    // Проверка, является ли дробь правильной
    public static String decimalIsCorrect(int numerator, int denumerator) {
        if (Math.abs(numerator) < Math.abs(denumerator)) {
            return String.format("Дробь %d/%d является правильной", numerator, denumerator);
        } else {
            return String.format("Дробь %d/%d является не правильной", numerator, denumerator);
        }
    }

    // Сокращение дроби
    public static String decimalReduction(int numerator, int denumerator) {
        // поиск общего делителя для сокращения дроби
        int divisor = getDivisor(numerator, denumerator);
        // возврат итоговой строки
        return String.format("Общий делитель для дроби %d/%d равен %d. " +
                "\nДробь после сокращения равна %d/%d", numerator, denumerator, divisor,
                numerator/divisor, denumerator/divisor);
    }

    // Сложение дробей
    public static String decimalAddition(int numerator1, int denumerator1, int numerator2, int denumerator2) {
        // сложение дробей путем перемножения знаменателей
        int numeratorRez = (numerator1 * denumerator2) + (numerator2 * denumerator1);
        int denumeratorRez = denumerator1 * denumerator2;

        // поиск общего делителя для сокращения дроби
        int divisor = getDivisor(numeratorRez, denumeratorRez);

        return String.format("Сумма дробей %d/%d и %d/%d равна %d/%d", numerator1, denumerator1,
                numerator2, denumerator2, numeratorRez/divisor, denumeratorRez/divisor);
    }

    // Вычитание дробей
    public static String decimalSubtract(int numerator1, int denumerator1, int numerator2, int denumerator2) {
        // вычитание дробей путем перемножения знаменателей
        int numeratorRez = (numerator1 * denumerator2) - (numerator2 * denumerator1);
        int denumeratorRez = denumerator1 * denumerator2;

        // поиск общего делителя для сокращения дроби
        int divisor = getDivisor(numeratorRez, denumeratorRez);

        return String.format("Разность дробей %d/%d и %d/%d равна %d/%d", numerator1, denumerator1,
                numerator2, denumerator2, numeratorRez/divisor, denumeratorRez/divisor);
    }

    // Умножение дробей
    public static String decimalMultiplication(int numerator1, int denumerator1, int numerator2, int denumerator2) {
        // умножение дробей путем перемножения числителей и знаменателей
        int numeratorRez = numerator1 * numerator2;
        int denumeratorRez = denumerator1 * denumerator2;

        // поиск общего делителя для сокращения дроби
        int divisor = getDivisor(numeratorRez, denumeratorRez);

        return String.format("Произведение дробей %d/%d и %d/%d равно %d/%d", numerator1, denumerator1,
                numerator2, denumerator2, numeratorRez/divisor, denumeratorRez/divisor);
    }

    // Деление дробей
    public static String decimalDivide(int numerator1, int denumerator1, int numerator2, int denumerator2) {
        // деление дробей путем перемножения первой дроби и обратной дроби для второй
        int numeratorRez = numerator1 * denumerator2;
        int denumeratorRez = denumerator1 * numerator2;

        // поиск общего делителя для сокращения дроби
        int divisor = getDivisor(numeratorRez, denumeratorRez);

        return String.format("Результат деления дробей %d/%d и %d/%d равно %d/%d", numerator1, denumerator1,
                numerator2, denumerator2, numeratorRez/divisor, denumeratorRez/divisor);
    }


    // Метод поиска общего делителя
    public static int getDivisor(int numerator, int denumerator) {
        int min, divisor = 1; //divisor - общий делитель
        //находим минимальное число по модулю из числителя и знаменателя для определения диапазона перебора делителей
        if (Math.abs(numerator) < Math.abs(denumerator)) {min = Math.abs(numerator);}
        else {min = Math.abs(denumerator);}
        // находим максимальный общий делитель
        for (int i = 2; i <= min; i++) {
            if (numerator % i == 0 && denumerator % i == 0) {
                divisor = i; // запоминаем число, как общий делитель
            }
        }
        return divisor;
    }






}
