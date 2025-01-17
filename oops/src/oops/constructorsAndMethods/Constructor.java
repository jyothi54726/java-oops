package oops.constructorsAndMethods;

class Car{
	String brand;
	int speed;
	
	Car(){
		brand="Unknown";
		speed=0;
	}
	
	Car(String brand, int speed){
		this.brand=brand;
		this.speed=speed;
	}
	
	Car(Car car1){
		this.brand=car1.brand;
		this.speed=car1.speed;
	}
	
	void display() {
		System.out.println("Car Brand: "+brand+", speed: "+speed+"km/h");
	}
}
public class Constructor {

	public static void main(String[] args) {
		Car car1=new Car();
		Car car2=new Car("Toyota", 120);
		Car car3=new Car(car1);
		car1.display();
		car2.display();
		car3.display();
	}
}
