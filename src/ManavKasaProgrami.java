import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlican, toplamTutar;

        double armutKiloFiyat = 2.14;
        double elmaKiloFiyat = 3.67;
        double domatesKiloFiyat = 1.11;
        double muzKiloFiyat = 0.95;
        double patlicanKiloFiyat = 5.00;


        Scanner input = new Scanner(System.in);

        System.out.print("Armut kilogramını giriniz : ");
        armut = input.nextDouble();

        System.out.print("Elma kilogramını giriniz : ");
        elma = input.nextDouble();

        System.out.print("Domates kilogramını giriniz : ");
        domates = input.nextDouble();

        System.out.print("Muz kilogramını giriniz : ");
        muz = input.nextDouble();

        System.out.print("Patlıcan kilogramını giriniz : ");
        patlican = input.nextDouble();

        toplamTutar = (armut * armutKiloFiyat) + (elma * elmaKiloFiyat) +
                (domates * domatesKiloFiyat) + (muz * muzKiloFiyat) +
                (patlican * patlicanKiloFiyat);

        System.out.print("Toplam tutar : " + toplamTutar + " TL");

    }
}