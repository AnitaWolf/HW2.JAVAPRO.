public class Task2 {
    /**
     * Task 2:
     * Дано целое число, представленное его разрядами, которые записаны в массив.
     * Например, число 123 представляется массивом [1, 2, 3].
     * Получите массив, который преставляет сумму исходного числа и 1
     * <p>
     * Example 1:
     * Input: digits = [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     * Incrementing by one gives 123 + 1 = 124.
     * Thus, the result should be [1,2,4].
     * <p>
     * Example 2:
     * Input: digits = [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321.
     * Incrementing by one gives 4321 + 1 = 4322.
     * Thus, the result should be [4,3,2,2].
     * <p>
     * Example 3:
     * Input: digits = [9]
     * Output: [1,0]
     * Explanation: The array represents the integer 9.
     * Incrementing by one gives 9 + 1 = 10.
     * Thus, the result should be [1,0].
     */

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 3, 2, 1};
        int[] arr3 = {9};
        Array(arr3);
    }

    public static void Array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[arr.length - 1]) {
                arr[i] = arr[i] + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
