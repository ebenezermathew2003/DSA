package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class generate_binary_numbers {
    public String[] generatebinary(int n)
    {
        String[] result=new String[n];
        Queue<String> q=new LinkedList<>();
        q.offer("1");
        for(int i=0;i<n;i++)
        {
            result[i]=q.poll();
            String n1=result[i]+"0";
            String n2=result[i]+"1";
            q.offer(n1);
            q.offer(n2);
        }
        return result;
    }

    public static void main(String[] args) {
    generate_binary_numbers g1=new generate_binary_numbers();
    String[] str=g1.generatebinary(7);
    for (String s : str) {
        System.out.print(s + " ");
    }
    }
    
}
