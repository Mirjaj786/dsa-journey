
public class RemoveDuplicated {

    public static void remove_Duplicate_Form_Sorted_Array(int arr[]) {
        int i = 0;

        for (int j = 1; j <= arr.length - 1; j++) {
            if (arr[i] < arr[j]) { // means the element is unique so place it a safe place that is i+1
                arr[i + 1] = arr[j];
                i++;
            }else{
                // System.out.println("the element is duplicate");
            }
        }

        //Print the unique element that is 0 to i+1 
        for (int k = 0; k < i + 1; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3};
        remove_Duplicate_Form_Sorted_Array(arr);
    }
}
