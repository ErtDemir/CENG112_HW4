
public class Tea implements IItem{
	private String type = "Tea";
	private String teaName; 
	private int teaSize; 
	private int price ;
	
	public Tea (String teaName , int price , int teaSize) {
		this.setPrice(price);
		this.setTeaName(teaName);
		this.setTeaSize(teaSize);
	}
	
	public String toString() {
		return null;
	}
	@Override
	public String itemName() {
		return this.getTeaName();
	}
	@Override
	public String itemType() {
		return this.type;
	}
	@Override
	public int itemPrice() {
		return this.price;
	} 
	
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	public int getTeaSize() {
		return teaSize;
	}
	public void setTeaSize(int teaSize) {
		this.teaSize = teaSize;
	}
	public int getLast() {
		return this.teaSize;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
