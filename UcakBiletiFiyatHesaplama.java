import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {

        double distance, pricePerKm, totalPrice, discountPrice, Price, ageDiscount = 0, ticketDiscount = 0, totalDiscount = 0;
        int age, ticketType;

        Scanner input = new Scanner(System.in);

        pricePerKm = 0.10;

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print("Mesafeyi giriniz km cinsinden giriniz : ");
        distance = input.nextDouble();

        System.out.println("Yolculuk tipini seçiniz :\n1- Gidiş-Dönüş\n2- Tek yön");
        ticketType = input.nextInt();

        Price = pricePerKm * distance;

        if (distance > 0 && age > 0) {
            if (age < 12) {
                ageDiscount = Price * 0.20;
            } else if (age >= 12 && age <= 24) {
                ageDiscount = Price * 0.10;
            } else if (age > 65) {
                ageDiscount = Price * 0.30;
            }

            discountPrice = Price - ageDiscount;

            switch (ticketType) {
                case 1:
                    System.out.println("Normal tutar : " + Price);
                    System.out.println("Yaş indirimi : " + ageDiscount);
                    ticketDiscount = discountPrice * 0.20;
                    System.out.println("Gidiş-Dönüş bilet indirimi : " + ticketDiscount);
                    totalDiscount = ticketDiscount + ageDiscount;
                    System.out.println("Toplam indirim : " + totalDiscount);
                    totalPrice = (discountPrice - ticketDiscount) * 2;
                    System.out.println("Toplam tutar : " + totalPrice);
                    break;
                case 2:
                    System.out.println("Normal tutar : " + Price);
                    System.out.println("Yaş indirimi : " + ageDiscount);
                    totalPrice = discountPrice - ticketDiscount;
                    System.out.println("Gidiş-Dönüş bilet indirimi : " + ticketDiscount);
                    totalDiscount = ticketDiscount + ageDiscount;
                    System.out.println("Toplam indirim : " + totalDiscount);
                    System.out.println("Toplam tutar : " + totalPrice);
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız.");
            }

        } else {
            System.out.println("Hatalı veri girdiniz.");
        }


    }
}