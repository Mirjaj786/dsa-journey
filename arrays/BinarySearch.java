// package arrays;

public class BinarySearch {

    public static void binary_Search(int arr[], int key) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == key) {
                System.out.print("Element found at index : " + mid);
                break;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 7, 12, 15, 19, 24, 31, 42, 56, 68, 75};
        int key = 31;

        binary_Search(arr, key);
    }
}
