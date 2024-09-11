import java.util.*;
public class String1 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s =s1.next();
        s=s.toLowerCase();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);   
        }
        System.out.println("Reverse of givin string is: "+rev);
        if(rev.equals(s))
        System.out.println("String is pallindrome");
        else
        System.out.println("String is not pallindrome");
        s1.close();
    }  
}