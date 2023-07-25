package sanjanaab;
import java.util.*;
public class DigitSum {
	public static void add(int num) {
		int sum=0;
		while(num>0||sum>9) {
			if(num==0) {
				num=sum;
				sum=0;
			}
			sum+=num%10;
			num/=10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		add(n);
		
	}

}
