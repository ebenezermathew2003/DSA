import java.util.Scanner;

public class arrayelemets {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The array elements are:");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        
        sc.close();
    }
}