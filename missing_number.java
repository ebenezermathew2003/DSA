public class missing_number {
    public int  findMissingNumber(int [] arr) {
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {
        sum = sum - arr[i];
    }
    return (int)sum;
}
    public static void main(String[] args) {
    missing_number m=new missing_number();
    int[] arr = {1, 2, 3, 5};
    System.out.println(m.findMissingNumber(arr));
}
}
