package com.callor.shop;
/*
 * 아무것도(변수, method 등등)이 없는 비어있는 클래스는
 * java 클래스들의 시조 조상인 Object를 자동으로
 * extends 한다
 */
public class Class_01 extends Object{

	/*
	 * 원천적으로 모든 클래스는 
	 * Object 클래스에 만들어져(정의되어있는)
	 * 		toString() method를 가지고 있다.
	 * toString() method는 
	 * 		Object 클래스로 부터 상속받은 것이다
	 * 
	 * java에서는 상속받은 method를
	 * 		필요에따라 마음대로 요리해서 변형할수 있다
	 * 		이러한 것을 "메서드의 재 정의" 라고 한다
	 * 
	 * @... : Annotation(주석)
	 * 
	 * @Override : Override Annotation
	 * 		이 method는 부모 클래스에서 상속받았지만
	 * 		여기에서 재 정의 하겠다 라는 의미
	 */
	@Override
	public String toString() {
		return "나는 Object를 상속받은 Class_01 입니다";
	}
	
}


