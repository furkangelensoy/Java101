import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Eleman Sayısını Giriniz : ");
        n = input.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            int total = a + b;
            System.out.print(a + ", ");
            if (i == n) {
                System.out.print(b);
            }
            a = b;
            b = total;


        }
    }
}