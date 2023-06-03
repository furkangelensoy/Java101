import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2;
        int ref = 1;

        System.out.print("1'inci sayıyı giriniz : ");
        number1 = input.nextInt();

        System.out.print("2'nci sayıyı giriniz : ");
        number2 = input.nextInt();

        if (number1 <= number2) {
            ref = number1;
        } else {
            ref = number2;
        }

        //EBOB
        int i = ref;
        while (i >= 0) {
            if (number1 % i == 0 && number2 % i == 0) {
                int ebob = i;
                System.out.println("EBOB : " + ebob);
                break;
            }
            i--;
        }
        //int ekok = 1;
        int j = 1;
        while (j <= (number1 * number2)) {
            if (j % number1 == 0 && j % number2 == 0) {
                int ekok = j;
                System.out.println("EKOK : " + ekok);
                break;
            }
            j++;
        }
    }
}