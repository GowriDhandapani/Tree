package Trees;
import java.util.*;
public class Max_Min_element {
    static Node root=null;
    static int c=0,arr[]=new int[2];
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
    public static int[] min_max(Node root,int min,int max){
        if(root==null){
            return arr;
        }
        else{
            if(root.data<=min){
                min=root.data;
                arr[0]=min;
            }
            if( root.data >= max){
                max=root.data;
                arr[1]=max;
            }
            min_max(root.left,min,max);
            min_max(root.right,min,max);
        }
        return arr;
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
        arr=min_max(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
