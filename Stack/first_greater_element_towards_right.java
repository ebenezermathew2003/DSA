package Stack;

import java.util.Stack;

public class first_greater_element_towards_right {
    public int[] nextgreaterelement(int[] arr)
    {
        int[] result=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            if(!stack.isEmpty())
            {
                while(!stack.isEmpty() && stack.peek()<=arr[i])
                {
                    stack.pop();
                }
            }
            if(stack.isEmpty())
            {
                result[i]=-1;
            }else{
                result[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
    first_greater_element_towards_right f1=new first_greater_element_towards_right();
    int[] arr={8,6,9,2,4,5,8};
    int[] result = f1.nextgreaterelement(arr);
    for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + " ");
    }
    }
}
