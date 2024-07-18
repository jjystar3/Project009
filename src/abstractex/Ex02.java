package abstractex;

public class Ex02 {

	public static void main(String[] args) {
		
		Animal animal1 = new Dog();
		animal1.sound();
		
		Animal animal2 = new Cat();
		animal2.sound();
		
	}

}

abstract class Animal {
	
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	
	public abstract void sound();
	
}

class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
}

class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}