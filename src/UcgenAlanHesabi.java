import java.util.Scanner;

import static java.lang.Math.hypot;

public class UcgenAlanHesabi {
    public static void main(String[] args) {

        double dikKenar1, dikKenar2, hypotenuse, ucgenAlani, ucgenCevresi;

        Scanner input = new Scanner(System.in);

        System.out.print("1'inci dik kenarın uzunluğunu giriniz : ");
        dikKenar1 = input.nextDouble();

        System.out.print("2'nci dik kenarın uzunluğunu giriniz : ");
        dikKenar2 = input.nextDouble();

        hypotenuse = hypot(dikKenar1, dikKenar2);

        ucgenAlani = (dikKenar1 * dikKenar2) / 2;

        ucgenCevresi = dikKenar1 + dikKenar2 + hypotenuse;

        System.out.println("hipotenüs = " + hypotenuse);
        System.out.println("Üçgenin çevresi = " + ucgenCevresi);
        System.out.println("Üçgenin alanı = " + ucgenAlani);

        //Çeşit kenar üçgen alan hesabı;

        double a,b,c,cevre,alan;

        System.out.print("1'inci kenar uzunluğu = ");
        a = input.nextDouble();

        System.out.print("2'nci kenar uzunluğu = ");
        b = input.nextDouble();

        System.out.print("3'üncü kenar uzunluğu = ");
        c = input.nextDouble();

        cevre = a + b + c;
        double u = cevre/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Çeşit kenar üçgen çevresi = " + cevre);
        System.out.println("Çeşit kenar üçgen alanı = "+ alan);



    }
}