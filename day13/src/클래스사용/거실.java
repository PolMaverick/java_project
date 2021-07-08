// Phone.java
// 1) 성질 2개 이상
// 2) 동장 2개 이상 정의
//
// Dog.java
// 1) 성질 2개 이상
// 2) 동작 2개 이상 정의
//
// 거실.java(main)
// phone1, dog1을 만들어서
// 성질에 값을 넣고,
// 동작을 써보세요.

package 클래스사용;

import 클래스생성.Dog;
import 클래스생성.Phone;

public class 거실 {

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		phone1.call();
		phone1.music();
		phone1.type = "스마트폰";
		phone1.inch = 5;
		System.out.println(phone1.type);
		System.out.println(phone1.inch);
		System.out.println();
		
		Dog dog1 = new Dog();
		dog1.sleep();
		dog1.bark();
		dog1.age = 8;
		dog1.type = "푸들";
		System.out.println(dog1.age);
		System.out.println(dog1.type);
	}

}
