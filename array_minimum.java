import java.util.*;
public class array_minimum {
    public static int minimum(int[] arr)
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.err.println("Elements are");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int res=minimum(arr);
    System.out.println(res);

 }   
}
