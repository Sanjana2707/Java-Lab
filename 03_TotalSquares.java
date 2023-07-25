package sanjanaab;
import java.util.*;
public class TotalSquares {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the matrix number");
		int num=sc.nextInt();
		if(num<=0) {
			System.out.println("invalid");
		}
		else {
			int sum=0;
		while(num!=0) {
			
			sum+=num*num;
			num--;
		}
		System.out.println("Total number of possible sqaures in  matrix :"+sum);
		}

	}

}
