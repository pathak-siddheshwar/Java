import java.util.*;
import java.lang.*;
import java.io.*;
public class QueueArray {
    private int rear;
    private int front;
    private int capacity;
    private int[] queue;
    public QueueArray(int capacity)
    {
        this.rear=0;
        this.front=0;
        this.queue=new int[capacity];
        this.capacity=capacity;
    }
    //enque operation
    public void enque(int data)
    {
        if(rear==capacity)
        {
            System.out.println("queue full");
            return;
        }
        else{
        queue[rear]=data;
        rear++;
        }
        return;
    }
    //deque operation
    public void deque()
    {
        if(rear==front)
        {
            System.out.println("queue empty");
            return;
        }else{
        System.out.println("the element dequed is "+queue[front]);
        for(int i=0;i<rear-1;i++)
        {
            queue[i]=queue[i+1];
        }
        if(rear<capacity)
            queue[rear]=0;
        
        rear--;
        }
        return;
    }
    //to diplay the queue
    public void display(){
        if(rear==front)
        {
            System.out.println("the queue is empty");
            return;
        }
        System.out.println("the queue is as follows");
        for(int i=front;i<rear;i++)
        {
            System.out.println(queue[i]);
        }
    }
    //main method
    public static void main(String[] args)
    {
        QueueArray q=new QueueArray(5);
        q.enque(34);
        q.enque(35);
        q.enque(355);
        q.display();
        q.deque();
        q.display();
    }
}