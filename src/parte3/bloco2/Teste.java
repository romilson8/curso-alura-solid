package parte3.bloco2;

public class Teste {

	public static void main(String[] args) {
		
//		TabelaDePreco tabela = new TabelaDePrecoPadrao();
		TabelaDePreco tabela = new TabelaDePrecoDiferenciado();
		ServicoDeEntrega  entrega = new Frete();
		
		CalculadoraDePrecos calculadora = new CalculadoraDePrecos(tabela, entrega);
		System.out.println(calculadora);

	}

}
