package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTercerizado;

public class App {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> listaFuncionarios = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão cadastrado? ");
		int qtdFuncionarios = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= qtdFuncionarios; i++) {
			System.out.print("É Tercerizado (s/n)? ");
			char resposta = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Horas trabalhadas: ");
			Integer hora = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Valor da hora: ");
			Double valorHora= sc.nextDouble();
			sc.nextLine();
			
			if (resposta == 's') {
				System.out.print("Custo adicional: ");
				Double custoAdicional = sc.nextDouble();
				sc.nextLine();
				
				listaFuncionarios.add(new FuncionarioTercerizado(nome, hora, valorHora, custoAdicional));
			}
			
			else {
				listaFuncionarios.add(new Funcionario(nome, hora, valorHora));
			}
		}
		
		for (Funcionario funcionario : listaFuncionarios) {
			System.out.println("\nPagamento: ");
			System.out.println(funcionario.getNome() + " - " + funcionario.pagamento());
		}
		
		sc.close();
	}
}
