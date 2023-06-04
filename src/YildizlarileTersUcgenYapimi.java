import java.util.Scanner;

public class YildizlarileTersUcgenYapimi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Basamak Sayısını Giriniz : ");
        n = input.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=i;j>1;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=((n-i)*2)+1;k++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}