import java.util.*;
import java.lang.*;
class Node{
    protected int data;
    protected Node next;
    protected Node previous;
    public Node()
    {
        this.data=0;
        this.next=null;
        this.previous=null;
    }
    public Node(int value,Node next,Node previous)
    {
        this.data=value;
        this.next=next;
        this.previous=previous;
    }
    public void setData(int data)
    {
        this.data=data;
    }
    public void setNext(Node next)
    {
        this.next=next;
    }
    public void setPrevious(Node previous)
    {
        this.previous=previous;
    }
    public int getData()
    {
        return data;
    }
    public Node getNext(){
        return next;
    }
    public Node getPrevious(){
        return previous;
    }
}

public class DoublyLinkedList {
    protected int size;
    protected Node head;
    protected Node tail;
    //initializing constructor
    public DoublyLinkedList(){
        size=0;
        head=null;
        tail=null;
    }
    //function to check if the list is empty
    public boolean isEmpty(){
        return head==null;
    }
    //to get the size of the list
    public int getSize(){
        return size;
    }
    //inserting at the end
    public void insert(int data)
    {
        Node p=new Node(data,null,null);
        size++;
        if(head==null)
        {
            head=p;
            tail=head;
        }
        else
        {
            Node temp;
            temp=tail;
            tail.setNext(p);
            tail=p;
            tail.setPrevious(temp);
        }
    }
    //displaying the doubly linked list
    public void display(){
        if(head==null)
        {
            System.out.println("the list is empty there is nothing to display");
            return;
        }
        Node temp=head;
        System.out.println("The list is as follows:");
        while(temp!=null)
        {
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }

    //deleting an element from the linked list
    //the deletion is done on the value of the element not the position
    public void delete(int value)
    {
        if(head.getData()==value)
        {
            head=head.getNext();
            head.setPrevious(null);
            System.out.println("Element deleted successfully");
            size--;
            return;
        }
        else if(tail.getData()==value)
        {
            tail=tail.getPrevious();
            tail.setNext(null);
            System.out.println("Element deleted successfully");
            size--;
            return;
        }
        else{
            Node temp=head;
            while(temp.getData()!=value)
            {
                temp=temp.getNext();
            }
            if(temp!=null)
            {
                (temp.getPrevious()).setNext(temp.getNext());
                (temp.getNext()).setPrevious(temp.getPrevious());
                System.out.println("Element deleted successfully");
                size--;
                return;
            }
            else{
                System.out.println("Element not found");
            }

        }
    }
    
    //the code to search an element in the list
    public boolean find(int value)
    {
        if(head.getData()==value)
            return true;
        else if(tail.getData()==value)
            return true;
        Node temp=head;
        while(temp.getData()!=value && temp.getNext()!=null)
        {
            temp=temp.getNext();
        }   
        if(temp.getNext()!=null)
            return true;
        
        return false;
    }
    //the operating method
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        DoublyLinkedList l=new DoublyLinkedList();
        int c;
        System.out.println("Follow the given menu to operate with this program");
        System.out.println("The data should be integer as all the data values are of type int for each node");

        do{
            System.out.println("1-Insert\n2-Delete\n3-Display\n4-Search\n5-Check the size\n6-Exit");
            c=s.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("Enter the element to insert");
                    int x=s.nextInt();
                    int y=l.insert(x);
                    break;
                case 2:
                    System.out.println("Enter the element to delete");
                    int y=s.nextInt();
                    l.delete(y);
                    break;
                case 3:
                    l.display();
                    break;
                case 4:
                    System.out.println("Enter the element to search");
                    int z=s.nextInt();
                    if(l.find(z))
                    {
                        System.out.println("Element present");
                    }
                    else{
                        System.out.println("Element not present");
                    }
                    break;
                case 5:
                    System.out.println("the size is "+ l.getSize());
                    break;
                default:
                    System.out.println("wrong choice");
            }
        }while(c!=6);
    }
}