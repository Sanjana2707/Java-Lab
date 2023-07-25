package sanjanaab;
import java.util.*;
public class Matsum {
	
     public static void main(String[] args) {
    	 Scanner sc= new Scanner(System.in);
    	 int a[][]=new int[2][2];
    	 int b[][]=new int[2][2];
    	 System.out.println("enter elements of matrix a");
    	 for(int i=0;i<2;i++) {
    		 System.out.println();
    		 for(int j=0;j<2;j++) {
    			 a[i][j]=sc.nextInt();
    		 }
    	 }
    	 System.out.println("enter elements of matrix b");
    	 for(int i=0;i<2;i++) {
    		 System.out.println();
    		 for(int j=0;j<2;j++) {
    			 b[i][j]=sc.nextInt();
    		 }
    	 }
    	 Matsum obj=new Matsum();
    	 obj.Multi(a,b);
    	 
		

	}
     public void Multi(int a[][],int b[][]){
 		int c[][]=new int[2][2];
 		 for(int i=0;i<2;i++) {
     		 System.out.println();
     		 for(int j=0;j<2;j++) {
     			 c[i][j]=a[i][j]+b[i][j];
     		 }
 		 }
 		for(int i=0;i<2;i++) {
    		 System.out.println();
    		 for(int j=0;j<2;j++) {
     		 System.out.println("sum of 2 matrix is "+c[i][j]);
        		 }
     	 }

}
}

