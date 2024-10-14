import java.util.*;
public class resize_array {
    public static int[] resize(int[] arr,int capacity)
    {
        int[] temp=new int[capacity];
        for(int i=0;i<arr.length;i++)
        {
            temp[i]=arr[i];
        }
        arr=temp;
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int capacity=arr.length*2;
        int res[]=resize(arr,capacity);
        System.out.println("elements are");
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]+" ");
        }

        }
    
}
