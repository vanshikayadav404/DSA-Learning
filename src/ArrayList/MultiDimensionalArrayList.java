package ArrayList;
import java.util.*;
public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=1; i<=5; i++){
            list1.add(i);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=2; i<=10; i=i+2){
            list2.add(i);
        }
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i=3; i<=15; i=i+3){
            list3.add(i);
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);
        //Using nested loops
        for(int i=0; i<mainlist.size(); i++){
            ArrayList<Integer> currList = mainlist.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
