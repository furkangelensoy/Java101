public class HarmonicAverageWithArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += 1.0 / numbers[i];
        }
        double average = numbers.length / sum;

        System.out.printf("%s : %.3f\n", "Dizinin Harmonik Ortalaması", average);

    }
}
