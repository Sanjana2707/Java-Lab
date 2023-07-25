 package sanjanaab;
import java.util.*;
interface Yes{
	interface A{
		int check(int num);
	}
}
public class Happy implements Yes {
	public int check(int num) {
		int sum=0,rem;
		while(num>0) {
			rem=num%10;
			sum+=rem*rem;
			num/=10;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Happy obj=new Happy();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to be checked");
		int number=sc.nextInt();
		int val= number;
		while(val!=1&&val!=4) {
			 val=obj.check(val);
		}
        if(val==1) {
        	System.out.println(number+"is a happy number");
        }
        else
        	System.out.println(number+"is not a happy number");
	}

}
