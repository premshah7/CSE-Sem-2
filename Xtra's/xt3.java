class Student{
	int id_no;
	int no_of_subjects;
	int subject_code;
	int subject_credit;
	String grade_obtained;

		Student(){
			System.out.println("Enter ID no: "+id_no);
			this.id_no=id_no;
			System.out.println("Enter No. of Subjects: "+no_of_subjects);
			this.no_of_subjects=no_of_subjects;
			System.out.println("Enter subject code: "+subject_code);
			this.subject_code=subject_code;
			System.out.println("Enter subject credit: "+subject_credit);
			this.subject_credit=subject_credit;
		}
}