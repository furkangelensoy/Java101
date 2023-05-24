import java.util.Scanner;

public class TaksimetreHesaplayici {
    public static void main(String[] args) {
        double kilometre, birimFiyat, acilisUcreti, toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen kilometreyi giriniz : ");
        kilometre = input.nextDouble();

        birimFiyat = 2.20;
        acilisUcreti = 10;
        toplamTutar = (birimFiyat * kilometre) + acilisUcreti;
        System.out.println
                (toplamTutar < 20 ? "Ödenecek tutar : 20 " : "Ödenecek tutar : " + toplamTutar);
    }
}