package Strings;
import java.util.*;
public class PalindromeString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String rev = "";
        for (int i=str.length()-1; i>=0; i--){
              rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        if (rev.equals(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not  Palindrome");
        }
    }
}
