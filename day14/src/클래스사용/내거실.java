package 클래스사용;

import 클래스생성.Aircon;
import 클래스생성.TV;

public class 내거실 {

	public static void main(String[] args) {
		TV myTv = new TV();
		// new를 하면, 멤버변수들이 heap영역에 복사된다.
		// myTv 참조형 변수에는 멤버변수들이 복사된 heap영역의 주소가 들어간다.
		myTv.ch = 7;
		// myTv안에 들어있는 주소가 가르키는 ch변수에 7을 넣으라는 의미
		myTv.vol = 9;
		myTv.onOff = true;
		System.out.println("myTv의 채널은 " + myTv.ch);
		System.out.println("myTv의 볼륨은 " + myTv.vol);
		System.out.println("myTv의 전원은 " + myTv.onOff);
		//myTv.onOff = false;
		System.out.println(myTv);
		System.out.println();
		
		TV yourTv = new TV();
		yourTv.ch = 9;
		yourTv.vol = 12;
		yourTv.onOff = true;
		System.out.println("yourTv의 채널은 " + yourTv.ch);
		System.out.println("yourTv의 볼륨은 " + yourTv.vol);
		System.out.println("yourTv의 전원은 " + yourTv.onOff);
		System.out.println();
		
		Aircon ac = new Aircon();
		ac.temp = 25;
		ac.strength = 3;
		ac.onOff = true;
		ac.purifier = false;
		System.out.println("에어컨의 온도는 " + ac.temp + "도");
		System.out.println("에어컨의 세기는 " + ac.strength);
		System.out.println("에어컨의 전원은 " + ac.onOff);
		System.out.println("에어컨의 공기청정기능은 " + ac.purifier);
		System.out.println();
	
	}

}
