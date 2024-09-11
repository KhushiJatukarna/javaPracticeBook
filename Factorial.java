/*import java.util.*;
class Factorial{
    public static void main(String args[]){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int num=s1.nextInt();
        int fact=1;
        for(int i=num;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial of given no. is: "+fact);
    }
}*/


//Using recursion-----
public class Factorial {
    public static void main(String[] args) {
        int num =500;
        java.math.BigInteger fact = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + fact);
    }
    public static java.math.BigInteger multiplyNumbers(int num){
        if (num >= 1)
           // return java.math.BigInteger num * multiplyNumbers(num - 1);
            return java.math.BigInteger.valueOf(num).multiply(multiplyNumbers(num - 1));
        else
            return java.math.BigInteger.ONE;
    }
}
