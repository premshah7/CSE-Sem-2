import java.util.Scanner;
class Student{
	String name="Prem";
	int roll_no;

	Student(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		this.name=sc.nextLine();
		System.out.println("Enter rool number:");
		this.roll_no=sc.nextInt();
	}

	public void Print(){
		System.out.println("Name:"+name+"   "+"Roll No:"+roll_no);
	}
}

		public class p{
			public static void main(String[]args){
				Student[] s = new Student[2];
				for(int i=0;i<s.length;i++){
					s[i]=new Student();
				}
				for(int i=0;i<s.length;i++){
					s[i].Print();
				}
			}
		}