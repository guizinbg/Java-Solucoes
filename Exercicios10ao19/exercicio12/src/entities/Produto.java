package entities;

public class Produto {
	
	private String name;
	private Double price;
	
	public Produto()
	{
	}

	public Produto(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void condicoes(int tipo)
	{
		switch (tipo)
		{
			case 1:
				price -= price * 0.15;
				break;
			case 2:
				price -= price * 0.10;
				break;
			case 3:
				break;
			case 4:
				price += price * 0.10;
				break;
		
		}
	}

	public String toString() {
		return "Valor final de " + getName() + " eh " + String.format("%.2f", getPrice());
	}
	
	
	
	
}
