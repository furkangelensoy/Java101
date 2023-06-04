import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number,total = 0;

        System.out.print("Sayı Giriniz : ");
        number = input.nextInt();

        for (int i =1;i<number;i++){
            if (number % i == 0){
                total += i;
            }
        }

        if (total == number){
            System.out.println(number + " Mükemmel Sayıdır.");
        }else {
            System.out.println(number + " Mükkem Sayı Değildir.");
        }
    }
}