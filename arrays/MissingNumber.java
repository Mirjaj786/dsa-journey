
public class MissingNumber {

    public static int findMissingNumber(int arr[]) {
        long nSum = 0;
        int arrSum = 0;

        int n = arr.length + 1;

        nSum = (long) (n * (n + 1)) / 2;

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        return (int) nSum - arrSum;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 5};

        System.out.println(findMissingNumber(arr));
    }
}
