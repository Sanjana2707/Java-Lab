package sanjanaab;
import java.util.*;
 class Sub{
	public void EvenOdd() {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int e[]=new int[5];
		int o[]=new int[5];
		System.out.println("enter the elements of array");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		if(a[i]%2==0) {
			e[i]=a[i];
		}
		else {
			o[i]=a[i];
		}
			
		}
		for(int i=0;i<e.length;i++) {
			if(e[i]!=0) {// instead 'if', 'while' is given , then the print statement will be infinetly printing since while means -until the condition becomes wrong
				System.out.println("the even elements of array is:"+e[i]);
			}
		}
		for(int i=0;i<o.length;i++) {
			if(o[i]!=0) {
				System.out.println("the odd elements of array is:"+o[i]);
			}
		}
		
		
	}
}
public class Main extends Sub {

	public void transpose(){
		Scanner sc=new Scanner(System.in);
		int x[][]=new int[3][3];
		int y[][]=new int[3][3];
		System.out.println("enter the elements of matix");
		for(int i=0;i<3;i++) {
			System.out.println();
			for(int j=0;j<3;j++) {
				x[i][j]=sc.nextInt();
			}
		}
		System.out.println("Transpose of matix");
		for(int i=0;i<3;i++) {
			System.out.println();
			for(int j=0;j<3;j++) {
				y[i][j]=x[j][i];
				System.out.print(y[i][j]+" ");
			}
			System.out.println();
		}
		super.EvenOdd();

	}
	public static void main(String[] args) {
		Main obj=new Main();
		obj.transpose();
	}

}
