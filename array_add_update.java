import java.util.Scanner;

public class array_add_update {
    public void arrayprint(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<=n-1;i++)
        {
            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }
    public void arraydemo()
    {
        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=5;
        arr[2]=3;
        arr[3]=2;
        arr[4]=1;
        arrayprint(arr);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        array_add_update a1=new array_add_update();
        a1.arraydemo();

    }
    
}