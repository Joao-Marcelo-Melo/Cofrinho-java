package Uninter; // João Marcelo de Melo Bomfim RU: 3994104;

public class Euro extends Moeda{
	
	public Euro(double ValorInput) { // Construtor classe "Euro", Recebe ValorInput como parâmetro;
		this.Valor = ValorInput; // Valor da classe "Moeda", recebe ValorInput;
	}

	@Override
	public void info() {  // Método para mostrar Informações da  moeda Euro;
		System.out.println("Euro - " + Valor + " €");
		
	}

	@Override
	public double converter() { // Método para converter Euro para Real;
		this.ValorConvertido = this.Valor *5.4;
		return this.ValorConvertido;
	}
	
}
