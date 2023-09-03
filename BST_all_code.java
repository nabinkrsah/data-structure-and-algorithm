// to insert the element in the tree either in static way or by using array
import java.util.*;

 class node{
    int data;
    node left;
    node right;
    node(int data)
    {
       this.data=data;
       this.left=null;
       this.right=null;

    }
}
class bst{
	
	
    public static node insert(node root ,int value)
    {
        if(root==null)
        {
        	root=new node(value);
            return root;
        }
    
    if(value<root.data)
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
public static boolean search(node root, int key)
{
    if(root == null)
    {
        return false;
    }
    if(root.data>key)
    {
        // left subtree
        return search(root.left,key);
    }
    else if(root.data==key)
    {
        return true;
    }
    else//(root.data<key)
    {
        return search(root.right,key);
    }
}

public static node delete(node root ,int val)
{// for searching
    if(root.data>val)
    {
        root.left=delete(root.left,val);
    }
    else if(root.data<val)
    {
        root.right=delete(root.right,val);
    }
    else// to delete // root.data==val
    {
        if(root.left==null && root.right==null)
       { return null;}
        if(root.left==null)
        {
            return root.right;
        }
        else if( root.right==null)
        {
            return root.left;
        }
        node is=inordersuccessor(root.right);
        root.data=is.data;
        root.right=delete(root.right,is.data);
    }
    return root;
}
public static node inordersuccessor(node root)
{
    while(root.left!=null)
    {
        root=root.left;
    }
    return root;
}
public static void print_in_range(node root, int x, int y)
{
    if(root==null )
    {
        return ;
    }
    if(root.data>=x && root.data<=y)
    {
        print_in_range(root.left,x,y);
       
        System.out.print(root.data+" ");
         print_in_range(root.right,x,y);
    }
    else if(root.data>=y)
    {
          print_in_range(root.left,x,y);
    }
    else{
        print_in_range(root.right,x,y); 
    }
}

// to print all the path nodes of the tree
public static void printpath(ArrayList<Integer> path)
{
    for(int i=0;i<path.size();i++)
    {
        System.out.println(path.get(i)+" ");
    }
    System.out.println( );
}
public static void print_root2leaf(node root,ArrayList<Integer>path)
{
    if(root ==null)
    {
        return ;
    }
    path.add(root.data);
    //left
    if(root.left==null && root.right==null)
    {
        printpath(path);

    }
    else{
        //non leaf
        print_root2leaf(root.left,path);
         print_root2leaf(root.right,path);

    }
    path.remove(path.size()-1);
}
// to find the maximum element in the tree
 public static void maximum(node root)
    {
       node current=root;
       while(current.right!=null)
       {
           current=current.right;
       }
       System.out.println("the largest element in the tree is:"+current.data);
    }
    // to find the smallest element in the tree
    public static void min(node root)
    {
       node current=root;
       while(current.left!=null)
       {
           current=current.left;
       }
       System.out.println("the smallest element in the tree is"+current.data);
    }
    /*
            // to find the node at the given level this is correct
    public static void print_leval_ele(node root, int leval)
    {node current=root;
        if(current==null)
    {
      return ;
    }
    if(leval==1)
    {
        System.out.print(current.data+" ");
    }
    else //if(leval>1)
    {
        print_leval_ele(current.left,leval-1);
        print_leval_ele(current.right,leval-1);
    }
        
    }


    / to display the leval order travelrsal
public static void level_order_traversal(node root)
{//node current=root;
    if(root==null)
    {
        return ;
        
    }
   int  h=height(root);
    for(int i=1;i<=h;i++)
    {
        print_leval_ele(root,i);
    }
}
     */
// to find the height of the tree
     public static int height(node root)
    {
        if(root ==null)
        {
            return 0;
        }
        
        return Math.max(height(root.left),height(root.right)+1);
    
    }
    // to find the level of the tree at particular element

    public static int level_of_ele(node root , int key, int level)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.data==key)
        {
            return level;
        }
        else if(key<root.data)
        {
            return level_of_ele(root.left, key, level+1);
        }
        else 
        {
             return level_of_ele(root.right, key, level+1);
        }
    }
    // to count the number of nodes in the given binary tree
    public static int count( node root )
    {
        if(root==null)
        {
            return 0;

        }
        return count(root.left)+count(root.right)+1;
    }

    // to check whether the node is internal or external
  public static boolean isInternal( node root , int value) {
        if (root == null)
            return false;

        if (root.data == value && (root.left != null || root.right != null))
            return true;

        if (value < root.data)
            return isInternal(root.left, value);
        else
            return isInternal(root.right, value);
    }

    public static boolean isExternal(node root, int value) {
        return !isInternal(root, value);
    }


// to find the number of internal node
 public static int countInternalNodes(node root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 0;

        return 1 + countInternalNodes(root.left) + countInternalNodes(root.right);
    }
 // to find the number of external node
    public static int countExternalNodes(node root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        return countExternalNodes(root.left) + countExternalNodes(root.right);
    }



public static void main(String[] args)
{

    


    int value[]= {8,5,3,6,1,4,10,11,14};
    node root=null;
	for(int i=0 ; i<value.length ; i++)
    {
       root=insert(root,value[i]);
    }
    inorder(root);

     System.out.println(isExternal(root,4));
     System.out.println(isExternal(root,8));
     System.out.println("the number of external node is:"+countExternalNodes(root));
     
      System.out.println("the number of internal node is:"+countInternalNodes(root));
      
    System.out.println(" ");
    System.out.println("the number of nodes in the given binary tree is "+count(root));
    System.out.println(" ");
    System .out.println("the level of that the given element is"+level_of_ele(root ,8,1));
     System.out.println(" ");
    maximum(root);
     System.out.println(" ");
    min(root);
     System.out.println("the height of the tree is : "+height(root));
    System.out.println(" ");
    if(search(root,7))
    {
        System.out.println("element:found");
    }
    else{
         System.out.println("element:not found");
    }
    inorder(root);
    System.out.println();
     System.out.println(" the different path of the tree are as follow  ");
     print_root2leaf(root ,new ArrayList<>());

    //to delete the data 
    //   System.out.println("for delete ");
    // delete(root ,4);
    // inorder(root);
    // System.out.println(" ");
//  System.out.println("the elment in the given range is  ");
//  print_in_range(root , 6,10);
    


   
  
   // System.out.println("enter the size of the array");
    // Scanner sc=new Scanner(System.in);
    //  System.out.println("enter the string that you want to push in to the tree");
    // String  str=sc.next();
    // node root=null;
    // int n=str.length();
    // char[] arr=new char[n];
    // for (int i=0;i<n;i++)
    // {
    //    arr[i]=str.charAt(i);
    // }
   
  
  /*  int[] arr=new int[40];
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



/*
   // to find the sibling
public static node find_sibling(node root, int key)
{if(root==null)
{
    return null;
}
node parent=null;
while(root!=null)
{
    if(key<root.data)
    {
        parent=root;
        root=root.left;
    }
    else if(key>root.data)
    {
         parent=root;
        root=root.right;
    }
    else{
        break;
    }
}
if(parent.left!=null && parent.left.data==key)
{
    return parent.right;
}
if(parent.right!=null && parent.right.data==key)
{
    return parent.left;
}
return null;
}
// to get the parent element of the given key element
public static node parent_node(node root, int key)
{
    if(root==null)
    {
        return null;
    }
    node parent=null;
    while(root!=null)
    {
        if(root.data>key)
        {
            parent=root;
            root=root.left;
        }
        else if(root.data<key){
            parent=root;
            root=root.right;
        }
        else{
            break;
        }
    }
    return root!=null ? parent:null;
}
 for execution
  if(find_sibling(root,p)!=null)
      {
          System.out.println(find_sibling(root,p).data);
      }
      else{
         System.out.println("sibling doesnot exist"); 
      }
       
       
       // to find the parent of the particulat element
       if(parent_node(root,1)!=null)
       {
           System.out.println(parent_node(root,1).data);
       }
       else{
           System.out.println("parent doesnot exist");
       }
 */

 /*
   // to find the external element and display them
   
   public static void external_ele(node root)
   {
       if(root==null)
       {
           return ; 
       }
       if(root.left==null && root.right==null)
       {
           System.out.println(root.data);
       }
      external_ele(root.left);
      external_ele(root.right);
   }
  */