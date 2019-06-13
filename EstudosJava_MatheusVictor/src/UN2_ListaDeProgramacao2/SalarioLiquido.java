package UN2_ListaDeProgramacao2;
import java.util.Scanner;
public class SalarioLiquido {

			/** Programa para calcular salário líquido.
			 */
		
		public static void main(String[] args) {
					
			String nome, mes;
			double HorasMensais, GanhoHora = 0;
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Ola, usuario. Sou um programa feito para calcular seu Salario Liquido, baseado no numero de horas trabalhadas com o valor ganho por hora de trabalho.");
			System.out.println("Obs.: O Salario Liquido sera dado a partir dos descontos do INSS, Imposto de Renda e Sindicato.");
			System.out.println(" ");
			System.out.println("Pressione enter para continuar.");
			sc.nextLine();
			
			System.out.println("Digite seu nome, por favor.");
			nome = sc.nextLine();
			
			System.out.println("Digite o nome mes em que deseja realizar o calculo.");
			mes = sc.nextLine();
			
			System.out.println("Qual o total de horas de trabalho que voce realiza no mes?");
			System.out.println("Obs.: Digite apenas numeros.");
			HorasMensais = sc.nextDouble();
			
			System.out.println("Quanto voce ganha por hora de trabalho?");
			System.out.println("Obs.: Digite apenas numeros.");
			GanhoHora = sc.nextDouble();
			
			double SalarioBruto = GanhoHora * HorasMensais;
			//Operação para obter o salário do referido mês.
			
			System.out.println(" ");
			//Aqui este comando está sendo usando para melhor espaçamento entre as linhas.
			System.out.println("Ganho por hora: R$ " + GanhoHora );
			System.out.println("Hora de trabalho / mes: " + HorasMensais + " h");
			System.out.println(" ");
			//Aqui este comando está sendo usando para melhor espaçamento entre as linhas.
			System.out.println(nome + ", o seu Salario Bruto, no mes de " + mes + ", foi igual a: R$ " + SalarioBruto);
			System.out.println(" ");
		
			/** Porcentagens:
			Imposto de Renda = 11%;
			INSS = 8%;
			Sindicato = 5%;
			*/
			
			//Declarando as variaveis de descontos.
			double INSS = (SalarioBruto * 8) / (100);
			double IR = (SalarioBruto * 11) / (100);
			double Sindicato = (SalarioBruto * 5) / (100);
			//A porcentagem está sendo realizada da seguinte forma: O Salario Bruto é multiplicado pelo valor correspondente à porcentagem e, em seguida, dividido por 100.

			System.out.println("Do seu Salario Bruto (R$ "+ SalarioBruto +"), foram pagos:");
			System.out.println("8% correspondendes ao INSS: R$ " + INSS);
			System.out.println("11% correspondendes ao Imposto de Renda: R$ " + IR);
			System.out.println("5% de Contribuiçao Sindical: R$ " + Sindicato);
					
			System.out.println(" ");
			
			System.out.println("Total de descontos: 24%.");
			//Ou seja, a soma de todos os descontos (11 + 8 + 5) eh igual a 24%.
			
			double SalarioLiquido = (SalarioBruto - INSS - IR - Sindicato);
			//Ou seja, do Salário Bruto foram descontados 24%, correspondende ao total de descontos.
			
			System.out.printf("Portanto, o seu Salario Liquido eh igual a: R$%.2f", SalarioLiquido);
			//NEsta ultima linha, o comando printf + %.2f serve para arredondar o valor recebido a duas casas decimais.

		}

	}
