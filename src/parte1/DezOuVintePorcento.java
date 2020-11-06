package parte1;

public class DezOuVintePorcento implements RegraDeCalculo {

	@Override
	public double calcula(Funcionario employee) {
		if (employee.getSalarioBase() > 2000.0) {
			return employee.getSalarioBase() * 0.75;

		} else {
			return employee.getSalarioBase() * 0.85;
		}
	}

}
