public class Product{

	private String 	name;
	private double	weight;
	private double	price;

	public Product() {}

	public Product(String name, double weight, double price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight > 0)
			this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
	}

	public String toString(){
		return "Name: " + name + ", Weight: " + weight + ", Price: $";
	}


}
