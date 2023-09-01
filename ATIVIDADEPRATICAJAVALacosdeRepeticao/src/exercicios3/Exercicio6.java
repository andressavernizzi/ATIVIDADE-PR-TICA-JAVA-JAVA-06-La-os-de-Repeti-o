package exercicios3;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num,media,soma,contador;
		soma = 0;
		contador = -1;
		
		do {
			System.out.println("Digite um numero(para sair digite 0): ");
			num = leia.nextInt();
			if(num%3 ==0) {
				soma += num;
				contador++;
			}	
		}
		while(num!=0);
		media = soma/contador;
		System.out.println("A média de todos os números multiplos de 3 é: "+media);
	}

}
