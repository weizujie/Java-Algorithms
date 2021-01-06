import java.util.Arrays;

public class QuickSortV2 {

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 5, 6, 2, 8, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        // 取数组第一位元素为基准元素
        int pivot = arr[start];
        // mark 标志
        int mark = start;
        int temp;
        // 从 pivot 的下一个位置开始进行遍历
        for (int i = start + 1; i < end + 1; i++) {
            // 如果遇到比 pivot 小的元素，做两件事
            if (arr[i] < pivot) {
                // 1. 先让 mark 向右移动 1 位
                mark++;
                // 2. 交换遇到的那个元素和 mark 所在位置的元素
                temp = arr[mark];
                arr[mark] = arr[i];
                arr[i] = temp;
            }
        }
        // 最后交换 pivot 和 mark 所在位置的元素
        arr[start] = arr[mark];
        // 让 mark 作为下一轮的 pivot
        arr[mark] = pivot;
        return mark;
    }
}
