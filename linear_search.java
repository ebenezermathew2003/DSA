import java.util.*;
public class linear_search {
    public int linaer(int[] arr,int n,int x)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    linear_search ls=new linear_search();
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int x = sc.nextInt();
    int res=ls.linaer(arr,n,x);
    if(res==-1)
    {
        System.out.println("not found");
    }
    else{
        System.out.println("found at position: "+res);
    }
    }
    
}
