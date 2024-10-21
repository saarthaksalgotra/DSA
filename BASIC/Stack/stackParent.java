package BASIC.Stack;

public class stackParent {
    int[] arr = new int[5];
    int tos = -1;
    int size = 0;


    public void push(int val)
    {
        if(isFull())
        {
            System.out.println("Stack Full");
            return;
        }
        tos++;
        size++;
        arr[tos] = val;
    }

    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack Empty");
            return;
        }
        arr[tos] = 0;
        tos--;
        size--;

    }

    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack Empty");
            return;
        }

        System.out.println(arr[tos]);
    }

    public boolean isFull()
    {
        return size==arr.length;
    }

    public boolean isEmpty()
    {
        return tos==-1;
    }

    public void display()
    {
        for(int i=tos;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
