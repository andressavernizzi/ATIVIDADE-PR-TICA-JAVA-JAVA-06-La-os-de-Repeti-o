package exercicios3;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1,n2,i;
		System.out.println("Digite dois numeros onde o primeiro deve ser menor do que o segundo");
		System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = leia.nextInt();
		
		if(n1 < n2) {
			for(i = n1; i<n2; i++) {
				if(i%3 == 0 && i%5 == 0) {
					System.out.println(i+" é multiplo de 3 e 5");
				}
			}
		}
		else {
			System.out.println("Intervalo inválido");
		}
	}
}
