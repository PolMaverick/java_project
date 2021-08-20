package 생성자;

public class Phone {
	String company;
	String number;
	String parents;
	
	public Phone(String company, String number, String parents) {
		this.company = company;
		this.number = number;
		this.parents = parents;
	}

	public String toString() {
		return "Phone [company=" + company + ", number=" + number + ", parents=" + parents + "]";
	}
	

}
