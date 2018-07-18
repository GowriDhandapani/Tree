package Trees;
import java.util.*;
public class Leafnode {
    static int c=0,count=0;
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
    public static int check_Leaf(Node r){
        if(r==null){
            return count;
        }
        else{
            if(r.left==null && r.right==null){
                count++;
            }
            check_Leaf(r.left);
            return check_Leaf(r.right);
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
        System.out.println(check_Leaf(root));
    }
}
