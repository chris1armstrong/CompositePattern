
public class Item implements Component {
	private String name;
	private double price;
	
	public Item(String name, double d) {
		this.name = name;
		this.price = d;
	}
	@Override
	public double getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + " " + price;
	}
	
}
