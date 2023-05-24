import java.util.Scanner;

public class KdvTutariHesaplayici {
    public static void main(String[] args) {

        double tutar;
        double kdvOrani = 0.18;

        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz : ");
        tutar = input.nextDouble();

        double kdvTutari = tutar * kdvOrani;
        double kdvDahilTutar = tutar + kdvTutari;

        System.out.println("Kdv'siz Tutar : " + tutar);
        System.out.println("Kdv Dahil Tutar : " + kdvDahilTutar);
        System.out.println("Kdv Tutarı : " + kdvTutari);

    }
}