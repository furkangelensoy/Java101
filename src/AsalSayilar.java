public class AsalSayilar {
    public static void main(String[] args) {


        int number = 100;
        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 1) {
                System.out.print(i + ", ");
            }

        }

    }
}