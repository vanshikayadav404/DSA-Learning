package Strings;
import java.util.*;
public class LexicographicallyLargestString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first String - ");
        String str1 = sc.nextLine();
        System.out.print("Enter your second String - ");
        String str2 = sc.nextLine();
        System.out.print("Enter your third String - ");
        String str3 = sc.nextLine();

        String largest = str1;
        if (str2.compareToIgnoreCase(largest) > 0){
            largest = str2;
        }
        else if (str3.compareToIgnoreCase(largest) > 0){
            largest = str3;
        }
        else {
            largest = str1;
        }
        System.out.println("Lexicographically largest strings is - "+largest);
    }
}
