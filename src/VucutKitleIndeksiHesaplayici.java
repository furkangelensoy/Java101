import java.util.Scanner;
public class VucutKitleIndeksiHesaplayici {
    public static void main(String[] args) {
        double kilo,boy,vucutKitleIndeksi;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu (kilogram cinsinden) giriniz : ");
        kilo = input.nextDouble();

        vucutKitleIndeksi = kilo / Math.pow(boy,2);

        System.out.println("Vücut kitle indeksiniz : " + vucutKitleIndeksi);
    }
}