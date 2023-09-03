import java.util.*;
class linkedlist{
    node head;
    class node
    {
        node next;
        int data;
        node(int data)
        {
            this.data=data;
            this.next=null;


        }
    }
    // insert at the beginning
        public void insert_beginning(int data)
        {
            node newnode=new node(data);
           
            newnode.next=head;
            head=newnode;
            System.out.println("inserted data at beginning is"+data);
           
       
        }
        //insert at the last
         public void insert_at_last(int data)
        {
            node newnode=new node(data);
            node current=head;
            if(head==null)
            {
                System.out.println("the linked list is empty");
               
            }
            else
            {
                while(current.next!=null)
                {
                    current=current.next;
                }
            System.out.println("the at last is "+data);
                current.next=newnode;
               
            }
        }
         //inset the element in the middle
        public void insert_at_middle(int data,int at_which_data)
        {
            node newnode=new node(data);
            node current=head.next;
            node previous=head;
            while(current.data!=at_which_data)
            {
                current=current.next;
                previous=previous.next;

            }
             System.out.println("inserted the element before " +at_which_data+ " is "+data);
            newnode.next=current;
            previous.next=newnode;
          


        }

         public void delete_begin()
         {
            if(head==null)
            {
                System.out.println("the list is emmty");
                
            }
            else 
            {
                System.out.println("the first element got deleted");
                head=head.next;
            }
         }
         public void delete_last()
         {
            node current=head.next;
            node previous=head;
             if(head==null)
            {
                System.out.println("the list is emmty");
                
            }
            else
            {
                while(current.next!=null)
                {
                    current=current.next;
                    previous=previous.next;
                }
                previous.next=null;
                System.out.println("the last element got deleted");
            }

         }
//display the element of the linked list
        public void display()
        {
            node current=head;
            while(current!=null)
            {
                System.out.print(current.data+"->");
                current=current.next;
            }
        }
       

    public static void main(String[] args)
    {
linkedlist aa=new linkedlist();
aa.insert_beginning(5);
aa.insert_beginning(10);
aa.insert_beginning(50);
aa.insert_beginning(100);
aa.insert_at_last(899);
aa.insert_at_middle(56,50);
aa.delete_begin();
aa.delete_last();

aa.display();

    }
}