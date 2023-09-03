import java.util.*;
class node 
{   
    int data;
    node next;      
    node(int data)
    {
        this.data=data;
        this.next=null;
                               
    }
}

class stack_using_ll
{
    node top;
    stack_using_ll()
    {
        this.top=null;
    }
    void push(int data)
    { 
        node newnode=new node(data);
        if(top==null)
        {
            top=newnode;
            newnode.next=null;
        }
        else
        {
            newnode.next=top;
            top=newnode;
            System.out.println("the node is pushed in the stack");
        }
    }
    // to delete the node from the stack
    public void pop()
    {
        if(top==null)
        {
            System.out.println("uderflow");
        }
        else
        {
            top=top.next;
            System.out.println("deleted successfully");
        }
    }
 public void display()
    {
        if(top==null)
        {
            System.out.println("the stack is empty");
            
        }
       while(top!=null)
       {
         System.out.println(+top.data+"");
         top=top.next;
       }
    }
}


class stack{
    public static void main(String[] args)
    {
        stack_using_ll aa=new stack_using_ll();
        aa.push(44);
        aa.push(55);
        aa.push(90);
        aa.pop();
        aa.display();

    }
}