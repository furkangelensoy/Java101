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

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV orani : " + kdvOrani);
        System.out.println("KDV Dahil Tutar : " + kdvDahilTutar);
        System.out.println("KDV Tutarı : " + kdvTutari);

    }
}