import java.util.*;
public class IsPalindromeString {
    static void palindrome(String s){
        int len=s.length() , mid=len/2 , f=0;
        for(int i=0;i<mid;i++){
            if(s.charAt(i)!=s.charAt(len-1-i)){
                f=1;
                break;
            }
        }
        if(f==0)
        System.out.println("String is Palindrome"); 
        else
        System.out.println("String is not Palindrome");      
    }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str =s1.next();
        str=str.toLowerCase();
        palindrome(str);
        s1.close();
    }  
}
