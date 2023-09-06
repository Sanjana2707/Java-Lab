import java.util.*;
public class Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []empid= {1001,1002,1003,1004,1005,1006,1007};
		String []empname= {"Abc","Opqr","Ghi","Wxyz","Jklmn","Stuv","Def"};
		String []date= {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006"};
		char []desigcode= {'e','c','k','r','m','e','c'};
		String[]dept= {"R&D","PM","Acct","front desk","engg","manufacturing","PM"};
		double[]basic= {20000,30000,10000,12000,50000,23000,29000};
		double[]HRA= {8000,12000,8000,6000,20000,9000,12000};
		double[]IT= {3000,9000,1000,2000,20000,4400,10000};
		char[]designationcode= {'e','c','k','r','m'};
		String []designation= {"Engineer","Consultant","Clerk","Receptionist","Manager"};
		double[]DA= {20000,32000,12000,15000,40000};
		System.out.println("enter the employee id");
		int id=Integer.parseInt(args[0]);
		int flag=0;
		double salary=0;
		for(int i=0;i<empid.length;i++) {
			if(id==empid[i]) {
				flag=1;
				System.out.println("Employee id"+empid[i]);
				System.out.println("Employee name"+empname[i]);
				System.out.println("Department"+dept[i]);
				switch(desigcode[i]) {
				case 'c':
					System.out.println("Designation: Consultant");
					System.out.println("DA:32000");
					salary=basic[i]+HRA[i]+32000-IT[i];
					System.out.println("salary:"+salary);
					break;
				case 'k':
					System.out.println("Designation: Clerk");
					System.out.println("DA:12000");
					salary=basic[i]+HRA[i]+12000-IT[i];
					System.out.println("salary:"+salary);
					break;
				case 'e':
					System.out.println("Designation: Engineer");
					System.out.println("DA:20000");
					salary=basic[i]+HRA[i]+20000-IT[i];
					System.out.println("salary:"+salary);
					break;
				case 'r':
					System.out.println("Designation: Receptionist");
					System.out.println("DA:15000");
					salary=basic[i]+HRA[i]+15000-IT[i];
					System.out.println("salary:"+salary);
					break;
				case 'm':
					System.out.println("Designation: Manager");
					System.out.println("DA:40000");
					salary=basic[i]+HRA[i]+40000-IT[i];
					System.out.println("salary:"+salary);
					break;
				}
			}
		}
		if(flag==0) {
			System.out.println("employee id is not found");
		}

	}

}
