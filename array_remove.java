class array_remove{
    public static void printarray(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static int[] Removeeven(int[] arr)
    {
        int OddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
            {
                OddCount++;
            }
        }
        int[] result=new int[OddCount];
        int idx=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                result[idx]=arr[i];
                idx++;
            }

        }
        return result;
    }
    public static void main(String[] args) {
    int[] arr={2,8,6,3,7,9,5,1,4,2};
    printarray(arr);
    int[] result=Removeeven(arr);
    printarray(result);
        
    }
}