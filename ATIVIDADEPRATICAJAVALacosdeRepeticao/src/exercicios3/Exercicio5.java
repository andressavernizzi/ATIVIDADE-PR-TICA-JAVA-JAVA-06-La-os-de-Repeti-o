package exercicios3;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num,soma;
		soma = 0;
		do{
			System.out.println("Digite um numero(para sair digite 0): ");
			num = leia.nextInt();
			if(num>0) {
				soma += num;
			}
		} 
		while(num!= 0);
		System.out.println("A soma dos numeros positivos é: "+soma);
	}
}
