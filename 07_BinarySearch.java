package sanjanaab;
import java.util.*;
public class Binary_search {
     int search(int a[],int x) {
    	int begin=0;
    	int end=a.length-1;
    	int mid;
    	while(begin<=end) {
    		mid=(begin+end)/2;
    		if(a[mid]==x) {
        	    return mid;	
        	}
    		else if(a[mid]<x) {
    			begin=mid+1;
    		}
    		else
    			end=mid-1;
    		}
    	return -1;
    }
    /* public static void main(String[] args) {
    	 Binary_search obj=new Binary_search();
    	 int a[]= {3,4,5,7,8};
    	 int x=4;
    	 int res=obj.search(a,x);
    	 if(res==-1) {
    		 System.out.println("element not found");
    	 }
    	 else
    		 System.out.println("element found at index"+res);
    	 
     }
} */
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter the size of the array");
    	 int r=sc.nextInt();
    	 int a[]=new int[r];
    	 System.out.println("enter th eelements of the array");
    	 for(int i=0;i<a.length;i++) {
    		 a[i]=sc.nextInt();
    	 }
    	 System.out.println("enter the element to be searched");
    	 int x=sc.nextInt();
    	 Binary_search obj=new Binary_search();
    	 int res=obj.search(a,x);
    	 if(res==-1) {
    		 System.out.println("element not found");
    	 }
    	 else
    		 System.out.println("element found at index"+res);
    	 
    	 
    	 
     }
}


