public class Main {
    public static void main(String[] agrs) {
        int[] unsortedArray = {5, 4, 1, 3, 2, 9, 14, 10};
        printArray(sortIntegerArray(unsortedArray));
    }

    /**
     * Sorts an array of integers
     * @param array - array which has to be sorted
     * @return sorted array 
     */
    private static int[] sortIntegerArray(int[] array) {
        boolean needsSorting = true;
        while (needsSorting) {
            needsSorting = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] = array[i] + array[i + 1] - (array[i + 1] = array[i]);
                    needsSorting = true;
                }
            }
        }
        return array;
    }

    /**
     * Prints given array on the screen
     * @param array - array which has to be printed
     */
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
