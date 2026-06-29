package ArrayList;
import java.util.*;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the ArrayList - ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the ArrayList - ");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.print("Enter your first index - ");
        int idx1 = sc.nextInt();
        System.out.print("Enter your second index - ");
        int idx2 = sc.nextInt();
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.print("Your swapped ArrayList is - "+list);
    }
}
