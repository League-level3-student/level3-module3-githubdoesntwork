package _01_AnimalFarm;

public class Farm {
public static void main(String[] args) {
	Cow cow = new Cow();
	Chicken chicken = new Chicken();
	Pig pig = new Pig();
	Rabbit rabbit = new Rabbit();
	Animal[] farm=new Animal[6];
	farm[0] = cow;
	farm[1] = cow;
	farm[2] = chicken;
	farm[3] = chicken;
	farm[4] = pig;
	farm[5] = rabbit;
	for (int i = 0; i < farm.length; i++) {
		farm[i].makeNoise();
		farm[i].foodProduct();
	}
}
}
