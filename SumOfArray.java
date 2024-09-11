import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int arr[]=new int[50];
        System.out.println("Enter size of array: ");
        int size=s1.nextInt();
        System.out.println("Enter elements in array: ");
        for(int i=0;i<size;i++){
		   arr[i]=s1.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of elements in array: "+sum);
        s1.close();
    }
    
}
