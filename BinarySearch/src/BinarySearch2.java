public class BinarySearch2 {

    /**
     * 递归 写法
     *
     * @param arr    已排序数组
     * @param target 目标值
     * @param left   左边界(从数组第一个元素开始)
     * @param right  有边界(从数组最后一个元素开始)
     * @return 找到的目标值的索引
     */
    public static int search(int[] arr, int target, int left, int right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] > target) {
            return search(arr, target, left, mid - 1);
        } else if (arr[mid] < target) {
            return search(arr, target, mid + 1, right);
        } else {
            return mid;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(search(arr, 5, 0, arr.length - 1));
    }
}
