//writing final keyword before any method,class,variable it couldn't load or allow to change;
final class Vehicle{
	final int speedLimit;
	// public Vehicle(){
	// 	speedLimit = 50;
	// }
}
	public void PrintSpeed(){
		System.out.println("Limit for vehicle:"+);
	}
	class car extends Vehicle{
		public void printSpeed(){
			System.out.println("");
		}
	}

public class FinalDemo{
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		System.out.println("Old SpeedLimit:"+v1.speedLimit);
	}
}