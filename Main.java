import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter an integer greater than 0");
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        collatzConjecture(n);
    }

    public static void collatzConjecture(long number) {
        int step = 0;
        String action = "";
        if (number > 0) {
            while (number != 1) {
                if (number % 2 == 0) {
                    number /= 2;
                    step++;
                    action = "( / 2 )";
                } else if (number % 2 != 0) {
                    number = (number * 3) + 1;
                    step++;
                    action = "( * 3 + 1 )";
                }
                String line = String.format(("\tStep %d: %d\t%s"), step, number, action);
                System.out.println(line);
            }

            String lastText = String.format("\n\tAfter %d steps, the algorithm reached 1.", step);
            System.out.println(lastText);
        } else {
            throw new Error("Enter an integer greater than 0");
        }
    }
}
