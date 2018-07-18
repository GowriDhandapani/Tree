package Trees;
import java.util.*;
public class BinaryExpressionTree {
    Node t=null;
    Node t1=null;
    Node t2=null;
    class Node{
        char data;
        Node left,right;
        Node(char data){
            this.data=data;
            left=right=null;
        }
    }
    Node constructTree(char ch[]){
        Stack<Node> s=new Stack<Node>();
        for(int i=0;i<ch.length;i++){
            if(Character.isLetter(ch[i])){
                t=new Node(ch[i]);
                s.push(t);
            }
            else{
                t=new Node(ch[i]);
                t1=s.pop();
                t2=s.pop();
                t.right=t1;
                t.left=t2;
                s.push(t);
            }
        }
            t=s.peek();
        return t;
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        BinaryExpressionTree e=new BinaryExpressionTree();
        String postfix="ab+ef*g*-";
        char[] charArray=postfix.toCharArray();
        Node root=e.constructTree(charArray);
        System.out.println("Infix Expression is ");
        e.inorder(root);
    }
}
