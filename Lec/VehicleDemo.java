//Q:Fundamental for calling parent and child class
class Vehicle{
	public Vehicle(){
		System.out.println("default Vehicle");
	}

	Vehicle(int a){
		System.out.println("Para Vehicle");
	}
}
//when paramatetrized constructor of child is called parent's default constructor is called other than parameterized;
//whenever child is called parent is automaticaly called;
class Car extends Vehicle{
	public Car(){
		System.out.println("default Car");
	}

	Car(int a){
		this.wsuper(a);
		System.out.println("Para Car");
	}
}
		public class VehicleDemo{
			public static void main(String[]args){
				// Vehicle v=new Vehicle();
				// v.Vehicle();
				Car c = new Car(1);
			}
		}