import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 5};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }


    public static int[] selectionSort(int[] arr) {
        int smallNum;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            smallNum = findSmallest(arr);
            newArr[i] = smallNum;
        }
        return newArr;
    }


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
