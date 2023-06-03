import java.util.Scanner;

public class EnKucukveEnBuyukSayiBulanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, total, number2;
        do {
            System.out.print("Kaç adet sayı gireceksiniz (En az 2 adet seçmelisiniz) : ");
            total = input.nextInt();
        } while (total <= 1);


        System.out.print("1. Sayıyı Giriniz : ");
        number1 = input.nextInt();
        int smallestNumber = number1;
        int biggestNumber = number1;
        for (int i = 2; i <= total; i++) {
            System.out.print(i + ". Sayıyı Giriniz :");
            number2 = input.nextInt();
            if (smallestNumber >= number2) {
                smallestNumber = number2;
            }
            if (biggestNumber <= number2) {
                biggestNumber = number2;
            }
        }
        System.out.println("Girilen en küçük sayı : " + smallestNumber);
        System.out.println("Girilen en büyük sayı : " + biggestNumber);
    }

}








