package Trees;
import java.util.*;
public class Levelorder_Queue {
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
    public static void levelOrder(Queue<Node> q,Node r){
        q.add(r);
       while(!q.isEmpty()){
          Node n= q.poll();
          System.out.print(n.data+"  ");
          if(n.left!=null){
              q.add(n.left);
          }
          if(n.right!=null){
              q.add(n.right);
          }
       }
    }
    public static void main(String[] args) {
        Queue <Node>q=new LinkedList<Node>();
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node (3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        levelOrder(q,root);
    }
}
