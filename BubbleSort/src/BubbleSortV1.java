import java.util.Arrays;

public class BubbleSortV1 {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 3, 4, 6, 2, 5};
        bubbleSortV1(arr);
        System.out.print(Arrays.toString(arr));
    }

    /**
     * 冒泡排序是一种交换排序，其思想是将相邻的元素两两比较，然后交互按。
     * 该算法每一轮都要遍历一次数组，总共遍历（元素数量-1）次，时间复杂度为 O(n^2)
     */
    public static void bubbleSortV1(int[] arr) {
        // 第一层循环控制遍历次数（length-1）
        for (int i = 0; i < arr.length - 1; i++) {
            // 第二层循环控制每次遍历的交换
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }

}
