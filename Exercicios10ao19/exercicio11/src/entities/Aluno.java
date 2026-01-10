package entities;

public class Aluno {
	private String name;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	
	public Aluno(String name, double nota1, double nota2, double nota3, double nota4) {
		this.name = name;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getNota1() {
		return nota1;
	}


	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}


	public double getNota2() {
		return nota2;
	}


	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}


	public double getNota3() {
		return nota3;
	}


	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}


	public double getNota4() {
		return nota4;
	}


	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	public double calculoMedia()
	{
		return (getNota1() + getNota2() + getNota3() + getNota4()) / 4;
	}
	
	public boolean passaOuNao() {
		return calculoMedia() >= 7.0;
	}
	
	
}
