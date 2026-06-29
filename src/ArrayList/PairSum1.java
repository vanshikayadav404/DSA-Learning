package ArrayList;
import java.util.*;
public class PairSum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the list - ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the elements of the list - ");
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        System.out.print("Enter the target - ");
        int target = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if (list.get(i) + list.get(j) == target){
                System.out.println("Target Pair is - "+list.get(i) + ", " + list.get(j));
                }
            }
            break;
        }
    }
}
