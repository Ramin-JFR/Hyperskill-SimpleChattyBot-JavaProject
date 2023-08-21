import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int r3 = scanner.nextInt();

        int sum = (int) Math.ceil((double) r1 / 2) + (int) Math.ceil((double) r2 / 2)
                + (int) Math.ceil((double) r3 / 2);
        System.out.println(sum);


    }
}