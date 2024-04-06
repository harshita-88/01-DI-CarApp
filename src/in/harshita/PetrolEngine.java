package in.harshita;

public class PetrolEngine implements IEngine {

	@Override
	public int start() {
		//logic to start
		System.out.println("Petrol Engine is Starting");
		return 1;
	}

}
