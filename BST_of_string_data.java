// to take the string from the user and print the character and push each character in the tree 
// and print that in that in the order of the insertion from the left ro right
import java.util.*;

 class node{
    char data;
    node left;
    node right;
    node(char data)
    {
       this.data=data;
       this.left=null;
       this.right=null;

    }
}
class str_tree{
	
	
    public static node insert(node root ,char value)
    {
        if(root==null)
        {
        	root=new node(value);
            return root;
        }
    
    if(root.data>value)
    {
        //left-subtree
        root.left=insert(root.left,value);
    }
    else
    {
    root.right=insert(root.right, value);
    }
    return root;
}
   public static void inorder(node root)
{
    if(root == null)
    {
        return ;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}

public static void main(String[] args)
{

    /*


    int value[]= {5,1,3,4,2,7};
    node root=null;
	for(int i=0 ; i<value.length ; i++)
    {
       root=insert(root,value[i]);
    }
    inorder(root);
    System.out.println(" ");


    */


   
  
   // System.out.println("enter the size of the array");
    Scanner sc=new Scanner(System.in);
     System.out.println("enter the string that you want to push in to the tree");
    String  str=sc.next();
    node root=null;
    int n=str.length();
    char[] arr=new char[n];
    for (int i=0;i<n;i++)
    {
       arr[i]=str.charAt(i);
    }
    // to print the character of the string
    for (int i = 0; i < n; i++) {
           System.out.println( arr[i]);
        }
       
	for(int i=0 ; i<n; i++)
    {
       root=insert(root,arr[i]);
    }
    inorder(root);
     System.out.println(" ");
   



  /*
    int[] arr=new int[40];
    System.out.println("enter the size of the array");
    Scanner sc=new Scanner(System.in);
    int  n=sc.nextInt();
   // int value[]= {5,1,3,4,2,7};
    node root=null;
    System.out.println("enter the element that you want to push in to the tree");
    for (int i=0;i<n;i++)
    {
       arr[i]=sc.nextInt();
    }
	for(int i=0 ; i<n; i++)
    {
       root=insert(root,arr[i]);
    }
    inorder(root);
    System.out.println(" ");
    */
}
}