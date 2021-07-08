package 알고리즘;

public class 최소값 {

	public static void main(String[] args) {
		// 많은 양의 데이터를 정렬/검색하는 경우 배열에 집어넣어라!
		int[] s = { 90, 80, 20, 60, 70 };
		
		// 전체 n번 순회하면서 해당 인덱스까지의 최소값을 변수 하나를 정해서 넣어두는 알고리즘
		int min = s[0]; // 초기화할 때 첫번째 값을 넣어준다. 0을 넣으면 안된다. 최소값을 찾게되니 0보다 작은 수가 없게 되니까.
		for (int i = 1; i < s.length; i++) { // i=0을 1로 바꿔준다. 쓸데 없는 일 하나 줄여주기
			// 해당 인덱스에 들어있는 값이 min에 넣어둔 값보다 작으면
			// 해당 인덱스에 들어있는 값을 min에 넣는다
			if (s[i] < min) { 
				min = s[i];
			}
			
		}
		System.out.println("최소값은 " + min);
	}

}
