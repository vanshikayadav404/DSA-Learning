package ArrayList;
import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of ArrayList - ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the elements of ArrayList - ");
        for(int i=0; i<n; i++){
           int num = sc.nextInt();
           list.add(num);
        }
        Collections.sort(list);
        System.out.println("Your sorted ArrayList is - "+list);
        Collections.reverse(list);
        System.out.println("Your reversed sorted ArrayList is - "+list);
        Collections.sort(list,Collections.reverseOrder()); //Comparator - fnxn logic
        System.out.println("Your reversed sorted ArrayList is - "+list);
    }
}
