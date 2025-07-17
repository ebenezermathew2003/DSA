import java.util.Scanner;

class max_product_of_subarray {
    int maxProduct(int[] arr) {
        int maximum = arr[0], max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int a = arr[i] * max;
            int b = arr[i] * min;

            max = Math.max(Math.max(a, b), arr[i]);
            min = Math.min(Math.min(a, b), arr[i]);
            maximum = Math.max(maximum, max);
        }
        return maximum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        max_product_of_subarray sol = new max_product_of_subarray();
        int result = sol.maxProduct(arr);
        System.out.println("Maximum Product Subarray = " + result);

        sc.close();
    }
}
