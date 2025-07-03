import java.util.ArrayList;
import java.util.*;
import java.util.List;
public class duplicate_number {
    public ArrayList<Integer> findduplicate(int[] arr)
    {
        java.util.ArrayList<Integer> duplics=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {
                if(duplics.isEmpty()||duplics.get(duplics.size()-1)!=arr[i])
                {
                    duplics.add(arr[i]);
                }
            }
        }
        return duplics;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        duplicate_number dn = new duplicate_number();

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        ArrayList<Integer> result = dn.findduplicate(arr);

        System.out.println("Duplicate numbers: " + result);
    }
}
