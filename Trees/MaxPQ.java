package Trees;

public class MaxPQ {
    private Integer[] heap;
    private int n;

    public MaxPQ(int capacity)
    {
        heap=new Integer[capacity+1];
        n=0;
    }
    public boolean isEmpty()
    {
        return n==0;
    }
    public int size()
    {
        return n;
    }
    public void insert(int x)
    {
        if(n==heap.length-1)
        {
            resize(2*heap.length);
        }
        n++;
        heap[n]=x;
        swim(n);
    }
    private void swim(int k)
    {
        while(k>1 && heap[k/2] < heap[k])
        {
            int temp=heap[k];
            heap[k]=heap[k/2];
            heap[k/2]=temp;
            k=k/2;
        }
    }
    public void resize(int capacity)
    {
        Integer[] temp=new Integer[capacity];
        for(int i=0;i<heap.length;i++)
        {
            temp[i] =heap[i];
        }
        heap=temp;
    }
    public void printheap()
    {
        for(int i=1;i<=n;i++)
        {
            System.out.print(heap[i]+" ");
        }
    }
    public static void main(String[] args) {
        MaxPQ pq=new MaxPQ(3);
        pq.insert(10);
        pq.insert(50);
        pq.insert(400);
        pq.insert(20);
        pq.insert(60);
        pq.printheap();
    }
    
}
