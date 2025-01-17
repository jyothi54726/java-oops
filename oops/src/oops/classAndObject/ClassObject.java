package oops.classAndObject;

class Car{
	String brand;
	int speed;
	
	Car(String brand, int speed){
		this.brand=brand;
		this.speed=speed;
	}
	void displayInfo() {
		System.out.println("Car Brand: "+ brand);
		System.out.println("Car Speed: "+ speed+"km/h");
	}
}

public class ClassObject {

	public static void main(String[] args) {
		Car car1=new Car("Toyota", 120);
		Car car2=new Car("Honda", 140);
		
		car1.displayInfo();
		car2.displayInfo();
	}
	
}
