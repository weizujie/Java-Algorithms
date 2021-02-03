/**
 * 二分查找是一种基于比较目标值和数组中间元素的教科书式算法。
 * 如果目标值等于中间值,则找到目标值;
 * 如果目标值小于中间值,则继续在左侧搜索(high = mid - 1);
 * 如果目标值大于中间,则继续在右侧搜索(low = mid + 1)
 */
public class BinarySearch {
    /**
     * 给定一个n个元素有序的（升序）整型数组 nums 和一个目标值 target，
     * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
     * 你可以假设 nums 中的所有元素是不重复的。
     * n 将在 [1, 10000]之间。
     * nums 的每个元素都将在 [-9999, 9999]之间。
     */
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int pivot;
        while (left <= right) {
            pivot = left + (right - left) / 2; // 防止 left + right 超出整数取值范围
            if (target == nums[pivot]) {
                return pivot;
            } else if (target < nums[pivot]) {
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(search(nums, 2));
    }
}
