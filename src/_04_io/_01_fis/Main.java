package _04_io._01_fis;

import lombok.SneakyThrows;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static final String FILE1 = "src/_04_io/_01_fis/test";
    public static final String FILE2 = "src/_04_io/_01_fis/test2";

    @SneakyThrows
    public static void main(String[] args) throws FileNotFoundException {
        try (var fos = new FileOutputStream(FILE1);
             var fis = new FileInputStream(FILE1);
             var fos1 = new FileOutputStream(FILE2);
        ) {
            var outBytrArray = "Hollo мир!!!!".getBytes();
            fos.write(outBytrArray);
            byte[] bytes = fis.readAllBytes();
            System.out.println(new String(bytes));

            fos1.write(bytes);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
