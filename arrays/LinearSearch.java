package arrays;
public class LinearSearch{
   public static void linear_search(int arr[], int key){
      for(int i=0; i<arr.length; i++){
          if(arr[i] == key){
             System.out.print("Element Found at index : " + i);
          }
      }
   }
   public static void main(String args[]){
     int arr[] = {5,7,89,6,23,5};
     linear_search(arr, 6); 
   }
}