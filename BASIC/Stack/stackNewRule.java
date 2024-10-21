package BASIC.Stack;

public class stackNewRule extends stackParent{

    public void push(int val)
    {
        int[] newarr;

        if(isFull())
        {
            newarr = new int[arr.length*2];
            for(int i=0;i<arr.length;i++)
            {
                newarr[i] = arr[i];
            }

            super.arr = newarr;
        }
        tos++;
        size++;
        super.arr[tos] = val;
    }

}
