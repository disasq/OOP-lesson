package assignment_1;

public class Task8 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;
        while (number <= 100) {
            if (number % 3 == 0) {
                number++;
                continue;
            }
            sum += number;

            number++;
        }
        System.out.println(sum);
    }
}