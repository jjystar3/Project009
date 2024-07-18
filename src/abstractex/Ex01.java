package abstractex;

public class Ex01 {

	public static void main(String[] args) {
		
		// 추상클래스는 인스턴스를 생성할 수 없음
		// 추상클래스의 목적은 상속이기 때문
//		Computer computer = new Computer();
		
		DeskTop deskTop = new DeskTop();
		NoteBook noteBook = new NoteBook();
		
		deskTop.turnOn();
		deskTop.turnOff();
		deskTop.display();
		deskTop.typing();

		noteBook.turnOn();
		noteBook.turnOff();
		noteBook.display();
		noteBook.typing();
		
		
		
	}

}

abstract class Computer {
	// 자식들이 공통으로 사용하는 기능은 일반메소드로 선언
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 자식들마다 다르게 사용하는 기능은 추상메소드로 선언
	public abstract void display();
	
	public abstract void typing();
}

class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("DestTop Display()");
	}

	@Override
	public void typing() {
		System.out.println("DestTop Typing()");
	}

}

class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("NoteBook Display()");
	}

	@Override
	public void typing() {
		System.out.println("NoteBook Typing()");
	}
	
}