import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if (heat >= 5 && heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (heat >= 15) {
                System.out.println("Piknik yapmaya gidebilirsiniz.");
            }

        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}