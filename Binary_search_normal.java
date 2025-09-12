import java.util.*;

public class Binary_search_normal {
    public int Binary_search(int[] arr,int n,int x)
{
    int low=0,high=arr.length-1;
    while(low<=high)
    {
        int mid=low+(high-low)/2;
        if(arr[mid]==x)
        {
            return mid;
        }else if(arr[mid]<x)
        {
            low=mid+1;
        }else 
        {
            high=mid-1;
        }
    }
    return -1;
}
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Binary_search_normal bs=new Binary_search_normal();
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int x=sc.nextInt();
    int res=bs.Binary_search(arr,n,x);
    if (res == -1) {
        System.out.println("Element not found");
    } else {
        System.out.println("Element found at index: " + res);
        }
    }
}
