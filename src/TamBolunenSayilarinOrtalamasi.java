import java.util.Scanner;

public class TamBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;
        System.out.print("Bir sayi giriniz : ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum = sum + i;
                count = count + 1;
            }
        }
        double average = sum / count;
        System.out.println("3'e ve 4'e tam bölünebilen sayıların adedi : " + count);
        System.out.println("3'e ve 4'e tam bölünebilen sayıların ortalamaları : " + average);
    }
}