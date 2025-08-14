package Stack;

import java.util.Stack;

public class reverse_string_using_stack {
    public String reverseString(String s) {
        {
            Stack<Character> stri=new Stack<>();
            char[] chars=s.toCharArray();
            for(char c:chars)
            {
                stri.push(c);
            }
            for(int i=0;i<s.length();i++)
            {
                chars[i]=stri.pop();
            }
            return new String(chars);
        }
    }
    public static void main(String[] args) {
        reverse_string_using_stack obj=new reverse_string_using_stack();   
        System.out.println(obj.reverseString("Hello World"));
        
        
    }
    
}
