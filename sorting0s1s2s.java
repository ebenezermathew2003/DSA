import java.util.*;
public class sorting0s1s2s {
    public int[] sort012(int[] arr)
    {
        int low=0,mid=0,high=arr.length-1;
        while (mid<=high) {
            switch (arr[mid]) {
                case 0:
                    int temp0=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp0;
                    low++;
                    mid++;
                    break;
                case 1:
                mid++;
                break;

                case 2:
                int temp2=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp2;
                high--;
                    break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    sorting0s1s2s s=new sorting0s1s2s();
    int n=sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    s.sort012(arr);
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]+" ");
    }

    }
}
