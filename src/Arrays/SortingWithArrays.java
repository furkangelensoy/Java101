import java.util.Arrays;
import java.util.Scanner;

public class SortingWithArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz : ");
        int n = input.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". Elemanı giriniz : ");
            int number = input.nextInt();
            array[i] = number;
        }
        Arrays.sort(array);
        System.out.println("Sıralı dizi : " + Arrays.toString(array));
    }
}