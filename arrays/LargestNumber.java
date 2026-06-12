package arrays;

@SuppressWarnings("all")  // use to ignore all warnings
public class LargestNumber {
    // Function use to find Largest number
    public static int find_largest(int arr[]) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }
    // Function use to find smallest Number
    public static int find_smallest(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String aegs[]) {
        int arr[] = {5, 7, 9, 8, 6, 2, 5, 7, 31, 4, 5};

        System.out.println(find_largest(arr));
        System.out.println(find_smallest(arr));
    }
}
