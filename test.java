import java.util.Scanner;
class test{   
    static void calSearch(int n,int x[],int ele){
		int beg=0,end=n-1,f=-1;
        while(beg<=end){
            int mid=(beg+end)/2;
            if(x[mid]==ele){
                f=mid;
                break;
            }
            else if(ele<x[mid]){
                end=mid-1;
            }
            else{
                beg=mid+1;
            }   
            }
        if (f!=-1)
        System.out.println("Element found at index: "+f);
        else
        System.out.println("Element not found");
        }
	public static void main(String arr[]){
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the size");
		int n =s1.nextInt();
        int x[]=new int[n];
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
