import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {

        int bornYear,chineseZodiac;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınız : ");
        bornYear = input.nextInt();

        chineseZodiac = bornYear % 12;
        String chineseZodiacName = "";

        switch (chineseZodiac){

            case 0:
                chineseZodiacName = "Maymun";
                break;
            case 1:
                chineseZodiacName ="Horoz";
                break;
            case 2:
                chineseZodiacName ="Köpek";
                break;
            case 3:
                chineseZodiacName = "Domuz";
                break;
            case 4:
                chineseZodiacName = "Fare";
                break;
            case 5:
                chineseZodiacName = "Öküz";
                break;
            case 6:
                chineseZodiacName = "Kaplan";
                break;
            case 7:
                chineseZodiacName = "Tavşan";
                break;
            case 8:
                chineseZodiacName = "Ejderha";
                break;
            case 9:
                chineseZodiacName = "Yılan";
                break;
            case 10:
                chineseZodiacName = "At";
                break;
            case 11:
                chineseZodiacName ="Koyun";
                break;
            default:
                System.out.println("Hatalı giriş yaptınız");

        }

        System.out.println("Çin Zodyağı Burcunuz : " + chineseZodiacName);



    }
}