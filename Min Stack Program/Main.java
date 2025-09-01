//LeetCode Problem Number 159 Min Stack (Medium)

import java.util.*;
class MinStack
{
    private Stack<Integer> mainStack =new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();
    public void push(int x)
    {
        mainStack.push(x);
        if(minStack.isEmpty() || x<=minStack.peek())
        {
            minStack.push(x);
        }
    }
    public void pop()
    {
        if(!mainStack.isEmpty())
        {
            int x=mainStack.pop();
            if(x==minStack.peek())
            {
                minStack.pop();
            }
        }
    }
    public int top()
    {
        return mainStack.isEmpty() ? -1 : mainStack.peek();
    }
    public int getMin()
    {
        return minStack.isEmpty()  ? -1 : minStack.peek();
    }
}
public class Main 
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        MinStack st=new MinStack();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String input=sc.nextLine();
            if(input.startsWith("push"))
            {
                int x=Integer.parseInt(input.split(" ")[1]);
                st.push(x);
            }
            else if(input.equals("pop"))
            {
                st.pop();
            }
            else if(input.equals("top"))
            {
                System.out.println(st.top());
            }
            else if(input.equals("getMin"))
            {
                System.out.println(st.getMin());
            }
            else{
                System.out.println("Invalid input");
            }
        }
    }
}
