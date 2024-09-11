import java.util.Scanner;

public class IsPrimeArray {

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int a[]=new int[50];
        System.out.println("Enter size of array: ");
        int size=s1.nextInt();
        System.out.println("Enter elements in array: ");
        for(int i=0;i<size;i++){
		   a[i]=s1.nextInt();
        }
        System.out.println("prime numbers in given array are: ");
        for(int i=0;i<size;i++){
            Boolean flag=true;
            if(a[i]>=2){
                for(int j=2;j<=Math.sqrt(a[i]);j++){
                    if(a[i]%j==0){
                        flag=false;
                        break;
                    }
                }
                if(flag==true)
                    System.out.print(a[i]+", ");
            }
        }
        s1.close();  
    }
}
