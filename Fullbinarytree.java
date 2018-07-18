package Trees;
import java.util.*;
public class Fullbinarytree {
    static int c=0;
    static Node root=null;
    public static class Node {
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static Node insert(Node root,int r,int n,char ch){
        if(root==null){
            return root;
        }
        if(root.data==r){
            if(ch=='r'){
                root.right=new Node(n);
                return root;
            }
            if(ch=='l'){
                root.left=new Node(n);
                return root;
            }
        }
        else
        {
            insert(root.left,r,n,ch);
            insert(root.right,r,n,ch);
        }
        return root;
    }
    public static boolean checkFullBinaryTree(Node r){
      if(r==null || r.left==null && r.right==null){
          return true;
      }
      if(r.left==null && r.right!=null || r.left!=null && r.right==null){
          return false;
      }
      else{
          if(checkFullBinaryTree(r.left) && checkFullBinaryTree(r.right)){
              return true;
          }
          else{
              return false;
        }
      }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int r=in.nextInt();
            if(c==0){
                root=new Node(r);
                c=1;
            }
            int n=in.nextInt();
            char ch=in.next().charAt(0);
            root=insert(root,r,n,ch);
        }
        System.out.println(checkFullBinaryTree(root));
    }
}
