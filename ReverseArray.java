import java.util.*;
public class ReverseArray {
    static void reverse(int n,int ar[]){
        int f=0,l=n-1;
        while(f<l){
            int temp=ar[f];
            ar[f]=ar[l];
            ar[l]=temp;
            f++;
            l--;
        }
       
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int a[]=new int[50];
        System.out.println("Enter size of array: ");
        int size=s1.nextInt();
        System.out.println("Enter elements in array: ");
        for(int i=0;i<size;i++){
		   a[i]=s1.nextInt();
        }
        System.out.println("Reverse of givin array is: ");
        reverse(size,a);
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
          }
          s1.close();
    } 
}
