import java.util.*;
public class string_palindrome {
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        String str = dc.next();
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            rev = c + rev;
        }
        if (rev.toLowerCase().equals(str.toLowerCase())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    
}
