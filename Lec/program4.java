import java.util.Scanner;
class Student{
	// interface program4 extends Parent {
		
	
	int id_no;
	int no_of_subject;
	int[] subject_code;
	int[] credit;
	int grade;
	double spi;

	Student(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id:");
		id_no=sc.nextInt();
		System.out.println("No.of subject:");
		no_of_subject=sc.nextInt();
	}

	public void calculate_spi(){
		//logic to calc spi
		spi=0.0;

	}
}

public class program4{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("No of Student:");
		int n=sc.nextInt();
		Student[] st = new Student[n];

		// for(int i=0;i<n;i++){
		// 	// st[i].subject_code;
		// }

		// for(int i=0;i<n;i++){

		// }

		// 	for(int i=0;i<n;i++){
			
		// }

		System.out.println("hello");
	}
}
