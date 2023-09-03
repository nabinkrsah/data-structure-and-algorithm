import java.util.*;
  class node
    {
        int data;
        node next;
        
        public node(int data)
        {
            this.data=data;
            this.next=null;


        }
    }
class linkedlist{
    node head;
    node tail;
    public linkedlist() {
        this.head = null;
        this.tail = null;
    }
  
    // insert at the beginning
        public void insert_beginning(int data)
        {
            node newnode=new node(data);
           if(head == null){
            head = newnode;
            tail = newnode;
           }
           else{
            newnode.next=head;
            head=newnode;
            // System.out.println("inserted data at beginning is"+data);
           }
       
        }
        public void display()
{
    node current=head;
    if(head==null)
    {
        System.out.print("nothing");
    }
    else{
    while(current!=null)
    {
        System.out.print(+current.data+" ->");
        current=current.next;
    }
    }
}
    // to concatenate the two list  
    // public linkedlist concatenate(linkedlist list1, linkedlist list2)
    // {
    //     if(list1.head == null){ return list2;}
    //     if(list2.head == null){ return list1;}

    //     list1.tail.next = list2.head;
    //     list1.tail = list2.tail;
    //     // tail = list2.tail;

    //     return list1;
    // } 
    // display items


// to concatenate the two linked list
public linkedlist concatenate(linkedlist list1, linkedlist list2) {

        if (list1.head == null) {
            return list2;
        }
        if (list2.head == null) {
            return list1;
        }
        list1.tail.next = list2.head;
        list1.tail = list2.tail;
         tail = list2.tail;
         head=list1.head;
         System.out.println("h");
        return list1;
    }
    public int number()
    {
    node current=head;
    int count=0;
    while(current!=null)
    {
        count++;
        current=current.next;
       
    }
        //  System.out.println("no of nodes are"+count);
        return count;
    }
    public void split()
    {   
        linkedlist list1, list2;
        int c=1;
        node current=head;
        while(c != number()/2 )
        {
            current=current.next;
            c++;
        }
        list1.head=head;
        list1.tail=current;
        list2.head=current.next;
        list2.tail=tail;

        list1.display();
        list2.display();
    }

}


public class concat
{
    public static void main(String[] args)
    {
        linkedlist aa=new linkedlist();
        aa.insert_beginning(1);
        aa.insert_beginning(2);
        aa.insert_beginning(3);
        aa.insert_beginning(4);
        aa.insert_beginning(5);
        System.out.println("the first list is");
        aa.display();
        linkedlist bb=new linkedlist();
        bb.insert_beginning(9);
        bb.insert_beginning(8);
        bb.insert_beginning(7);
        bb.insert_beginning(0);
        bb.insert_beginning(90);
         System.out.println("the second list is");
       bb.display();
      linkedlist cc=new linkedlist();
        cc.concatenate(aa,bb);
        System.out.println("the list after concatination is:");
        cc.display();
        cc.number();
        cc.split();
        
       
    }
}