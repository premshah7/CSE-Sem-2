import java.util.Scanner;
class Member{
	String Name;
	int Age;
	int Phone_No;
	double Salary;
	String Address;

	public void printSalary(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary");
		Salary = sc.nextDouble();
		System.out.println("Salary is :"+Salary);
	}
}
class Manager extends Member{
	Manager(){	
	}
	String specialization;
	String department;

	 public void ManagerDetails(){
	 	Scanner sc = new Scanner(System.in);

		System.out.println("Enter Manager name:");
		this.Name=sc.nextLine();

		System.out.println("Enter Manager Age:");
		this.Age=sc.nextInt();

		System.out.println("Enter Address of Manager:");
		this.Address=sc.next();
		sc.nextLine();

		System.out.println("Enter Manager's Phone number:");
		this.Phone_No=sc.nextInt();

		System.out.println("Enter Manager's specialization:");
		this.specialization = sc.next();

		System.out.println("Enter Manager's department:");
		this.department = sc.next();

		System.out.println("================================================");
	 }

	 public void printManager(){
	 	System.out.println("Manager's Name:"+Name);
		System.out.println("Manager's Age:"+Age);
		System.out.println("Manager's Address:"+Address);//Not priting;
		System.out.println("Manager's Phone Number:"+Phone_No);
		System.out.println("Manager's Specialization:"+specialization);
		System.out.println("Manager's Department:"+department);
	 }
}
class Employee extends Member{
	String specialization;
	String department;
	public void printEmployee(){

	Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee name:");
		this.Name=sc.nextLine();

		System.out.println("Enter Employee Age:");
		this.Age=sc.nextInt();

		System.out.println("Enter Address of Employee:");
		this.Address=sc.next();
		sc.nextLine();

		System.out.println("Enter Employee's Phone number:");
		this.Phone_No=sc.nextInt();

		System.out.println("Enter Employee's specialization:");
		this.specialization = sc.next();

		System.out.println("Enter Employee's department:");
		this.department = sc.next();

		System.out.println("================================================");

		System.out.println("Employee's Name:"+Name);
		System.out.println("Employee's Age:"+Age);
		System.out.println("Employee's Address:"+Address);//Not priting;
		System.out.println("Employee's Phone Number:"+Phone_No);
		System.out.println("Employee's Specialization:"+specialization);
		System.out.println("Employee's Department:"+department);
		System.out.println("========================");
	 
	}

}

public class MemberDemo{
	public static void main(String[] args) {
		Manager m = new Manager();
		m.ManagerDetails();
		Employee m1 = new Employee();
		m1.printEmployee();
		m.printManager();

	}
}