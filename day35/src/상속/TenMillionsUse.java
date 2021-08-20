package 상속;

public class TenMillionsUse {

	public static void main(String[] args) {
		TenMillion tmActor = new TenMillion();
		tmActor.name = "황정민";
		tmActor.age = 100;
		tmActor.job = "배우";
		tmActor.tenMillion = true;
		System.out.println(tmActor);
		tmActor.think();
		tmActor.tool();
		tmActor.acting();
		tmActor.audience();
	}

}
