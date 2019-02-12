import java.util.ArrayList;

public class Assembly implements Component {
	private String name;
	private ArrayList<Component> madeOf;

	public Assembly(String name) {
		this.madeOf = new ArrayList<Component>();
		this.name = name;
	}
	
	@Override
	public double getPrice() {
		double sum = 0;
		for (Component c : madeOf) {
			sum = sum + c.getPrice();
		}
		return sum;
	}
	
	public void attach(Component i) {
		madeOf.add(i);
	}

	@Override
	public String toString() {
		return name + " " + madeOf.toString();
	}
	
}
