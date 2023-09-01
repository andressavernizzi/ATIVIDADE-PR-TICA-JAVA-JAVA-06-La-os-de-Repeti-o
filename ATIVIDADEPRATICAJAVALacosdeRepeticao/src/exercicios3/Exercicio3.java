package exercicios3;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade,novo,velho;
		novo =0;
		velho = 0;
		System.out.println("Por favor digite a idade da pessoa, caso queira parar digite um numero negativo!");
		idade = leia.nextInt();
		
		while(idade >0) {
			if(idade <21) {
				novo +=1;
			}
			if(idade>50) {
				velho +=1;
			}
			System.out.println("Escreva a idade");
			idade = leia.nextInt();
			
		}
		System.out.println("Total de pessoas menores de 21: "+novo);
		System.out.println("Total de pessoas maiores de 50: "+velho);
	}

}
