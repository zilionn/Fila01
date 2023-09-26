package view;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import controller.OperacaoController;

import entities.Cliente;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OperacaoController valida = new OperacaoController();
		Queue<Cliente> fila = new LinkedList<>();
		
		for(int i = 1; i <= 20; i++) {
			System.out.println("Insira o nome do " +i+ "º cliente");
			String name = sc.nextLine();
			
			System.out.println("Insira a quantidades de peças: ");
			int qntd = sc.nextInt();
			
			qntd = valida.validaQtnd(qntd);
			
			System.out.println("Insira o valor das peças: ");
			float valor = sc.nextFloat();
			valor = valida.validaValor(valor);
			
			fila.add(new Cliente(name, qntd, valor));
			
			sc.nextLine();
			
		}
		
		OperacaoController operacaoController = new OperacaoController();
		operacaoController.caixa(fila);
		
		sc.close();
		

	}

}
