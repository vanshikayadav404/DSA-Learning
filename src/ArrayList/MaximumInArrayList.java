package ArrayList;
import java.util.*;
public class MaximumInArrayList {
    public static void main(String[] main){
        //O(n)
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the number of elements you want to add in list - ");
        int n = sc.nextInt();
        System.out.print("Enter the ArrayList elements - ");
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            list.add(num);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
           max = Math.max(max, list.get(i));
        }
        System.out.println("Largest element in your ArrayList is - "+max);
    }
}
