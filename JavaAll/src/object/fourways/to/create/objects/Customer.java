package object.fourways.to.create.objects;

public class Customer {
	private int id;
	private String name;

	public Customer() {

	}

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

}
