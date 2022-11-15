package Uninter; // João Marcelo de Melo Bomfim RU: 3994104;

import java.util.Scanner;

public class Menu {
	
	private Scanner teclado;
	private Cofrinho cofrinho;
	
	/*MÉTODO CONSTRUTOR MENU;*/
	public Menu() { 
		teclado = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	
	public void MenuPrincipal() {
		
		System.out.println("COFRINHO:");
		System.out.println("1-ADICIONAR MOEDAS");
		System.out.println("2-REMOVER MOEDAS");
		System.out.println("3-LISTAR MOEDAS");
		System.out.println("4-CALCULAR O TOTAL CONVERTIDO PARA REAL");
		System.out.println("0-ENCERRAR");
			
		String Res = teclado.next(); // Input Resposta Menu;
		
		switch (Res) {
		case "0": // Caso res == 0;
			System.out.println("Encerrando...");
			break; // Programa Encerrando;
			
		case "1": // Caso res == 1;
			MenuAdicionarMoedas(); // Chamará o Método de adicionar moedas;
			MenuPrincipal();
			break;
			
			
		case "2": // Caso res == 2;
			MenuRemoverMoedas(); // Chamará o Método de Remover moedas;
			MenuPrincipal();
			break;
			
			
		case "3": // Caso res == 3;
			cofrinho.ListagemMoedas(); // Chamada do método 'ListagemMoedas' da classe 'Cofrinho';
			MenuPrincipal();
			break;
			
			
		case "4": // Caso res == 4;
			double ValorConvertido = cofrinho.TotalConvertido(); // Chamada do método 'Total Convertido' da classe 'Cofrinho' por meio da variavel 'ValorConvertido'
			System.out.println("O total convertido para Real é igual: " + ValorConvertido + " R$");
			MenuPrincipal();
			break;
			
			
		default: // Caso res não for válida;
			System.out.println("Opção inválida!");
			MenuPrincipal();
			break;
		}
	}
	
	
	

	
	public void MenuAdicionarMoedas() {
		System.out.println("Escolha a Moeda:");
		
		System.out.println("1-REAL");
		System.out.println("2-DOLAR");
		System.out.println("3-EURO");
		
		int RespostaMoeda = teclado.nextInt(); // Input Resposta moeda;
	
		System.out.println("Digite o Valor:");
		String ValorInput = teclado.next(); // Input Valor da moeda;
		ValorInput = ValorInput.replace(",", "."); // Converte ',' em '.' , evitando possiveis erros de inputs;
		double valor = Double.parseDouble(ValorInput); // Converte valor do input de: 'String' para 'Double';
			
		if (RespostaMoeda == 1) {
			Real moeda = new Real(valor); // instanciação da classe Real, recebendo o input 'valor' como parâmetro;
			cofrinho.AdicionarMoedas(moeda); // Chamada do método 'Adicionar Moedas' da classe 'Cofrinho' passando 'moeda' como parâmetro;
			System.out.println("Moeda de Real adicionada!");
		} 
			
		else if (RespostaMoeda == 2) {
			Dolar moeda = new Dolar(valor); // instanciação da classe Dolar, recebendo o input 'valor' como parâmetro;
			cofrinho.AdicionarMoedas(moeda); // Chamada do método 'Adicionar Moedas' da classe 'Cofrinho' passando 'moeda' como parâmetro;
			System.out.println("Moeda de Dólar adicionada!");
		}
			
		else if (RespostaMoeda == 3) {
			Euro moeda = new Euro(valor); // instanciação da classe Euro, recebendo o input 'valor' como parâmetro;
			cofrinho.AdicionarMoedas(moeda); // Chamada do método 'Adicionar Moedas' da classe 'Cofrinho' passando 'moeda' como parâmetro;
			System.out.println("Moeda de Euro adicionada!");
		} else { 
			System.out.println("Moeda inválida!");
			MenuPrincipal(); // Se Input Resposta moeda não for o desejado, retorna para o MenuPrincipal;
		}
	}
	
	
	
	
	public void MenuRemoverMoedas() {
		
		cofrinho.ListagemMoedas();  // Chamada do método 'ListagemMoedas' da classe 'Cofrinho';
		
		System.out.println("Escolha a moeda:");
		
		System.out.println("1-REAL");
		System.out.println("2-DOLAR");
		System.out.println("3-EURO");
		
		int RespostaMoeda2 = teclado.nextInt(); // Input Resposta moeda;
			
		System.out.println("Digite o valor:");
		String ValorInput2 = teclado.next(); // Input Valor da moeda;
		ValorInput2 = ValorInput2.replace(",", "."); // Converte ',' em '.' , evitando possiveis erros de inputs;
		double valor2 = Double.parseDouble(ValorInput2); // Converte valor do input de: 'String' para 'Double';
		
		if (RespostaMoeda2 == 1) {
			Real moeda = new Real(valor2); // instanciação da classe Real, recebendo o input 'valor' como parâmetro;
			cofrinho.RemoverMoedas(moeda); // Chamada do método 'Remover Moedas' da classe 'Cofrinho' passando 'moeda' como parâmetro;
			System.out.println("moeda removida!");
		} 
		
		else if (RespostaMoeda2 == 2) {
			Dolar moeda = new Dolar(valor2);  // instanciação da classe Dolar, recebendo o input 'valor' como parâmetro;
			cofrinho.RemoverMoedas(moeda); // Chamada do método 'Remover Moedas' da classe 'Cofrinho' passando 'moeda' como parâmetro;
			System.out.println("moeda removida!");
		}
		
		else if (RespostaMoeda2 == 3) {
			Euro moeda = new Euro(valor2); // instanciação da classe Euro, recebendo o input 'valor' como parâmetro;
			cofrinho.RemoverMoedas(moeda); // Chamada do método 'Remover Moedas' da classe 'Cofrinho' passando 'moeda' como parâmetro;
			System.out.println("moeda removida!");
		} else { 
			System.out.println("moeda inválida!");
			MenuPrincipal(); // Se Input Resposta moeda não for o desejado, retorna para o MenuPrincipal;
		}
	}
}
