package _03_exception._02_procesing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        try {
            numbers[2] = Integer.parseInt("23");
            System.out.println(numbers[4]);
        } catch (NumberFormatException e) {
            System.err.println("Only digits!!!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("More than size");
        } finally {
            System.out.println("Inside Finaly");
        }
        System.out.println("Finish!");
    }

    public static class Main2 {
        public static void main(String[] args) {
            var sc=new Scanner(System.in);
            try {
                if(sc.nextInt()>30){
                    throw new IllegalArgumentException("Number must be less than 30");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Finish");
        }
    }
}
