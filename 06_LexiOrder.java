package sanjanaab;
import java.util.*;
public class Lexico {
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
    		String str[]=new String[5];
    		System.out.println("Enter the Strings:");
    		for(int i=0;i<5;i++) {
    			str[i]=sc.next();
    			
    		}
    		for(int i=0;i<str.length-1;i++) {
    			for(int j=0;j<str.length-1;j++) {
    				if(str[j].compareTo(str[j+1])>0) {
    					String temp= str[j];
    					str[j]=str[j+1];
    					str[j+1]=temp;
    				}
    			}
    		}
    		System.out.println("the lexico order is:");
    		for(int i=0;i<5;i++) {
    			System.out.println(str[i]);
    		}
    		
	}

}
