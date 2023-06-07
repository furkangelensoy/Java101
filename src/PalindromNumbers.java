import java.util.Scanner;

public class PalindromNumbers {

    static boolean isPalindrom(int number) {
        int reversenumber = 0, lastDigit;
        int temp = number;
        while (temp != 0) {
            lastDigit = temp % 10;
            reversenumber = (reversenumber * 10) + lastDigit;
            temp /= 10;
        }
        if (number == reversenumber) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int numberFromUser;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        numberFromUser = input.nextInt();
        if (isPalindrom(numberFromUser)) {
            System.out.println(numberFromUser + " Palindrom Sayıdır.");
        } else {
            System.out.println(numberFromUser + " Palindrom Sayı değildir.");
        }
    }
}