import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName, password, newPassword;
        String defaultuserName = "patika";
        String defaultPassword = "java123";
        int select;
        String sifreMesaj = "Yeni şifreniz hatalı girdiğiniz veya unuttuğunuz şifre ile aynı olmamalı.";
        String sifreHatali = "Şifre oluşturulamadı. Lütfen başka şifre giriniz.";
        String sifreDogru = "Şifre oluşturuldu.";

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals(defaultuserName) && password.equals(defaultPassword)) {
            System.out.println("Giriş yaptınız.");
        } else {
            System.out.println("Bilgileriniz yanlış !");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?\n1-Evet.\n2-Hayır.");
            select = input.nextInt();

            switch (select) {
                case 1:
                    System.out.println(sifreMesaj);
                    System.out.print("Yeni şifreniz : ");
                    newPassword = input.next();
                    if (newPassword.equals(password) || newPassword.equals(defaultPassword)) {
                        System.out.println(sifreHatali);
                    } else {
                        System.out.println(sifreDogru);

                    }
                    System.out.println("Program sonlandı.");
                    break;
                case 2:
                    System.out.println("Program sonlandı.");
                    break;
                default:
                    System.out.println("Program sonlandı.");

            }
        }


    }
}