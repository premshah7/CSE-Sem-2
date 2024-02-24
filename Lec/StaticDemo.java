class Abc{
	static int count=0;
}
public class StaticDemo{
	public static void main(String[] args){
		Abc a1 = new Abc();
		Abc a2 = new Abc();
		a1.count++;
		a2.count++;
		System.out.print(a1.count);
	}
}