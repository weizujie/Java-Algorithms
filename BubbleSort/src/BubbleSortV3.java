import java.util.Arrays;

public class BubbleSortV3 {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 3, 4, 6, 2, 5};
        bubbleSortV2(arr);
        System.out.print(Arrays.toString(arr));
    }

    /**
     * 继续优化
     * 使用标记之后，排好序的区域还是会白白比较很多次
     * 可以在每一轮排序后，记录下最后一个元素交换的位置，该位置就是无序数列的边界，往后就是有序的了
     */
    private static void bubbleSortV2(int[] arr) {
        // 记录最后一次交换的位置
        int lastIndex = 0;
        // 无序数列的边界，每次比较只需要比到这里
        int sortBorder = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            // 有序标记，每轮开始的时候是 true
            boolean isSorted = true;
            for (int j = 0; j < sortBorder; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    // 如果有元素交换，这个数组还没有排好序
                    isSorted = false;
                    // 把无序数列的边界更新为最后一次交换元素的位置
                    lastIndex = j;
                }
            }
            sortBorder = lastIndex;
            // 如果没有交换则数组排好序
            if (isSorted) {
                break;
            }
        }
    }

}
