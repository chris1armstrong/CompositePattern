
public class TestCompositePattern {

	public static void main(String[] args) {
		Component i1 = new Item("weeb", 67.99);
		Component i2 = new Item("grubber", 79.99);
		
		Component i3 = new Item("tamp", 15.00);
		Component i4 = new Item("loot", 10.00);
		Assembly a1 = new Assembly("Factory 1");
		a1.attach(i1);
		a1.attach(i2);
		System.out.println(a1.toString());

		Assembly a2 = new Assembly("Factory 2");
		a2.attach(i3);
		a2.attach(i4);
		System.out.println(a2.toString());
		

		Assembly a3 = new Assembly("Mega Base 1");
		a3.attach(a1);
		a3.attach(a2);
		System.out.println(a3.toString());
	}

}
