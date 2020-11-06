package parte1;

public class QuinzeOuVinteECincoPorcento implements RegraDeCalculo {

	@Override
	public double calcula(Funcionario employee) {
		if (employee.getSalarioBase() > 3000.0) {
			return employee.getSalarioBase() * 0.8;

		} else {
			return employee.getSalarioBase() * 0.9;
		}
	}
}
