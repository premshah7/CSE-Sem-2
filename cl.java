class Student{
	String name;
	int age;
	int rollno;

	public void Info(){
		System.out.println("Student name is: "+this.name);
		System.out.println("Student age is: "+this.age);
		System.out.println("Student rollno is: "+this.rollno);
	}


	//Non-Paramatrized Constructor
	//Student(){
	// 	System.out.println("constructor called");
	// }

	//Student(){}


	//Paramatrized Constructor
	Student(String name,int age,int rollno){
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		
	}

	Student(Student s2){
		this.name = s2.name;
		this.age = s2.age;
		this.rollno = s2.rollno;
	}
}

public class cl{
	public static void main(String[]args){
		Student s1 = new Student("Prem",18,419);
		// s1.name="Prem";
		// s1.age=18;
		// s1.rollno=418;
		Student s2 = new Student(s1);

		//s1.Info();
		s2.Info();


	}
}