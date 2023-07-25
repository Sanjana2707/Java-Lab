package sanjanaab;
import java.util.*;
public class Password {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rno,rem,sum=0;
		long phno;
		String name;
		String pw=new String();
		System.out.println("enter the name of the customer");
	    name=sc.next();
		System.out.println("enter the room number:");
		rno=sc.nextInt();
		System.out.println("enter the phone number:");
		phno=sc.nextLong();
		
		char[] sym= {'!','@','#','$','%','^','&','*','(',')'};
		int rno1=rno;
		do {
			while(rno!=0) {
				rem=rno%10;
				sum+=rem;
				rno/=10;
			}
			if(sum>=10) {
				rno=sum;
				sum=0;
			}
		}while(rno!=0);
        int c=rno1/100;
        int len=name.length();
       
        		System.out.println("password is:");
        
        pw=""+name.charAt(0)+(phno%10)+sum+sym[c]+name.charAt(len-1)+name.charAt(len-2);
        System.out.println(pw);
        
	}

}
