import java.util.Scanner;
public class string_palindrome1 {
     public static boolean palindrome(String str)
    {
        char[] c= str.toCharArray();
        int start=0;
        int end=str.length()-1;
        while(start<end){
        if(c[start]!=c[end])
        {
            return false;
        }
        start++;
        end--;
    }
    return true;
    }
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    Boolean b=palindrome(str);
    if(b)
    {
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not Plaindrome");
    }
    
    }
    
}
