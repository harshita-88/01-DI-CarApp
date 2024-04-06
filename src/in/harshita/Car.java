package in.harshita;

public class Car {
	private IEngine eng;
	
	public Car(IEngine eng) {
		this.eng = eng;
	}
	
	public void drive() {
		int status = eng.start();
		if(status>=1) {
			System.out.println("Car is starting");
		}
		else {
			System.out.println("Error in starting");
		}
			
	}

}
