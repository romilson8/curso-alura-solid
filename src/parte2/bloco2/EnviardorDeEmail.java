package parte2.bloco2;

public class EnviardorDeEmail implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("envia nf");
	}

}
