import java.util.Scanner;

public class CiftveDordunKatiSayilariToplayanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int total = 0;


        do {
            System.out.print("Pozitif tam sayı giriniz : ");
            number = input.nextInt();

            if (number % 4 == 0) {
                total += number;

            }

        } while (number % 2 == 0 && number > 0);

        System.out.println("Çift ve 4'ün katı olan sayılarin toplamı : " + total);


    }
}