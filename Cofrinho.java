package Uninter; // João Marcelo de Melo Bomfim RU: 3994104;

import java.util.ArrayList;

public class Cofrinho {
	
	public ArrayList<Moeda> ListaMoedas; //  Criada ArrayList Moeda;
	
	public Cofrinho() {
		this.ListaMoedas = new ArrayList<>(); // Construtor classe "Cofrinho", recebe nova ArrayList;
	}
	
	
	public void AdicionarMoedas(Moeda moeda) { // Método Adicionar moedas;
		this.ListaMoedas.add(moeda); // Adiciona moeda dentro da ArrayList 'ListaMoedas';
	}
	
	
	public void RemoverMoedas(Moeda moeda) { // Método Remover Moedas;
		if (this.ListaMoedas.isEmpty()) { // se a lista estiver vazia, não retorna nada;
			System.out.println("não tem moedas no cofrinho!");
		}else {
			this.ListaMoedas.remove(moeda); // remove moeda da ArrayList 'ListaMoedas';
		}
	}
	
	
	public void ListagemMoedas() { // Método Listar moedas;
		if(this.ListaMoedas.isEmpty()) { // se a lista estiver vazia, não retorna nada;
			System.out.println("não tem moedas no cofrinho!");
			Menu menu = new Menu();
			menu.MenuPrincipal();
		} else { // se a lista estiver com item(s);
			for(Moeda moeda : this.ListaMoedas) { 
				moeda.info(); // exibir moedas uma a uma por meio do método "info";
			}
		}
	}

	
	
	public double TotalConvertido() { // Método Converter Moedas para Real;
		if (this.ListaMoedas.isEmpty()) { // se a lista estiver vazia, não retorna nada;
			System.out.println("não tem moedas no cofrinho!");
			Menu menu = new Menu();
			menu.MenuPrincipal();
			return 0;
		}
		
		double ValorAcumulador = 0; // Valor acumulador de moedas;
		
		for(Moeda moeda : this.ListaMoedas) {
			ValorAcumulador = ValorAcumulador + moeda.converter(); // Valor acumulador recebe valor convertido de todas as moedas, uma a uma por meio do método "Converter";
		}
		
		return ValorAcumulador;
		
	}
}
