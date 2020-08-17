//demonstrating linked list in java
//using a menu driven program
//insertion of three types
//deletion at specfic positions
//traversing the list
class Node{
    protected int data;
    protected Node next;
    public Node(){
        data=0;
        next=null;
    }
    public Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setData(int data)
    {
        this.data=data;
    }
    public void setNext(Node next)
    {
        this.next=next;
    }
}
public class LinkedList {
    protected Node head;
    protected Node tail;
    protected int size;
    public LinkedList(){
        head=null;
        tail=null;
        size=0;
    }
    //method to check if the linked list is empty or not
    public boolean isEmpty(){
        return head==null;
    }
    //method to get the size of the linked list
    public int getSize(){
        return size;
    }
    //method to insert a node at the beginning of a list
    public void frontNodeInsertion(int data)
    {
        Node p=new Node(data,null);
        size++;
        if(head==null)
        {
            head=p;
            tail=head;
        }
        else{
            p.setNext(head);
            head=p;
        }
    }
    //method to insert a node at the end of a list
    public void endNodeInsertion(int data)
    {
        Node p=new Node(data,null);
        size++;
        if(head==null)
        {
            head=p;
            tail=head;
        }
        else{
            tail.setNext(p);
            tail=p;
        }
    }
    //method to insert a node at an specific position
    public void positionalInsertion(int data,int position)
    {
        Node nptr = new Node(data, null);
        Node ptr = head;
        position = position - 1;
        for (int i = 1; i < size; i++) {
            if (i == position) {
                Node tmp = ptr.getNext();
                ptr.setNext(nptr);
                nptr.setNext(tmp);
                break;
            }
            ptr = ptr.getNext();
        }
        size++;
    }
    //performing deletion on the linked list
    public void delete(int position)
    {
        if(position==1)
        {
            head=head.getNext();
            size--;
            return;
        }
        else if(position==size)
        {
            Node p=head;
            while(p.getNext()!=tail)
            {
                p=p.getNext();
            }
            tail=p;
            tail.setNext(null);
            size--;
            return;
        }
        position=position-1;
        Node p=head;
        for(int i=1;i<size-1;i++)
        {
            if(position==i)
            {
                Node temp=p.getNext();
                temp=temp.getNext();
                p.setNext(temp);
                break;
            }
            p=p.getNext();
        }
        size--;
    }
    //method to display the linked list
    public void display(){
        if(head==null)
        {
            System.out.println("the list is empty");
        }
        else{
            System.out.println("the list is as follows:");
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.getData()+" ");
                temp=temp.getNext();
            }
        }
    }
    public static void main(String[] args)
    {
        LinkedList l=new LinkedList();
        l.frontNodeInsertion(23);
        l.frontNodeInsertion(35);
        l.frontNodeInsertion(65);
        l.frontNodeInsertion(87);
        l.endNodeInsertion(32);
        l.endNodeInsertion(355);
        l.endNodeInsertion(35677);
        l.endNodeInsertion(1212);
        l.positionalInsertion(9304834,3);
        l.display();
        l.delete(1);
        System.out.println();
        l.display();
        l.delete(l.getSize());
        System.out.println();
        l.display();
        l.delete(3);
        System.out.println();
        l.display();
    }
}