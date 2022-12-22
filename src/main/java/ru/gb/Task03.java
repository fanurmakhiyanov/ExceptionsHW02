package ru.gb;

import java.util.Arrays;

public class Task03  {
    public static void main(String[] args) throws Exception {
        int a = 90;
        int b = 0;
        try {
            int division = a / b;
            System.out.println(a + " / " + b + " = " + division);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
            System.out.println(Arrays.toString(abc));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex) {
            System.out.println("На ноль делить нельзя!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Сумма чисел " + a + " и " + b + " равна " + sum);
    }
}
