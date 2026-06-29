package Strings;
import java.util.*;
public class StringCompression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string - ");
        String str = sc.nextLine();
        String s = "";
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i< str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            s = s + str.charAt(i);
            if(count > 1){
                s = s + count.toString();
            }
        }
        System.out.println(s.length());
    }
}
