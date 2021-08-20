package shop.dto;

public class ProductDTO {
	private String id;
	private String name	;
	private String content;
	private String price;
	// setters and getters를 생성해보세요.
	// toString도 생성해보세요.
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", content=" + content + ", price=" + price + "]";
	}

}
