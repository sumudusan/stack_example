public class stack
{
    int arr[];
    int top;
    int capacity;

    public stack(int size)
    {
        arr=new int[size];
        capacity=size;
        top=-1;
    }
//push
    public boolean isFull()
    {
        return top+1==capacity;
    }

   public void push(int x)
    {
        if (isFull())
        {
           System.out.println("Over Flow");
        }
        else
        {
            top++;
            arr[top]=x;
            System.out.println("inserting:"+x);
        }
    }

    //pop
    public boolean isEmpty()
    {
        return top==-1;
    }
    public void pop(int y)
    {
       if (isEmpty())
       {
           System.out.println("Stack already empty");
       }
       else
       {
           top--;
           arr[top]=y;
           System.out.println("Removing:"+y);
       }
    }

}
