import java.util.*;
public class minimise_height {
    public int miniheight(int[] arr,int k)
    {
        int n=arr.length;
        if(n==1)
        {
            return 0;
        }
        Arrays.sort(arr);
        int max=0,min=0;
        int diff=arr[n-1]-arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]-k<0)
            {
                continue;
            }
            max=Math.max(arr[i-1]+k, arr[n-1]-k);
            min=Math.min(arr[0]+k, arr[i]-k);
            diff=Math.min(diff,max-min);
        }

        return diff;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    minimise_height m=new minimise_height();
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    int res=m.miniheight(arr,k);
    System.out.println(res);
}
    
}
