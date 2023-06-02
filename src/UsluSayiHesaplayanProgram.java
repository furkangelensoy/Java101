import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, n;

        System.out.print("Sayı giriniz : ");
        a = input.nextInt();

        System.out.print("Üs değerini giriniz : ");
        n = input.nextInt();

        int total = 1;

        for (int i =1;i<=n;i++){
            total *= a;
        }

        System.out.println(a+" üssü "+n+" = " + total);


    }
}