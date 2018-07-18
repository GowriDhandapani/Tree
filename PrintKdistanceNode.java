package Trees;
import java.util.*;
public class PrintKdistanceNode {
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
    public static void printNodes(Node r,int k,int n){
        if(r==null){
            return ;
        }
        if(n==k){
            System.out.println(r.data);
            //--n;
        }
        else{
            printNodes(r.left,k,++n);
            --n;
            printNodes(r.right,k,++n);
        }
    }
    public static void main(String[] args) {
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node (3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
       
        printNodes(root,1,1);
    }
}
