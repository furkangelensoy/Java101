import java.util.Scanner;

public class SumAndMinusWithRecursive {

    static int minus(int number) {
        System.out.print(number + " ");
        if (number > 0) {
            return minus(number - 5);
        } else {
            return number;
        }
    }

    static int sum(int number, int number2) {
        System.out.print(number + " ");
        if (number <= 0 || number < number2) {
            return sum(number + 5, number2);
        } else {
            return number;
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int numberFromUser = input.nextInt();
        int numberFromMinus = minus(numberFromUser) + 5;
        sum(numberFromMinus, numberFromUser);

    }
}