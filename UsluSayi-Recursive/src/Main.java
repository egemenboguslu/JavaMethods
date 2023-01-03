import java.util.Scanner;

public class Main {
    public static int usAlma(int ust, int number) {

        /*  usAlma(4,3) = usAlma(3,3) * 3 = 81
            usAlma(3,3) = usAlma(2,3) * 3 = 27
            usAlma(2,3) = usAlma(1,3) * 3 = 9
            usAlma(1,3) = usAlma(0,3) * 3 = 3
            usAlma(0,3) = 1
         */

        if (ust == 0) {
            return 1;
        }
        int result = usAlma(ust - 1, number) * number;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("taban değerini giriniz: ");
        int number = input.nextInt();

        System.out.print("üs değeri giriniz: ");
        int ust = input.nextInt();

        System.out.println(usAlma(ust, number));
    }
}