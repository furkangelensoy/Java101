public class DuplicateEvenNumbersWithArrays {

    static boolean isFind(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 2, 2, 9, 26, 21, 56, 26, 9, 13, 56};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i]) && list[i] % 2 == 0) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value + ", ");
            }
        }
    }
}