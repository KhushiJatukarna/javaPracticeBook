import java.util.*;
public class MergeStrings {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a string1: ");
        String str1 =s1.next();
        System.out.println("Enter a string2: ");
        String str2 =s1.next();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        int len1=str1.length();
        int len2=str2.length();
        String ans="";
        int min=Math.min(len1,len2);
        for(int i=0;i<min;i++){
            ans=ans+str1.charAt(i)+str2.charAt(i);
        }
        if(len1<len2){
            for(int i=len1;i<len2;i++){
                ans=ans+str2.charAt(i);
            }
        }
        else{
            for(int i=len2;i<len1;i++){
                ans=ans+str1.charAt(i);
            }
        }
        System.out.println(ans);
        s1.close();
    }
    
}
