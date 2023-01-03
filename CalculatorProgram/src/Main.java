import java.util.Scanner;

public class Main {
    public static void toplama() {

        Scanner input = new Scanner(System.in);
        int result = 0, number, i = 0;

        while (true) {
            System.out.print(++i + ". sayiyi girin:");
            number = input.nextInt();

            if (number == 0)
                break;
            result += number;
        }
        System.out.print("Sayıların toplamları: " + result);
    }

    public static void cikarma() {

        Scanner input = new Scanner(System.in);
        int number, result = 0, i = 0;

        while (true) {
            System.out.print(++i + ". sayiyi giriniz: ");
            number = input.nextInt();

            if (number == 0)
                break;
            result = number - result;

        }
        System.out.print("Çıkarma işlemi sonucu: " + result);
    }

    public static void carpma() {

        Scanner input = new Scanner(System.in);

        int number, result = 1, i = 0;

        while (true) {
            System.out.print(++i + ". sayiyi girin:");
            number = input.nextInt();

            if (number == 0)
                break;
            result *= number;
        }
        System.out.print("Çarpım işlemi sonucu: " + result);
    }

    public static void bolme() {

        Scanner input = new Scanner(System.in);
        int numberOne, numberTwo, result;

        System.out.print("First number: ");
        numberOne = input.nextInt();

        System.out.print("Second number: ");
        numberTwo = input.nextInt();

        if (numberTwo == 0) {
            System.out.print("Sayı 0'a bölünemez.");
        } else {
            result = numberOne / numberTwo;
            System.out.print("Bölme işlemi sonucu: " + result);
        }
    }

    public static void usAlma() {

        Scanner input = new Scanner(System.in);

        int alt, ust, result = 1;

        System.out.print("Sayiyi giriniz: ");
        alt = input.nextInt();

        System.out.print("Üs değerini giriniz: ");
        ust = input.nextInt();

        if (ust > 0) {
            for (int i = 1; i <= ust; i++) {
                result = alt * result;
            }
            System.out.println(alt + "^" + ust + " değeri:" + result);
        } else if (ust < 0) {
            ust = (-1) * ust;

            for (int i = 1; i <= ust; i++) {
                result = alt * result;
            }
            System.out.println(alt + "^" + ust + " değeri:" + 1 / result);
        } else {
            System.out.println(alt + "^" + 0 + " değeri: 1'dir.");
        }
    }

    public static void faktoriyel() {

        Scanner input = new Scanner(System.in);

        int number, result = 1;

        System.out.print("Sayiyi girin: ");
        number = input.nextInt();

        if (number > 0) {

            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            System.out.println(number + "!'in değeri:" + result);
        } else if (number == 0) {
            System.out.print("0!=1.");
        } else {
            System.out.println("Pozitif değer giriniz.");
        }
    }

    public static void modAlma() {

        Scanner input = new Scanner(System.in);

        int numberOne, numberTwo, result;

        System.out.print("First number: ");
        numberOne = input.nextInt();

        System.out.print("Second number: ");
        numberTwo = input.nextInt();

        if (numberOne > numberTwo) {

            result = numberOne % numberTwo;
            System.out.print("Sonuç: " + result);
        } else if (numberOne == numberTwo) {

            result = numberOne % numberTwo;
            System.out.print("Sonuç: " + result);
        } else {
            result = numberTwo % numberOne;
            System.out.print("Sonuç: " + result);
        }
    }

    public static void alanHesabi() {

        Scanner input = new Scanner(System.in);

        int kisaKenar, uzunKenar, alan, cevre;

        System.out.print("Kısa kernari giriniz:");
        kisaKenar = input.nextInt();

        System.out.print("Uuzn kenarı giriniz:");
        uzunKenar = input.nextInt();

        alan = kisaKenar * uzunKenar;
        System.out.println("Dikdörtgenin alanı: " + alan);

        cevre = 2 * (kisaKenar + uzunKenar);
        System.out.print("Dikdörtgenin çevresi:" + cevre);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("1-Toplama işlemi:\n" +
                "2-Çıkarma işlemi:\n" +
                "3-Çarpma işlemi:\n" +
                "4-Bölme işlemi:\n" +
                "5-Üs alma işlemi:\n" +
                "6-Faktöriyel işlemi:\n" +
                "7-Mod alma işlemi:\n" +
                "8-Dikdörtgen alan-çevre hesabı:\n");

        System.out.println("--------------------------");
        int secim;

        do {

            System.out.print("Secim yapiniz:");
            secim = input.nextInt();
            switch (secim) {

                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usAlma();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    alanHesabi();
                    break;
                case 0:
                    System.out.print("Güle güle");
                    break;
                default:
                    System.out.print("Lütfen 1-8 arası seçim yapınız.!");
                    break;
            }
        } while (secim != 0);
    }
}