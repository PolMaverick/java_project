package 스레드;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic1 extends JFrame { // JFrame 상속
	
	// static이라 붙으면 객체 생성하지 않아도 CPU가 바로 호출해서 사용할 수 있음.
	// 멤버변수가 있으면 static메서드에서 바로 사용 불가능
	// 전역변수에도 static을 붙여주면 객체생성하지 않아도 static메서드 안에서 접근 가능
	// RAM에 상주하고 있음. 언제든지 CPU가 접근해서 사용 가능
	// static을 많이 사용하면 안된다. 메모리에 과부화 유발
	// public void name() {}를 더 많이 사용
	JLabel count, image, timer; //전역 변수로 선언
	public ThreadGraphic1() {
		setSize(1300, 650);
		setTitle("나의 스레드 프로그램");
		count = new JLabel(""); // 전역변수로 선언해줬기 때문에 변수 지워준다.
		image = new JLabel(""); // 전역변수로 선언해줬기 때문에 변수 지워준다.
		timer = new JLabel(""); // 전역변수로 선언해줬기 때문에 변수 지워준다.
		add(count, BorderLayout.WEST);
		add(image);
		add(timer, BorderLayout.SOUTH);
		Font font = new Font("궁서", Font.BOLD, 40);
		Font font2 = new Font("궁서", Font.BOLD, 30);
		count.setFont(font);
		timer.setFont(font2);
		
		// 라벨에 넣어주기 위해 Image1.java에서 가지고 온 코드. 저 안에 1이 이미 있어 사용불가하니 2로 객체 이름 바꿔주기
		// 1. thread 객체 생성
		Count2 thread1 = new Count2();
		Image2 thread2 = new Image2();
		Timer2 thread3 = new Timer2();
		// 2. 꼭 cpu에 스레드를 등록해주어야 한다.
		thread1.start();
		thread2.start();
		thread3.start();
		setVisible(true);
	}
	// 클래스간 변수를 공유할 목적으로 클래스 내에 클래스를 끼워 넣을 수 있다.
	// 내부 클래스(inner class, 이너 클래스)
	// 자주 사용하지 않는다. 변수를 공유할 일이 그렇게 많지 않기 때문에. 그래픽 사용이 그리 많지 않음. 불가피한 경우에만 사용
	// jsp에선 거의 사용 안함. 안드로이드나 IOS에서 사용.
	// 내부로 끼워진 클래스는 독립적으로 다른 곳에 사용될 수 없다.
	public class Count2 extends Thread { // 클래스 안에 클래스를 넣을 수 있다. 멤버변수 공유 가능
		@Override
		public void run() {
			// (증감연산자)i-- --> i = i - 1;
			// 2씩 감소할 때 i = i - 2
			for (int i = 1000; i >= 0; i = i - 2) {
				count.setText("count>> " + i);
				
				// 한번에 실행되는 것을 막기 위해 텀을 준다.
				try {
					Thread.sleep(500); // 1000밀리세컨즈 -> 1초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public class Image2 extends Thread {
		// 한번에 실행되는 것을 막기 위해 텀을 준다.
		@Override
		public void run() {
			String[] list = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg", "7.jpg", "8.jpg", "9.jpg", "10.jpg"};
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				// image.setText(list[i]);
				
				// 한번에 실행되는 것을 막기 위해 텀을 준다.
				try {
					Thread.sleep(5000); // 1000밀리세컨즈 -> 1초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public class Timer2 extends Thread {
		// 한번에 실행되는 것을 막기 위해 텀을 준다.
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date = new Date();
				timer.setText(date + "");
				//System.out.println(date);
				
				// 한번에 실행되는 것을 막기 위해 텀을 준다. 
				try {
					Thread.sleep(1000); // 1000밀리세컨즈 -> 1초. 타이머니까 1초 단위로. sleep을 하지 않으면 한번에 휘리릭 실행
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) { // main 안에 많이 넣지 않는다. 메모리의 과부화를 막기 위해 static 없는 걸 사용한다. public void와 public static을 이런 구조로 사용하는 것이 이상적
		ThreadGraphic1 s = new ThreadGraphic1();
	}
}
