import java.util.Scanner;

public class HarmonikSeriBulanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("n sayısını giriniz : ");
        n = input.nextInt();
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += (1.0/i);
        }

        System.out.println(result);


    }
}