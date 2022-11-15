package Uninter; // João Marcelo de Melo Bomfim RU: 3994104;

public class Real extends Moeda {
	
	public Real(double ValorInput) { // Construtor classe "Real", Recebe ValorInput como parâmetro;
		this.Valor = ValorInput; // Valor da classe "Moeda", recebe ValorInput;
	}
	
	
	@Override
	public void info() {
		System.out.println("Real - " + Valor + " R$"); // Método para mostrar Informações da  moeda Real;
	}

	@Override
	public double converter() { // Método para converter Real para Real;
		this.ValorConvertido = this.Valor;
		return this.ValorConvertido;
	}
}

