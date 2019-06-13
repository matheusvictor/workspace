package EstudosIniciais;
import java.util.*;
public class Estudo {

	/**
	 * Fa�a a leitura do sal�rio atual e do tempo de servi�o de um funcion�rio. A seguir, calcule o seu sal�rio reajustado.
Funcion�rios com at� 1 ano de empresa, receber�o aumento de 10%. Funcion�rios com mais de um ano de
tempo de servi�o, receber�o aumento de 20%.
	 */
	public static void main(String[] args) {
		
		String nome;
		int meses, opc = 0;
		double anos = 0;
		double salario = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Funcionario, por favor digite o seu nome.");
		nome = sc.nextLine();
		
		System.out.println(nome+ ", digite o valor (em reais) do seu salario.");
		salario = sc.nextDouble();
		
		System.out.println("Digite a op�ao na qual deseja calcular o tempo de servi�o.");
		System.out.println("1- Ano(s)");
		System.out.println("2- Meses(s)");
		opc = sc.nextInt();
		
		while (opc != 1 && opc != 2){
			System.out.println("Erro! Op�ao invalida. Tente novamente.");
			opc = sc.nextInt();
		}
		
		if (opc == 1){
			System.out.println("Digite durante quantos anos trabalha na empresa.");
			System.out.println("Para um ano e meio, digite 1,5.");
			anos = sc.nextDouble();
		}
		
		int ano = (int) anos;
		double x = anos - ano;
		double m = x * 12;
		int mes = (int) m;
		
		if (anos == 1){
			double salarioatual = salario + ((salario*10)/100);
			System.out.println("Nome do funcionario: " + nome);
			System.out.println("Tempo de servi�o: " + ano + " ano(s) e " + mes + " mes(es).");
			System.out.println("Salario: R$ " + salario);
			System.out.println("Aumento: 10%");
			System.out.println("Salario atual: R$ " + salarioatual);
		}
		
		else if (anos > 1){
			double salarioatual = salario + ((salario*20)/100);
			System.out.println("Nome do funcionario: " + nome);
			System.out.println("Tempo de servi�o: " + ano + " ano(s) e " + mes + " mes(es).");
			System.out.println("Salario: R$ " + salario);
			System.out.println("Aumento: 20%");
			System.out.println("Salario atual: R$ " + salarioatual);
		}
		
		if (opc == 2){
			System.out.println("Digite durante quantos meses trabalha na empresa.");
			meses = sc.nextInt();			
		
		if (meses == 12){
			double salarioatual = salario + ((salario*10)/100);
			System.out.println("Nome do funcionario: " + nome);
			System.out.println("Tempo de servi�o: " + mes + " mes(es).");
			System.out.println("Salario: R$ " + salario);
			System.out.println("Aumento: 10%");
			System.out.println("Salario atual: R$ " + salarioatual);
		}
		
		else if (meses > 12){
			double salarioatual = salario + ((salario*20)/100);
			System.out.println("Nome do funcionario: " + nome);
			System.out.println("Tempo de servi�o: " + mes + " mes(es).");
			System.out.println("Salario: R$ " + salario);
			System.out.println("Aumento: 20%");
			System.out.println("Salario atual: R$ " + salarioatual);
		}
		
		}

	}

}
