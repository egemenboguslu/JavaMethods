import java.util.Scanner;

public class Main {
    public static int fibonacci(int number) {

        int fib0 = 0, fib1 = 1, result = 0;

        System.out.print(fib0 + " " + fib1);

        for (int i = 0; i <= number; i++) {
            result = fib0 + fib1;
            fib0 = fib1;
            fib1 = result;
            System.out.print(" " + result);
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Görmek istediğiniz fibonacci serisini girin: ");
        int number = input.nextInt();

       fibonacci(number);
    }
}