package Strings;
import java.util.*;
public class ShortestPath {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int x=0;
        int y=0;
        for (int i=0; i<str.length(); i++){
            char dir = str.charAt(i);
            if(dir == 'N'){
                y++;
            }
            if(dir == 'E'){
                x++;
            }
            if(dir == 'W'){
                x--;
            }
            if(dir == 'S'){
                y--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        System.out.print((float)Math.sqrt(X2+Y2));
    }
}
