import java.util.Arrays;
import java.util.Scanner;

public class ClosestBigAndSmallNumber {
    public static void main(String[] args) {
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int numberFromUser = input.nextInt();
        
        System.out.println("Girilen sayı : " + numberFromUser);

        System.out.println("Dizi : " + Arrays.toString(array));
        int closerMin = array[5];
        int closerMax = array[2];

        for (int i : array) {
            if (i >= numberFromUser && closerMax - numberFromUser >= i - numberFromUser) {
                closerMax = i;
            }
            if (i <= numberFromUser && numberFromUser - i <= numberFromUser - closerMin) {
                closerMin = i;
            }
        }

        System.out.println("En yakın büyük sayı :" + closerMax);
        System.out.println("En yakın küçük sayı : " + closerMin);

    }
}