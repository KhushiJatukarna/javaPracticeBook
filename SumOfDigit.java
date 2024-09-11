import java.util.Scanner;

public class SumOfDigit {
    static void reverseNumber(int n){
        int s=0;
        while(n>0){
            int a=n%10;
            s=s*10+a;
            n=n/10;
        }
        System.out.println(s);
    } 
    static void sumDigit(int n){
        int s=0;
        while(n>0){
            int a=n%10;
            s=s+a;
            n=n/10;
        }
        System.out.println(s);
    }
    public static void main(String arg[]){
        Scanner s1=new Scanner(System.in);
        System.out.println("Take a no.");
        int num=s1.nextInt();
        System.out.println("Sum of digit is: ");
        sumDigit(num);
        System.out.println("Reverse of string is: "); 
        reverseNumber(num);   
        s1.close();
    }
}
