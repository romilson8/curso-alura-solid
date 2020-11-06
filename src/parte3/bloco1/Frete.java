package parte3.bloco1;

public class Frete {

	public double para(String cidade) {
		// TODO Auto-generated method stub
		if ("SAO PAULO".equals(cidade.toUpperCase())) {
			return 15;
		}
		return 30;
	}

}
