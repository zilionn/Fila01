package controller;

import java.util.Queue;
import java.util.Scanner;

import entities.Cliente;

public class OperacaoController {
	Scanner sc = new Scanner(System.in);
	
	
	public int validaQtnd(int number) {
		
			if (number < 20 || number > 50) {
				System.out.println("número invalido, insira novamente: ");
				return sc.nextInt();
			} else {
				return number;
			}
		}
	
	
	
	public float validaValor(float value) {
	
			if (value < 5.00 || value > 100.00) {
				System.out.println("Valor invalido, insira novamente: ");
				return sc.nextFloat();
			} else {
				return value;
			}
			
		}
	
	
	public void caixa(Queue<Cliente> fila) {
		int i = 1;
		
		while(!fila.isEmpty()) {
			Cliente cliente = fila.remove();
			int qntd = cliente.getQntdPecas();
			float value = cliente.getValorPecas();
			
			float total = qntd * value;
			
			System.out.println("O " + i + "º cliente de nome " +cliente.getNome()+ " terá que pagar R$" +total);
			i++;
		}
		
	}
}
