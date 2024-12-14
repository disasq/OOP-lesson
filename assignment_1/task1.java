package assignment_1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if (temperature < 0) {
            System.out.println("it’s cold outside");
        } else {
            System.out.println("it’s warm outside");
        }
    }
}
