class Mutable{
	int a;
	void add(){
		a=a+5;
		System.out.println(a);
	}
}

class Immutable{
	int b;
	int add2(){
		return(b+5);
		
	}
}

		public class xt2{
			public static void main(String[]args){
				// Mutable m1 = new Mutable();
				// m1.a=10;
				// m1.add();

				Immutable m1 = new Immutable();
				m1.b=10;
				int ans=m1.add2();
				m1.add2();
				System.out.println("returned:"+m1.b);
				System.out.println("ans= "+ans);			
			}

		}