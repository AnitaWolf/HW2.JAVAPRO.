

public class Task1 {
    /**
     * Дан массив nums целых чисел и целое число target,
     * найдите индексы двух элементов массива,
     * чтобы сумма этих значений была равна target.
     * Предполагается, что существует всегда только одно решение и
     * нельзя использовать один и тот же элемент массива дважды.
     * <p>
     * Example 1:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * <p>
     * Example 2:
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * <p>
     * Example 3:
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     */
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int[] arr2 = {3, 2, 4};
        int[] arr3 = {3, 3};
        IndexOfElements1(arr3, 6);
    }

    public static void IndexOfElements1(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

}
