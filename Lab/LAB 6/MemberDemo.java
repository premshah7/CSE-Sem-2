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
	// String specialization;
	// String department;

	 public void printManager(){
	 	Scanner sc = new Scanner(System.in);

		System.out.println("Enter Manager name:");
		this.Name=sc.nextLine();

		System.out.println("Enter Manager Age:");
		this.Age=sc.nextInt();

		System.out.println("Enter Address of Manager:");
		this.Address=sc.nextLine();
		sc.nextLine();

		System.out.println("Enter Manager's Phone number:");
		this.Phone_No=sc.nextInt();

		System.out.println("Manager's Name:"+Name);
		System.out.println("Manager's Age:"+Age);
		System.out.println("Manager's Address:"+Address);//Not priting;
		System.out.println("Manager's Phone Number:"+Phone_No);
	 }
}
class Emplyee extends Member{
	String specialization;
	String department;
}
public class MemberDemo{
	public static void main(String[] args) {
		Manager m = new Manager();
		m.printManager();
	}
}