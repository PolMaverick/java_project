package 스레드;

public class 동시처리Main2 {

	public static void main(String[] args) {
		// 1. thread 객체 생성
		AtThread atThread = new AtThread();
		DollarThread dollarThread = new DollarThread();
		PercentThread percentThread = new PercentThread();
		// 2. 꼭 cpu에 스레드를 등록해주어야 한다.
		atThread.start();
		dollarThread.start();
		percentThread.start();
		System.out.println("스레드 종료");
	}
}
