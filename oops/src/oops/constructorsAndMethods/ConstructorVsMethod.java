package oops.constructorsAndMethods;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	void introduce() {
		System.out.println("Hi, I'm "+name+" and I'm "+age+" years old.");
	}
}
public class ConstructorVsMethod {
	public static void main(String[] args) {
		Person p= new Person("Siri",24);
		p.introduce();
	}
}
