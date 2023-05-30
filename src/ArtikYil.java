import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year, leapYear;

        Scanner input = new Scanner(System.in);

        System.out.print("Yılı giriniz : ");
        year = input.nextInt();
        leapYear = year % 4;
        if (year>0){
            if (leapYear == 0) {
                System.out.println(year + " Bir artık yıldır.");
            } else {
                System.out.println(year + " Bir artık yıl değildir.");
            }

        }else {
            System.out.println("Geçersiz bir yıl girdiniz.");
        }

    }
}