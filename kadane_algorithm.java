public class kadane_algorithm {
    int maxSubArraySum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int currentsum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            currentsum += arr[i];

            if (currentsum > max) {
                max = currentsum;
            }

            if (currentsum < 0) {
                currentsum = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        kadane_algorithm obj = new kadane_algorithm();
        
        int arr1[] = {2, 3, -8, 7, -1, 2, 3};
        System.out.println("Max Subarray Sum = " + obj.maxSubArraySum(arr1)); // 11

        int arr2[] = {-2, -4};
        System.out.println("Max Subarray Sum = " + obj.maxSubArraySum(arr2)); // -2

        int arr3[] = {5, 4, 1, 7, 8};
        System.out.println("Max Subarray Sum = " + obj.maxSubArraySum(arr3)); // 25
    }
}
