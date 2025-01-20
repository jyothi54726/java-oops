package oops.inheritance;

class Animals{
	void sound() {
		System.out.println("Animal make sounds");
	}
}

class Mammal extends Animals{
	void walk() {
		System.out.println("Mammals walk on land");
	}
}

class Dogs extends Mammal{
	void bark() {
		System.out.println("Dog barks");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Dogs myDog=new Dogs();
		myDog.sound();
		myDog.walk();
		myDog.bark();
	}
}
