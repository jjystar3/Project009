package finalex;

class Parents {
	
	// final 메소드는 재정의 할 수 없음
	final void method1() {
		
	}
	
	void method2() {
		
	}
	
}

class Child extends Parents{

	@Override
	void method2() {
		// TODO Auto-generated method stub
		super.method2();
	}
	
	
	
}