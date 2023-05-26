import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;

        Scanner input = new Scanner(System.in);

        System.out.print("1'inci sayıyı giriniz : ");
        sayi1 = input.nextInt();

        System.out.print("2'nci sayıyı giriniz : ");
        sayi2 = input.nextInt();

        System.out.print("3'ncü sayıyı giriniz : ");
        sayi3 = input.nextInt();

        if (sayi1 < sayi2 && sayi1 < sayi3) {
            if (sayi2 < sayi3) {
                System.out.println("Sayı1 < Sayı2 < Sayı3 ");
            } else {
                System.out.println("Sayı1 < Sayı3 < Sayı2 ");
            }
        } else if (sayi2 < sayi1 && sayi2 < sayi3) {
            if (sayi1 < sayi3) {
                System.out.println("Sayı2 < Sayı1 < Sayı3 ");
            } else {
                System.out.println("Sayı2 < Sayı3 < Sayı1 ");
            }

        } else {
            if (sayi1 < sayi2) {
                System.out.println("Sayı3 < Sayı1 < Sayı2");
            } else {
                System.out.println("Sayı3 < Sayı2 < Sayı1");
            }
        }
    }
}