import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String result = input.endsWith("burg") ? "true" : "false";
        System.out.println(result);
    }
}