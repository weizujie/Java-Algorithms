import java.util.Arrays;

/**
 * 双边循环法
 * <p>
 * 快速排序的思想：
 * 1. 先从数组里取一个基准数 pivot
 * 2. 把数组里比基准数大的数放到它的右边，比它小或等于数的放到左边
 * 3. 重复第二步
 *
 * 画了图：https://weizujie.oss-cn-shenzhen.aliyuncs.com/img/未命名文件.png
 */
public class QuickSortV1 {

    public static void main(String[] args) {
        int[] arr = {4, 1, 6, 5, 3, 2, 8, 7};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 分治
     * 分别让 左序列 和 右序列 再次进行元素交换
     *
     * @param arr   数组
     * @param start 开始位置
     * @param end   结束位置
     */
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            // 对做序列进行元素交换，边界为序列的第一位到交换后的基准元素位置的前一位
            quickSort(arr, start, pivot - 1);
            // 对右序列进行元素交换，边界为交换后的基准元素位置的后一位到序列最后一位
            quickSort(arr, pivot + 1, end);
        }
    }

    /**
     * 实现元素的交换，让数列中的元素根据自身大小，分别交换到基准元素的左右两边
     *
     * @param arr   数组
     * @param start 开始位置
     * @param end   结束位置
     * @return 基准元素的新位置（交换后的）
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