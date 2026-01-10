package entities;

public class Pessoa {
	private String name;
	private Integer idade;
	
	public Pessoa()
	{
		
	}

	public Pessoa(String name, Integer idade) {
		this.name = name;
		this.idade = idade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("O nome eh " + getName() + " e ele(a) eh ");
		
		if (getIdade() < 18)
		{
			sb.append("menor de idade!");
		}
		else
		{
			sb.append("maior de idade!");
		}
		
		return sb.toString();
	}
	
	
	
	
}
