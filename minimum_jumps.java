import java.util.Scanner;

public class minimum_jumps {

    static int min_jumps(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Math.max(arr[i], arr[i - 1] - 1);
        }
        int count = 0, ind = 0;
        while (ind < arr.length - 1) {
            if (arr[ind] == 0) {
                return -1;
            }
            ind += arr[ind];
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Read elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call min_jumps and print result
        int result = min_jumps(arr);

        if (result == -1) {
            System.out.println("Cannot reach the end of the array.");
        } else {
            System.out.println("Minimum number of jumps required: " + result);
        }

        sc.close();
    }
}
