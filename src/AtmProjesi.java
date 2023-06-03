import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName, password;
        int balance = 1500;
        int right = 3;
        int select;

        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı adınız : ");
            userName = input.nextLine();

            System.out.print("Şifreniz : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba Kodluyoruz Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("1-Para Çekme\n"
                            + "2-Para Yatırma\n"
                            + "3-Bakiye Sorgula\n"
                            + "4-Çıkış Yap");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Çekmek istediğiniz para miktraını giriniz : ");
                            int value = input.nextInt();
                            if (value <= balance) {
                                balance -= value;
                            }else {
                                System.out.println("Yetersiz bakiye.");
                            }
                            break;
                        case 2:
                            System.out.print("Yatırmak istediğiniz para miktarını giriniz : ");
                            int price = input.nextInt();
                            balance += price;

                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz : " + balance);
                        default:
                            if (select>4){
                                System.out.println("Hatalı tuşlama yaptınız. Tekrar deneyiniz.");
                            }
                    }

                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere!");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen bankanız ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }
        }


    }
}