package Uninter; // João Marcelo de Melo Bomfim RU: 3994104;

public class Dolar extends Moeda {
	
	public Dolar(double ValorInput) { // Construtor classe "Dólar", Recebe ValorInput como parâmetro;
		this.Valor = ValorInput; // Valor da classe "Moeda", recebe ValorInput;
	}

	@Override
	public void info() { // Método para mostrar Informações da  moeda Dólar;
		System.out.println("Dolar - " + Valor + " US$");
	}

	@Override
	public double converter() { // Método para converter Dólar para Real;
		this.ValorConvertido = this.Valor *5.3;
		return this.ValorConvertido;
	}

}
