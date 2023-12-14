package ExceptionLearning;


class StackOverFlow extends Exception
{
    public String toString()
    {
        return "Stack is Full";
    }
}

class StackUnderFlow extends Exception
{
    public String toString()
    {
        return "Stack is Empty";
    }
}


class Stack
{
    private int size;
    private int top=-1;
    private int S[];
    
    public Stack(int sz)
    {
        size=sz;
        S=new int[sz];
    }
    
    public void push(int x) throws StackOverFlow
    {
        if(top==size-1)
            throw new StackOverFlow();
        top++;
        S[top]=x;
    }
    
    public int pop() throws StackUnderFlow
    {
        int x=-1;
        
        if(top==-1)
            throw new StackUnderFlow();
        x=S[top];
        top--;
        return x;              
    }
}

public class  StackExceptionExcercise{
    public static void main(String[] args) {
        Stack st = new Stack(5);
        try {
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            // st.push(60);
        } catch (StackOverFlow e) {
            System.out.println(e);
        }

        try {
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            // st.pop();
        } catch (StackUnderFlow e) {
            System.out.println(e);
        }

    }
}
