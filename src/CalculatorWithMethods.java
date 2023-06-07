import java.util.Scanner;

public class CalculatorWithMethods {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println(a + " + " + "b" + " = " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        return result;
    }

    static int divied(int a, int b) {
        if (b == 0) {
            System.out.println("2'nci Sayı sıfırdan farklı olmalıdır.");
            return 0;
        }
        int result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        if (b == 0) {
            return result;
        }
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        if (b == 0) {
            System.out.println("2'nci sayı sıfırdan farklı olmalıdır.");
            return 0;
        }
        int result = a % b;
        return result;
    }

    static void calculateRectangularPerimeterAndArea(int a, int b) {
        int perimeter = 2 * (a + b);
        int area = a * b;
        System.out.println("Çevre uzunluğu = " + perimeter);
        System.out.println("Alanı = " + area);

    }

    public static void main(String[] args) {

        int select;

        Scanner input = new Scanner(System.in);


        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölüme İşmei\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesaplama\n"
                + "0- Çıkış Yap";

        System.out.println(menu);
        while (true) {
            System.out.print("Bir İşlem Seçiniz : ");
            select = input.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("1'inci Sayıyı Giriniz : ");
            int a = input.nextInt();
            System.out.print("2'nci Sayıyı Giriniz : ");
            int b = input.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divied(a, b);
                    break;
                case 5:
                    System.out.println("Üs Hesabı : " + power(a, b));
                    break;
                case 6:
                    System.out.println("Mod Hesabı : " + mod(a, b));
                    break;
                case 7:
                    calculateRectangularPerimeterAndArea(a, b);
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz. Tekrar İşlem Seçiniz.");
            }

        }
        System.out.println("İyi Günler.");
    }
}
