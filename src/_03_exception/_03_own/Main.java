package _03_exception._03_own;

import static _03_exception._03_own.Factorial.getFactorial;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(getFactorial(3));
        } catch (FactorialException e) {
            System.err.println(e.getMessage()+e.getNumber());
        }

    }
}
