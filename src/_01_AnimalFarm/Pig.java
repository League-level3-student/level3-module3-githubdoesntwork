package _01_AnimalFarm;

public class Pig extends Animal{

	@Override
	public void makeNoise() {
		System.out.println("Oink");
	}

	@Override
	public void foodProduct() {
		System.out.println("I will inevitably become bacon");
	}
}
