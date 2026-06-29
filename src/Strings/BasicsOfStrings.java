package Strings;
import java.util.*;
public class BasicsOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String s1 = sc.next();
//        System.out.println(s);
//        System.out.println(s1);
//        System.out.print(s.length());
        //concatenate
//        String firstName = sc.nextLine();
//        String lastName = sc.nextLine();
//        String fullName = firstName + " " + lastName;
//        System.out.println(fullName);
//        System.out.print(fullName.charAt(3));
        //String Builder
//          StringBuilder sb = new StringBuilder("");
//          for(char ch = 'a'; ch<='z'; ch++){
//              sb.append(ch);
//          }
//          System.out.println(sb);
        //Some Functions
//        String str = " Vanshika   ";
//        System.out.print(str.trim());
        String s = "  hello   world   java  ";
        String[] s1 = s.trim().split("\\s+");
        System.out.print(Arrays.toString(s1));
    }
}
