import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSequence = scanner.nextInt();

        int zero = 0;
        int one = 0;
        int minusOne = 0;

        for (int i = 0; i < numberOfSequence; i++) {

            int input = scanner.nextInt();

            if (input == 0) {
                zero++;
            } else if (input == 1) {
                one++;
            } else {
                minusOne++;
            }

        }
        System.out.println(zero + " " + one + " " + minusOne);

    }
}