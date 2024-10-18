package _03_exception._01_bad_code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите только цифры!!!!!");
        var sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            try {
                var number = parsInt(sc.nextLine());
                if (number == 0) {
                    System.exit(0);
                }
                System.out.println(number);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private static int parsInt(String str) throws Exception {
        if (!str.matches("\\d+")) {
            throw new Exception("Only number,stupid....");
        }

        return Integer.parseInt(str);
    }
}
