import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 5};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    /**
     * 选择排序
     *
     * @param arr 数组
     * @return 排好序的数组
     */
    public static int[] selectionSort(int[] arr) {
        int smallNum;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            smallNum = findSmallest(arr);
            newArr[i] = smallNum;
        }
        return newArr;
    }


    /**
     * 查找数组中最小的元素
     *
     * @param arr 数组
     * @return 最小元素的索引
     */
    public static int findSmallest(int[] arr) {
        int smallNum = arr[0];
        int smallIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallNum) {
                smallNum = arr[i];
                smallIndex = i;
            }
        }
        return smallIndex;
    }

}
