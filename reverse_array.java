import java.util.*;
public class reverse_array {
    public static int[] reveresedarray(int[] arr,int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        return arr;
    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    reverse_array r1=new reverse_array();
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    int start=0;
    int end=arr.length-1;
    int result[] = reveresedarray(arr,start,end);
    for(int i=0;i<result.length;i++)
    System.out.println(result[i]);


}    
}
