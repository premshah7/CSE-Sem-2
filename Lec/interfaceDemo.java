interface MovieObject{
	public void start();
	public void stop();
	public void speedUp();
	public void speedDown();

}
interface LuxuryPlace{
	public void sofa();
}
class Vehicle implements MovieObject, LuxuryPlace{
	public void stop(){
		System.out.println("Stop");
	}
	public void start(){
		System.out.println("start");
	}
	public void sofa(){
		
	}
}