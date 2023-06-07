import java.util.Scanner;

public class PrimeNumberWithRecursive {

    static boolean isPrime(int number, int i) {
        if (number <= 2) {
            return (number == 2) ? true : false;
        }
        if (i == number) {
            return true;
        }

        if (number % i == 0) {
            return false;
        }

        return isPrime(number, i + 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        if (isPrime(number, 2)) {
            System.out.println(number + " Asal sayıdır.");
        } else {
            System.out.println(number + " Asal olmayan sayıdır.");
        }
    }
}