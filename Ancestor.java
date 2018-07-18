package Trees;
public class Ancestor {
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
    static int c=0;
    public static boolean findAncestor(Node r,int key){
        if(r==null){
            return false;
        }
        if(r.data==key){
            return true;
        }
        if(findAncestor(r.left,key) || findAncestor(r.right,key)){
            c++;
            System.out.print(r.data+" ");
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node (3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        findAncestor(root,7);
        System.out.println("height from root to node "+c);
    }
}
