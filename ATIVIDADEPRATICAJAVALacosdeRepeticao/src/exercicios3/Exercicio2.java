package exercicios3;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int par,impar,i,numero;
		par = 0;
		impar = 0;
		
		for(i = 0; i<10; i++) {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			if(numero%2 == 0) {
				par += 1;
			}
			else {
				impar += 1;
			}
		}
		System.out.println("Total de numeros pares: " + par);
		System.out.println("Total de numeros impares: " + impar);
	}
}
