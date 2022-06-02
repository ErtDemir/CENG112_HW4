
public class Frappuccino implements IItem{
	private String type = "Frappucino";
	private String frappuccinoName; 
	private int frappuccinoSize; 
	private int price ;
	
	public Frappuccino (String frappuccinoName , int price , int frappucinoSize) {
		this.setFrappuccinoName(frappuccinoName);
		this.setFrappuccinoSize(frappuccinoSize);
		this.setPrice(price);
	}
	
	
	public String toString() {
		return null;
	}
	public String getFrappuccinoName() {
		return frappuccinoName;
	}
	public void setFrappuccinoName(String frappuccinoName) {
		this.frappuccinoName = frappuccinoName;
	}
	public void setFrappuccinoSize(int frappuccinoSize) {
		this.frappuccinoSize = frappuccinoSize;
	}
	public String itemName() {
		return this.getFrappuccinoName();
	}
	public String itemType() {
		return this.type;
	}
	public int itemPrice() {
		return this.price;
	}
	public int getLast() {
		return this.frappuccinoSize;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
