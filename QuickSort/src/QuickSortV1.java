import java.util.Arrays;

/**
 * 快速排序的思想：
 * 1. 先从数组里取一个基准数 pivot
 * 2. 把数组里比基准数大的数放到它的右边，比它小或等于数的放到左边
 * 3. 重复第二步
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 6, 5, 3, 2, 8, 7};
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

    /**
     * 实现元素的交换，让数列中的元素根据自身大小，分别交换到基准元素的左右两边
     *
     * @param arr
     * @param start
     * @param end
     * @return
     */
    private static int partition(int[] arr, int start, int end) {
        int left = start;
        int right = end;
        int pivot = arr[start];
        int temp;
        while (left < right) {

            // 从右边开始往前找，找到比pivot小的数停下来
            while (left < right && arr[right] > pivot) {
                right--;
            }

            // 再从左边开始找，找到比pivot大的数停下来
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            // 此时 right 指向的是比 pivot 小的数，left 指向的是比 pivot 大的数。交换它俩
            if (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        // 当指针走到一起的时候，交换和 pivot 的位置（left 或者 right 都行，因为他们指向同一个数）
        arr[start] = arr[left];
        // 返回交换后的 pivot 的位置
        arr[left] = pivot;
        return left;
    }

}