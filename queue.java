import java.util.*;
class node
{
    int data;
    node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class queue_using_ll
  {
    node front; 
    node rare;
    queue_using_ll()
     {
        this.front=null;
        this.rare=null;
     }

    public void enqueue(int data)
    {  
    node newnode=new node(data);
    
       if(front==null && rare==null)
    {
        front=rare=newnode;
       
    }
    else
    {
            rare.next=newnode;
            rare=newnode;

    }
    }
    public void dequeue()
    {
        if(front==null && rare==null)
        {
            System.out.println("the queue is already empty");
        }
        else
        {
            front=front.next;
             System.out.println("element got deleted");
        }
        }
        public void display()
        {
            node current=front;
            if(front==null)
            {
                System.out.println("the queue list is empty ");
            }
            else{
                while(current!=null)
                {
                    System.out.println(+current.data+"->");
                    current=current.next;
                }
            }

        }
}

    
class queue{
    public static void main(String[] args)
    {
        queue_using_ll aa=new queue_using_ll();
        aa.enqueue(56);
        aa.enqueue(88);
        aa.enqueue(90);
        aa.enqueue(8);
        aa.dequeue();
        aa.equeue();
        aa.display();

    }
}




