import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class missing_and_repeating {

    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        long sum = 0;
        int repeated = -1;

        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
            if (arr[i] == arr[i + 1]) {
                repeated = arr[i];
            }
        }
        sum += arr[n - 1];

        long expectedSum = (long) n * (n + 1) / 2;
        int miss = (int) (expectedSum - (sum - repeated));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(repeated);
        list.add(miss);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of elements (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read the elements
        System.out.println("Enter the elements (1 to n, one repeating, one missing):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        missing_and_repeating obj = new missing_and_repeating();
        ArrayList<Integer> result = obj.findTwoElement(arr);

        // Output
        System.out.println("Repeating element: " + result.get(0));
        System.out.println("Missing element: " + result.get(1));

        sc.close();
    }
}
