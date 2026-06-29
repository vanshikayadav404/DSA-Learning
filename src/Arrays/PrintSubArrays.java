package Arrays;
import java.util.*;
public class PrintSubArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array - ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array - ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ts = 0;
        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total Subarrays are - " +ts);
    }
}
