package parte2.bloco2;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<AcaoAposGerarNota> acoes = Arrays.asList(new NotaFiscalDao());
		GeradorDeNotaFiscal g = new GeradorDeNotaFiscal(acoes);
		System.out.println(g);
	}
}
