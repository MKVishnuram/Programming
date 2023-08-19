class Binarytree
{
    Node root;
    class Node{
        int data;
        Node left,right;
        Node(int d)
        {
            data =d;
            left = null;
            right = null;
        }
    }
    Binarytree(int d)
    {
        root =new Node(d);
    }
    public void Insert_left(Node r,int d)
    {
        Node obj = new Node(d);
        r.left = obj;
    }
    
    
     public void Insert_right(Node r,int d)
    {
        Node obj = new Node(d);
        r.right = obj;
    }
    
    public static void Preorder(Node root)
    {
        
        if(root!=null)
        {
           
            System.out.print(root.data+" ");
            Preorder(root.left);
            Preorder(root.right);
        }
    }
    
     public static void Inorder(Node root)
    {
        if(root!=null)
        {
            
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }
    
     public static void Postorder(Node root)
    {
        if(root!=null)
        {
            
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+ " ");
        }
    }
    
    
}

class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Binarytree tree  = new Binarytree(10);
        tree.Insert_left(tree.root,5);
        tree.Insert_right(tree.root,15);
        tree.Insert_left(tree.root.left,3);
        tree.Insert_right(tree.root.left,8);
        tree.Insert_left(tree.root.right,12);

        System.out.println("Preorder is");
        Binarytree.Preorder(tree.root);
        System.out.println("");
         System.out.println("Inorder is");
        Binarytree.Inorder(tree.root);

        System.out.println("");
         System.out.println("Postorder is");
        Binarytree.Postorder(tree.root);


    }
}

