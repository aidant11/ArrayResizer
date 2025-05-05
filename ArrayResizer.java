public class ArrayResizer {

    public static boolean isNonZeroRow(int[][] arr, int rowIndex) {
        for (int val : arr[rowIndex]) {
            if (val == 0) {
            return false;
        }
        }
        return true;
    }

    public static int countFullRows(int[][] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
        if (isNonZeroRow(arr, i)) {
            total++;
        }
        }
        return total;
    }

    public static int[][] resize(int[][] arr) {
        int[][] result = new int[countFullRows(arr)][arr[0].length];
        int index = 0;

        for (int row = 0; row < arr.length; row++) {
        if (isNonZeroRow(arr, row)) {
            for (int col = 0; col < arr[row].length; col++) {
                    result[index][col] = arr[row][col];
            }
            index++;
        }
        }

        return result;
    }
}