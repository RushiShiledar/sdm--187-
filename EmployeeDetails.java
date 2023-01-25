package p1;
import java.util.Scanner;

//Build a class Employee which contains details about Employee and compile and run and its instance
public class EmployeeDetails {
			private String name;
			private String gender;
			
			private int empid;
			private float salary;
			
			public EmployeeDetails() {
				
			}
			
			public void acceptRecord() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Name :");
				this.name = sc.nextLine();
				System.out.println("Enter gender :");
				this.gender = sc.nextLine();
				System.out.println("Enter Employee id :");
				this.empid = sc.nextInt();
				System.out.println("Enter salary :");
				this.salary = sc.nextFloat();
				
			}
			
			public void displayRecord() {
				System.out.println("Name :"+this.name);
				System.out.println("Gender :"+this.gender);
				System.out.println("Employee id :"+this.empid);
				System.out.println("Salary :"+this.salary);
			}
			
		


	}



