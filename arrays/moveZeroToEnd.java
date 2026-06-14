// package arrays;

public class moveZeroToEnd {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void moveZeroAtEnd(int arr[]) {
        int i = 0, j = 0;
        while (j < arr.length) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j++;
            } else {
                j++;
            }

        }
        printArr(arr);
    }

    public static void main(String[] args) {
        int arr[] = {0,0,0,0,5};
        moveZeroAtEnd(arr);
    }
}
