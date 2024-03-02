import java.util.Scanner;
class Member{
	String name;
	int age;
	String phone_No;
	double salary;
	String address;
		Member(String name, int age, String phone_No,double salary,String address){
			this.name=name;
			this.age=age;
			this.phone_No=phone_No;
			this.salary=salary;
			this.address=address;
		}

		public void printDetails(){
			System.out.println("Name:"+this.name);
			System.out.println("Age:"+this.age);
			System.out.println("Address:"+this.address);//Not priting;
			System.out.println("Phone Number:"+this.phone_No);		
		}


	public void printSalary(){
		System.out.println("Salary is :"+this.salary);
	}
}
class Manager extends Member{
	String specialization;
		Manager(String name, int age, String phone_No,double salary,String address,String specialization){
			super(name,age,phone_No,salary,address);
			this.specialization=specialization;	
			
		}
		public void printDetails(){
			System.out.println("----------Manager Details----------");
			super.printDetails();
			super.printSalary();
			System.out.println("specialization is:"+this.specialization);
			System.out.println("----------Employee Details----------");
		}

}
class Employee extends Member{
	String deparment;
		Employee(String name, int age, String phone_No,double salary,String address,String deparment){
			super(name,age,phone_No,salary,address);
			this.deparment=deparment;
		}

		public void printDetails(){
			super.printDetails();
			super.printSalary();
			System.out.println("Department is:"+this.deparment);
		}

}
public class MemberDemo{
	public static void main(String[] args) {
		Member m = new Manager("Prem",18,"987654321",25000,"Darshan","cse");
		m.printDetails();
		
		m=new Employee("neel",20,"123456789",6000,"Marwadi","Computer");
		m.printDetails();
	}
}