package 스레드;

import java.util.Date;

public class Timer1 extends Thread {
	// 한번에 실행되는 것을 막기 위해 텀을 준다.
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Date date = new Date();
			System.out.println(date);
			
			// 한번에 실행되는 것을 막기 위해 텀을 준다. 
			try {
				Thread.sleep(1000); // 1000밀리세컨즈 -> 1초. 타이머니까 1초 단위로. sleep을 하지 않으면 한번에 휘리릭 실행
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
