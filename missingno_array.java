import java.util.*;
public class missingno_array {
    public static int missingno(int[] arr)
    {
        int n=arr.length+1;
        int sum=n * (n+1)/2;
        for(int num:arr)
        {
            sum=sum-num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result=missingno(arr);
        System.out.println(result);
    }
}
