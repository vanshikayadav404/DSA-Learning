package Arrays;
import java.util.*;
public class ReverseArray {
    public static void reverseArray(int[] arr, int n){
        for(int i=0; i<n; i++){
            int start = 0;
            int end = n-1;
            while (start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end --;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
      reverseArray(arr, n);
        System.out.println("Reversed array is : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
