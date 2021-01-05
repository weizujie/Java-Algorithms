import java.util.Arrays;

public class BubbleSortV2 {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 3, 4, 6, 2, 5};
        bubbleSortV2(arr);
        System.out.print(Arrays.toString(arr));
    }

    /**
     * 优化冒泡排序
     * 当进行到后面几轮的时候数组已经是有序的了，但是算法还是会继续执行下去
     */
    private static void bubbleSortV2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    // 如果有元素交换，这个数组还没有排好序
                    isSorted = false;
                }
            }
            // 如果没有交换则数组排好序
            if (isSorted) {
                break;
            }
        }
    }

}
