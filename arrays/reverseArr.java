package arrays;

public class reverseArr {

    public static void reverse(int arr[]) {
        int st = 0;
        int end = arr.length - 1;

        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        printArr(arr);

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {8, 9, 5, 7, 6, 42};
        reverse(arr);
    }
}
