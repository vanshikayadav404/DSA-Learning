package Arrays;
import java.util.*;
public class LargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of array = ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print("Largest element of array is =    "+max);
    }
}
