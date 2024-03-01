class Book{
	private String author_name;
		Book(){}

		Book(String a){
			author_name=a;
		}
			public void Print(){
				System.out.println("Enter Author name:"+author_name);
				
			}
		}
class book_publication extends Book{
	private String title;

		book_publication(String title){

			this.title=title;
		}
				public void Print(){
					System.out.println("Book Publication: "+title);	
				}
			}
class paper_publication extends Book{
	private String publication;

		paper_publication(String publication){

			this.publication=publication;

		}
			public void Print(){
				
				System.out.println("Paper Publication: "+publication);
			}
		}
			
public class BookDemo{
public static void main(String[] args){
		Book b1=new Book("Prem");
		b1.Print();
		b1 = new book_publication("Java");
		b1.Print();
		b1 = new paper_publication("Darshan");
		b1.Print();


	}
}