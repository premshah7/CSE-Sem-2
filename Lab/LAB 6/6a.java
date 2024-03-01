class Book{
	private String author_name;
		public void Print(){
			System.out.println("Hello");
		}
}
class book_publication extends Book{
	private String title;
		public void Print(){
			System.out.println(title);	
		}
}
class paper_publication extends Book{
	private String publication;
		public void Print(){
			System.out.println(publication);
		}
}
		public class 6a{
			public static void main(String[]args){
				Book b1=new Book();
				b1.Print();
			}
		}