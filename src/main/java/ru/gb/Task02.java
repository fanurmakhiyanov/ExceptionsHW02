package ru.gb;

// Задание 2 (1)

public class Task02 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            int d = 25;
            if (d == 0) {
                throw new Exception("Can't divide by zero.");
            } else {
                double catchedRes1 = (double) numbers[5] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds. Set the index from 0 to " + numbers.length + ".");
        } catch (Exception e) {
            System.out.println("There was some error");
        }
    }
}