package Uninter; // João Marcelo de Melo Bomfim RU: 3994104;


public abstract class Moeda {
	
	protected double Valor; // Valor da Moeda;
	protected double ValorConvertido; // Valor da Moeda convertido para Real;
	
	public abstract void info(); // Método informações da ArrayList Cofrinho;
	public abstract double converter(); // Método converter moedas em Real;
	
	
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Moeda objetoReal = (Moeda) objeto;
		
		if (this.Valor != objetoReal.Valor) {
			return false;
		}
		return true;
	}
}
