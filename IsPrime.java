import java.util.Scanner;
import java.lang.Math;
public class IsPrime {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a no.");
        int num=s1.nextInt();
        int f=0;
        if(num<2)
            f=1;
        else
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0)
                f=1;
                else
                f=0;
            }
            if(f==0)
            System.out.println("Is a prime no.");
            else
            System.out.println("Not a prime no.");
            s1.close();
    }    
}