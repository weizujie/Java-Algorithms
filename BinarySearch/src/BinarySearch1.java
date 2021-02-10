/**
 * 二分查找是一种基于比较目标值和数组中间元素的教科书式算法。
 * 如果目标值等于中间值(mid == target),则找到目标值;
 * 如果中间值大于目标值(mid > target),则继续在左侧搜索(right = mid - 1);
 * 如果中间值小于目标值(mid < target),则继续在右侧搜索(left = mid + 1)
 */
public class BinarySearch1 {

    /**
     * while 循环写法
     *
     * @param arr    已排序的数组
     * @param target 目标值
     * @return 找到的目标值的索引
     */
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(search(arr, 5));
    }
}
