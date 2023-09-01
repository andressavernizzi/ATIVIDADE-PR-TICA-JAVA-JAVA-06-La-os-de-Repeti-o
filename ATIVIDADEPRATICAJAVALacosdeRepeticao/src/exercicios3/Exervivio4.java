package exercicios3;
import java.util.Scanner;

public class Exervivio4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade,sexo,categoria,back,front,mob,full;
		back = 0;
		front = 0;
		mob = 0;
		full = 0;
		String sn = "S";
		
		System.out.println("------Bem vindo ao Banco de Dados da Empresa------"
				+ "\nPara cadastrar um novo colaborados você precisará:"
				+ "\n-------------------"
				+ "\nDigitar a idade"
				+ "\n-----------------"
				+ "\nO sexo sendo:"
				+ "\n1 - Masculino"
				+ "\n2 - Feminino"
				+ "\n3 - Outro"
				+ "\n----------------------------------"
				+ "\nA categoria do colaborador sendo:"
				+ "\n1 - Backennd"
				+ "\n2 - Frontend"
				+ "\n3 - Mobile"
				+ "\n4 - FullStack"
				+ "\n");
		
		idade = 0;
		sexo = 0;
		categoria = 0;
		
		while(sn.equalsIgnoreCase("S")) {
			System.out.println("Idade: ");
			idade = leia.nextInt();
			System.out.println("Sexo: ");
			sexo = leia.nextInt();
			System.out.println("Categoria: ");	
			categoria = leia.nextInt();
			if(categoria == 1) {
				back +=1;
			}
			if(categoria == 2 && sexo ==2) {
				front +=1;
			}
			if(categoria ==3 && idade>40 && sexo == 1) {
				mob +=1;
			}
			if(categoria == 4 && idade <30 && sexo==2) {
				full +=1;
			}
			System.out.println("Deseja cadastrar mais um colaborador? S/N");
			sn = leia.next();
		}
		if(sn.equalsIgnoreCase("N")) {
			System.out.println("-Pessoas desenvolvedoras Backend: "+back);
			System.out.println("-mulheres desenvolvedoras Frontend: "+front);
			System.out.println("-homens desenvolvedores Mobile maiores de 40 anos: "+mob);
			System.out.println("-mulheres desenvolvedoras FullStack menores de 30 anos: "+full);
		}
	}
}