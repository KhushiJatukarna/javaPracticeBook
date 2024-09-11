import java.util.Scanner;
class LinearSearch{   
    static void calSearch(int n,int x[],int num){
		int f=-1,i;
		for(i=0;i<n;i++){
			if(x[i]==num){
				f=i;
				break;
			}
	    } 
		if (f==-1)
		    System.out.println("not found");
		else	
			System.out.println("found at index "+f);
	}
	public static void main(String arr[]){
		int x[]=new int[50];
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the size");
		int n =s1.nextInt();
		System.out.println("enter the array");
		for(int i=0;i<n;i++){
			x[i]=s1.nextInt();
        }
		System.out.println("enter the element to be searched");
		int num=s1.nextInt();
		calSearch(n,x,num);
		s1.close();
	}
}
