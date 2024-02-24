import java.util.Scanner;
class Student{
	String name;
	String rollNo;

	public Student(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of Student:");
		this.name=sc.nextLine();
		System.out.print("Enter rollNo of Student:");
		this.rollNo=sc.nextLine();
	}

	public void print(){
		System.out.println("Name = "+name+" "+"RollNo = "+rollNo);
	}
}
	
	public class arrayobj{
		public static void main(String[]args){
			Student[] st = new Student[3];

			for(int i=0;i<st.length;i++){
				st[i] = new Student();
			}

			for(int i=0;i<st.length;i++){
				st[i].print();
			}
		}
	}