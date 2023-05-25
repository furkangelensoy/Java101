import java.util.Scanner;

public class DaireCevreVeAlanHesaplayici {
    public static void main(String[] args) {

        double alan, cevre, pi, yariCap;

        pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarı çap değerini giriniz : ");
        yariCap = input.nextDouble();

        cevre = 2 * pi * yariCap;
        alan = pi * Math.pow(yariCap, 2);

        System.out.println("Dairenin çevresi = " + cevre);
        System.out.println("Dairenin alanı = " + alan);

        //Merkez açı ile daire diliminin alanı hesaplama;

        System.out.print("Merkez açı ölçüsünü giriniz : ");
        double merkezAci = input.nextDouble();

        double daireDilimAlani = (pi * Math.pow(yariCap, 2) * merkezAci) / 360;

        System.out.println("Daire diliminin alanı = " + daireDilimAlani);

    }
}