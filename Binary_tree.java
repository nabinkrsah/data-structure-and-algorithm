// code to build a binary tree and then coout the number of node and the sum of the elements present in the tree 
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class Binary_tree{
    static int index=-1;
    public static Node buildtree(int[] node)
    {
         index++;
        if(node[index]==-1){
           
            return null;
        } 
        Node newnode=new Node(node[index]);
        newnode.left=buildtree(node);
        newnode.right=buildtree(node);
        return newnode;
    }
    
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        
        
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static int countnodes(Node root){
        if(root==null){
            return 0;
        }
        int leftcount=countnodes(root.left);
        int rightcount=countnodes(root.right);
        return leftcount+rightcount+1;
    } 
    public static int sumnodes(Node root){
        if(root == null){
            return 0;
        }
        int leftsum=sumnodes(root.left);
        int rigthsum=sumnodes(root.right);
        return leftsum+rigthsum+root.data;
    }
    
    public static void main(String[] args){
        // int node[] ={};
        Binary_tree tree=new Binary_tree();
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Node ans = tree.buildtree(nodes);
        preorder(ans);
        System.out.println("\n");
        inorder(ans);
        System.out.println("\n");
        System.out.println(countnodes(ans));
        System.out.println(sumnodes(ans));

        // System.out.println(root.data);
        
        
    }
}