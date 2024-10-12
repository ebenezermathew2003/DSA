import java.util.*;
public class array_2ndmax {
    public static int secondmax(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max)
            {
                secondmax=arr[i];
            }
        }
        return secondmax;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result=secondmax(arr);
        System.out.println(result);

    }
}
