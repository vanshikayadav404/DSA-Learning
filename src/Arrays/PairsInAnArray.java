package Arrays;
import java.util.*;
public class PairsInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            int current = arr[i];
            for(int j=i+1; j<n; j++){
                System.out.print("(" + current + ", " + arr[j] + ")");
            }
            System.out.println();
        }
        int tp = (n*(n-1))/2;
        System.out.print("Total pairs are : " + tp);
    }
}
