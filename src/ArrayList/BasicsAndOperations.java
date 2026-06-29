package ArrayList;
import java.util.*;
public class BasicsAndOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //Add Elements in List          O(1)
        list.add("hello");
        list.add("world");
        list.add("java");
        //Add Elements index wise          O(n)
        list.add(2,"19");
        System.out.println(list);
        //Get Element          0(1)
//        String s = list.get(0);
//        System.out.println(s);
//        //Delete Element          0(n)
//        list.remove(2);
//        System.out.println(list);
//        //Set Element at index          0(n)
//        list.set(2, "Vanshika");
//        System.out.println(list);
        //Contains Element          O(n)
//        System.out.println(list.contains("Vanshika"));
//        System.out.println(list.contains("Vanshi"));
        //Size of an ArrayList
//        System.out.println(list.size());
//        //Print the ArrayList using Loop
//        for(int i=0; i<list.size(); i++){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println();
//        //Reverse ArrayList          0(n)
//        for(int i=list.size()-1; i>=0; i--){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println();
    }
}
