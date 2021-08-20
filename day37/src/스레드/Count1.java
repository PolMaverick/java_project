package 스레드;

public class Count1 extends Thread {
	@Override
	public void run() {
		// (증감연산자)i-- --> i = i - 1;
		// 2씩 감소할 때 i = i - 2
		for (int i = 1000; i >= 0; i = i - 2) {
			System.out.println("count>> " + i);
			
			// 한번에 실행되는 것을 막기 위해 텀을 준다.
			try {
				Thread.sleep(500); // 1000밀리세컨즈 -> 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
