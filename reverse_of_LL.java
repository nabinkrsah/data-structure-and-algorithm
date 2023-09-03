import java.util.*;
  class node
    {
        node next;
        int data;
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
           else
           {
            newnode.next=head;
            head=newnode;
            // System.out.println("inserted data at beginning is"+data);
        }
       
        
        }
    // display items

    public void displayItems() 
    {
        node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");
    }
    // to find the dublicate elements the list
    public void to_find_dublicate()
    {
        int count=0;
        node current=head;
        
        while(current!=null)
        {
            node present=current.next;
            while(present!=null)
            {
                // System.out.println("the");
                if(current.data==present.data)
                {
                  //  System.out.println("the");
                    count++;
                     System.out.println("the dublicate element is"+current.data);
                    break;
                }
                present=present.next;
            }
            
           
            current=current.next;
            
        }
    }
    // to delete the dublicate elements of the linked list from an unsorted list

    public void dulete_dublicate()
    {

        
       // int count=0;
        node current=head;
        
        while(current!=null)
        {
            node last_present=current;
            node present=current.next;
            while(present!=null)
            {
                // System.out.println("the");
                if(current.data==present.data)
                {

                   
                  //  System.out.println("the");
                   // count++;
                    last_present.next=present.next;
                }
                present=present.next;
                last_present=last_present.next;
            }
            
           
            current=current.next;
            
        }
    

    }
    // to revere the elements of the linked list
    public void to_reverse()
    {
        node previous=null;
        node current=head;
        node nextnode=head;
        while(nextnode!=null)
        {
            nextnode=nextnode.next;
            current.next=previous;
            previous=current;
            current=nextnode;
        }
        head=previous;
    }    

}

public class reverse
{
    public static void main(String[] args)
    {
        linkedlist aa=new linkedlist();
        aa.insert_beginning(1);
        aa.insert_beginning(20);
        aa.insert_beginning(3);
        aa.insert_beginning(7);
        aa.insert_beginning(3);
        aa.insert_beginning(62);
        aa.insert_beginning(44);
        aa.insert_beginning(7);
        aa.insert_beginning(5);
        
        aa.displayItems();
     // aa.to_reverse();
      aa.to_find_dublicate();
      aa.displayItems();
      aa.dulete_dublicate();
      System.out.println("the element after deleting the dublicate element is");
      aa.displayItems();
    }
}


// //void removeDuplicates()
//     {
//         /*Another reference to head*/
//         Node curr = head;
 
//         /* Traverse list till the last node */
//         while (curr != null) {
//             Node temp = curr;
//             /*Compare current node with the next node and
//             keep on deleting them until it matches the
//             current node data */
//             while (temp != null && temp.data == curr.data) {
//                 temp = temp.next;
//             }
//             /*Set current node next to the next different
//             element denoted by temp*/
//             curr.next = temp;
//             curr = curr.next;
//         }
//     }