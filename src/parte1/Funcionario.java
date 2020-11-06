package parte1;

public class Funcionario {
	
	private Cargo cargo;
	private double salarioBase;
	
	public Funcionario(Cargo cargo, double salarioBase) {
		this.cargo = cargo;
		this.salarioBase = salarioBase;
	}

	public Cargo getCargo() {
		return this.cargo;
	}

	public double getSalarioBase() {
		return this.salarioBase;
	}

	public double getCalculaSalario() {
		return cargo.getRegra().calcula(this);
	}

}
