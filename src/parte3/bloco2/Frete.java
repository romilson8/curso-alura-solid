package parte3.bloco2;

public class Frete implements ServicoDeEntrega{

	@Override
	public double para(String cidade) {
		// TODO Auto-generated method stub
		if ("SAO PAULO".equals(cidade.toUpperCase())) {
			return 15;
		}
		return 30;
	}

}
