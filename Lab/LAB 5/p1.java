class Circle{
	double r;
		double area(){
			return Math.PI*this.r*this.r;
	}
}

	public class p1{
		public static void main(String[]args){
			Circle c1=new Circle();
			c1.r=20.0;
			System.out.println(c1.area());
		}
	}