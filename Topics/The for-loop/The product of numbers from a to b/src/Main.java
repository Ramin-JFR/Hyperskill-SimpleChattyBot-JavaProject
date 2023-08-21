import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        int a = 1;
        for (int i= input1; i<input2;i++){
            a *= i;
        }

        System.out.println(a);
    }
}