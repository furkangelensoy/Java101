import java.util.Scanner;

public class KombinasyonFormulu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, r;
        int nFactorial = 1;
        int rFactorial = 1;
        int kFactorial = 1;

        do {
            System.out.print("n değerini giriniz : ");
            n = input.nextInt();

            System.out.print("r değerini giriniz : ");
            r = input.nextInt();

            if (n > r) {
                for (int i = 1; i <= n; i++) {
                    nFactorial = nFactorial * i;
                }

                for (int j = 1; j <= r; j++) {
                    rFactorial = rFactorial * j;
                }

                for (int k = 1; k <= (n - r); k++) {
                    kFactorial = kFactorial * k;
                }

            }


        } while (n <= r);

        double combination = nFactorial / (kFactorial * rFactorial);

        System.out.println("C(" + n + "," + r + ") = " + combination);

    }
}