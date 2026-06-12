package arrays;

public class isSorted {

    public static boolean checkSorted(int arr[]) {
        if (arr.length < 2) {
            return true;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int arr[] = {5, 9, 10, 15, 48};
        int arr2[] = {5, 8, 1, 2, 4, 3};
        int arr3[] = {5};

        boolean ans = checkSorted(arr);
        boolean ans2 = checkSorted(arr2);
        boolean ans3 = checkSorted(arr3);

        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}
