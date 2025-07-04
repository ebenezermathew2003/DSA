import java.util.*;

public class kth_smallest {

    public static int kthSmallest(int[] arr, int k) {
        // Max-heap of size k
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for (int a : arr) {
            p.add(a);
            if (p.size() > k) {
                p.poll(); // remove the largest
            }
        }
        return p.peek(); // kth smallest
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        if (k > 0 && k <= n) {
            int result = kthSmallest(arr, k);
            System.out.println("The " + k + "th smallest element is: " + result);
        } else {
            System.out.println("Invalid value of k. It should be between 1 and " + n);
        }
    }
}
