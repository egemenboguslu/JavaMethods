import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String original){

        String reverse = "";

        for(int j=original.length()-1;j>=0;j--){
            reverse = reverse + original.charAt(j);
        }

        if(original.equals(reverse)){
           return true;
        }else
            return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Palindrom olup olmadığı kontrol edilecek olan stringi girin: ");
        String str = input.nextLine();

        System.out.println(isPalindrome(str));
    }
}