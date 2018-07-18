package Trees;
public class LCA {
    static Node root=null;
     public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static Node ancestor(Node root,int n1,int n2){
        if(root==null) return root;
        if(root.data==n1 || root.data==n2) return root;
        Node l=ancestor(root.left,n1,n2);
        Node r=ancestor(root.right,n1,n2);
        if(l!=null && r!=null) return root;
        if(l==null && r==null) return null;
        return l!=null?l:r;
    }
    public static void main(String[] args) {
        root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(3);
        root.left.left.left=new Node(4);
        root.left.right=new Node(6);
        root.right=new Node(8);
        System.out.println(ancestor(root,3,6).data);
    }
}
