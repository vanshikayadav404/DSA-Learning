package Arrays;
import java.util.*;
public class BinarySearch {
    public static int binarySearch(int[] arr, int n, int key){
        int start = 0;
        int end = n-1;
        while (start<=end){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array - ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of array - ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key - ");
        int key = sc.nextInt();
        System.out.print("Key is at the index : "+binarySearch(arr,n,key));
    }
}
