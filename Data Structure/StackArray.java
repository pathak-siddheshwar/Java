//demonstrating stack using array
import java.util.*;
import java.lang.*;
import java.io.*;
public class StackArray {
    private int[] a;
    private int size;
    private int top=0;
    public StackArray(int size)
    {
        this.a=new int[size];
        this.size=size;
    }
    //pushing an element in the stack
    public void push(int data)
    {
        if(isFull())
        {
            throw new StackOverflowError("Stack Overflow");
        }
        a[top]=data;
        top++;
    }
    //popping an element from the stack
    public int pop()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        return a[--top];
    }
    //the peek the top of the stack
    public int peek()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        int i=top-1;
        return a[i];
    }
    //return true if stack is full
    public Boolean isFull()
    {
        if(top>=size)
            return true;
        return false;
    }
    //return true if stack is empty
    public Boolean isEmpty()
    {
        if(top<=0)
            return true;
        return false;
    }
    public static void main(String[] args)
    {
        StackArray s=new StackArray(5);
        s.push(45);
        s.push(354);
        s.push(34);
        s.push(3);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}