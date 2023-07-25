package sanjanaab;
import java.util.*;
public class Calci {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int op1,op2,res=0;
		char operator;
		System.out.println("Enter operand 1");
		op1=sc.nextInt();
		System.out.println("Enter operand 2");
		op2=sc.nextInt();// TODO Auto-generated method stub
		System.out.println("Enter the operator");
		operator=sc.next().charAt(0);
		switch(operator) {
		case '+':
			res=op1+op2;
			System.out.println("The result is:"+res);
			break;
		case '-':
			res=op1-op2;
			System.out.println("The result is:"+res);
			break;
		case '*':
			res=op1*op2;
			System.out.println("The result is:"+res);
			break;
		case '/':
			res=op1/op2;
			System.out.println("The result is:"+res);
			break;
		default:
			System.out.println("Invalid operator");
			break;
		}
	
	}

}
