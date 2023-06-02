import java.util.Scanner;

public class BasamakSayilariniToplayanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, digitValue;

        System.out.print("Sayı giriniz : ");
        number = input.nextInt();

        int tempNumber = number;
        int total = 0;

        while (tempNumber != 0) {
            digitValue = tempNumber % 10;
            total += digitValue;
            tempNumber /= 10;
        }

        System.out.println(number + " Sayısının basamakları toplamı : " + total);


    }
}