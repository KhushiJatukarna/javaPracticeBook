import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter limit");
        int n=s1.nextInt();
        int f1=0,f2=1;
        if (n==1)
        System.out.println(f1);
        else if (n==2)
        System.out.println(f1+","+f2);
        else
        System.out.print(f1+","+f2+",");
        for(int i=3;i<=n;i++){
            int f3=f1+f2;
            System.out.print(f3+",");
            f1=f2;
            f2=f3;
        }
        s1.close();
    }
    
}
