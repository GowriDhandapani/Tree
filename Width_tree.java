package Trees;
import java.util.*;
public class Width_tree {
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
    public static int width(Node r,int t){
        if(r==null){
            return 0;
        }
        int max=0;
        Queue<Node> q=new LinkedList<Node>();
        q.add(r);
        while(!q.isEmpty()){
            int c=q.size();
            max=Math.max(max,c);
            while(c-->0){
                Node temp=q.remove();
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node (3);
        root.left.left=new Node(4);
        System.out.println(width(root,0));
    }
}
