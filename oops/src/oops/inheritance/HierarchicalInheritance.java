package oops.inheritance;

class Cat extends Animals{
	void meow() {
		System.out.println("Cat meows");
	}
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		Dogs myDog=new Dogs();
		myDog.sound();
		myDog.bark();
		Cat myCat=new Cat();
		myCat.sound();
		myCat.meow();
	}
}
