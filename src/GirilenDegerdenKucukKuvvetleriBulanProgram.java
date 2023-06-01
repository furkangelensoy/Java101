import java.util.Scanner;

public class GirilenDegerdenKucukKuvvetleriBulanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Sınır değerini giriniz : ");
        number = input.nextInt();

        System.out.print("4'ün kuvvetleri olan sayılar : ");
        for (int i = 1; i <= number; i *= 4) {
            System.out.print(i + ",");
        }

        System.out.print("\n5'in kuvvetleri olan sayılar : ");
        for (int i = 1; i <= number; i *= 5) {
            System.out.print(i + ",");
        }

    }
}