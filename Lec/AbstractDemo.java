//to abstract any method in class the class must be abstract;
abstract class Vehicle{
	public abstract void stop();
	public abstract void start();
	
}

class Audi extends Vehicle{	
	public void start(){
		System.out.println("Audi will start");
	}
	public void stop(){
		System.out.println("Stop");	
	}
}
public class AbstractDemo{
	public static void main(String[]args){
		Audi v = new Audi();
		//v.start();
	}
}