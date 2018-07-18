package Trees;
import java.util.*;
public class Binay_Tree_Array {
    static int arr[]=new int[5];
    public static int[] insert(){
        int k=2;
        arr[0]=1;
        for(int i=0;i<4;i++){
            if(2*i+1<4){
                arr[2*i+1]=k;
            }
            k=k+2;
            if(2*i+2<4){
                arr[2*i+2]=k;
            }
            k=k+2;
        }
        return arr;
    }
    public static void display(int arr[]){
        System.out.println(arr[0]);
        for(int i=0;i<4;i++){
            if(2*i+1<4)
                System.out.println(arr[2*i+1]);
            if(2*i+2<4)
                System.out.println(arr[2*i+2]);
        }
    }
    public static void main(String[] args) {
        arr=insert();
        display(arr);
    }
}
