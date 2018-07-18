////////////package Trees;
import java.util.*;
public class Height_tree {
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
    public static int height(Node r){
        if(r==null)
            return 0;
        int lh=height(r.left);
        int rh=height(r.right);
        if(lh>rh){
            return lh+1;
        }
        else{
            return rh+1;
        }
    }
    public static void main(String[] args) {
        root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(3);
        root.left.left.left=new Node(4);
        root.left.right=new Node(6);
        root.right=new Node(8);
        System.out.println(height(root));
    }
}
