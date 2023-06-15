public class FrequencyOfArrays {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 20, 5, 20};
        int[] frequency = new int[array.length];
        int visited = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    frequency[j] = visited;
                }
            }
            if (frequency[i] != visited) {
                frequency[i] = count;
            }

        }
        System.out.println("Tekrar sayıları;");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != visited) {
                System.out.println(array[i] + " sayısı " + frequency[i] + " kere tekrar edildi.");
            }
        }
    }
}