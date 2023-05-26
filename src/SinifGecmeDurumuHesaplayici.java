import java.util.Scanner;

public class SinifGecmeDurumuHesaplayici {
    public static void main(String[] args) {

        int matematik, fizik, kimya, turkce, muzik;
        double total = 0;
        int lessonCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        matematik = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        if (matematik <= 100 && matematik >= 0) {
            total += matematik;
            lessonCount++;
        }else {
            System.out.println("Geçersiz matematik notu girdiniz. Ortalamaya katılmadı");
        }
        if (fizik >= 0 && fizik <= 100) {
            total += fizik;
            lessonCount++;
        }else {
            System.out.println("Geçersiz fizik notu girdiniz. Ortalamaya katılmadı");
        }
        if (kimya >= 0 && kimya <= 100) {
            total += kimya;
            lessonCount++;
        }else {
            System.out.println("Geçersiz kimya notu girdiniz. Ortalamaya katılmadı");
        }
        if (turkce >= 0 && turkce <= 100) {
            total += turkce;
            lessonCount++;
        }else {
            System.out.println("Geçersiz türkçe notu girdiniz. Ortalamaya katılmadı");
        }
        if (muzik >= 0 && muzik <= 100) {
            total += muzik;
            lessonCount++;
        }else {
            System.out.println("Geçersiz müzik notu girdiniz. Ortalamaya katılmadı");
        }
        double average = total / lessonCount;

        if (average>=55){
            System.out.println("Tebrikler sınıfı geçtiniz !");
        }else {
            System.out.println("Maalesef sınıfta kaldınız. Seneye daha çok çalışın!");
        }
        System.out.println("Ortalamanız : " + average);
    }
}