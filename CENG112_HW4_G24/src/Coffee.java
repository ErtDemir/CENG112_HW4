
public class Coffee implements IItem {
	private String type = "Coffee";
	private String coffeeName; 
	private int coffeeSize; 
	private int price;
	
	public Coffee (String coffeeName ,int price, int coffeeSize){
		this.setCoffeeName(coffeeName);
		this.setItemPrice(price);
		this.setCoffeeSize(coffeeSize);
	}
	
	public String toString() {
		return "";
	}
		
	
	public String itemName() {
		return this.coffeeName;
	}
	
	public String itemType() {
		return this.type;
	}
	
	public int itemPrice() {
		return this.price;
	}
	public void setItemPrice(int price) {
		this.price = price;
	}
	public void setCoffeeSize(int coffeeSize) {
		this.coffeeSize = coffeeSize;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	
	public int getLast() {
		return this.coffeeSize;
	}
}
