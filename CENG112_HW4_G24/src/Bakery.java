
public class Bakery implements IItem{
	private String type = "Bakery";
	private String bakeryName; 
	private int calories; 
	private int price ;
	public Bakery (String bakeryName ,int price, int calories ) {
		this.setBakeryName(bakeryName);
		this.setPrice(price) ;
		this.setCalories(calories);
	}

	public String toString() {
		return null;
	}

	public String itemName() {
		return this.bakeryName;
	}
	public void setBakeryName(String bakeryName) {
		this.bakeryName = bakeryName;
	}
	public int getLast() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public String itemType() {
		return this.type;
	}
	public int itemPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
