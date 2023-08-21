import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();


        if (two <= one && one <= three || two >= one && one >= three) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
