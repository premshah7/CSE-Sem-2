class Vehicle{
	Vehicle(){
		System.out.println("This is Vehicle");
	}
}
class Car extends Vehicle{
	Car(){
		System.out.println("This is Car");
	}
}
class RollsRoyace extends Vehicle{
	RollsRoyace(){
		super();
		System.out.println("This is Rolls Royace");
	}
}
public class SuperDemo{
	public static void main(String[] args) {
		RollsRoyace r = new RollsRoyace();

	}
}