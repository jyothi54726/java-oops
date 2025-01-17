package oops.constructorsAndMethods;

class Calculator{
	int add(int a, int b) {
		return a+b;
	}
	
	static int multiply(int a, int b) {
		return a*b;
	}
}
public class Methods {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		int sum=calc.add(5, 10);
		System.out.println("Sum: "+sum);
		int product=Calculator.multiply(4, 3);
		System.out.println("Product: "+product);
	}
}
