import java.util.Scanner;

public class Main {
    public static boolean Prime(int number, int i) {

        if (number <= 2) {
            return (number == 2) ? true : false;
        }
        if (number == i) {
            return true;
        }
        if (number % i == 0) {
            return false;
        }
        return Prime(number, i + 1);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        do {
            System.out.print("Sayi giriniz: ");
            n = input.nextInt();

            if (Prime(n, 2)) {
                System.out.println(n + " asal sayıdır!");
            } else {
                System.out.println(n + " asal sayı değil!");
            }
        } while (n > 1);
    }
}