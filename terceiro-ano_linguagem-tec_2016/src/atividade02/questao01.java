package atividade02;
import java.util.*;
public class questao01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				//variaveis que serao utilizadas
				String nome;
				double horastrab = 0;
				int dependentes = 0;
				//variaveis com valores "fixos"
				double inss = 8.5/100;
				double ir = 5.0/100;

				//Recebendo as info.
				System.out.println("Digite o nome do funcionario.");
				nome = sc.nextLine();
				System.out.println("Horas de trabalho.");
				horastrab = sc.nextDouble();
				//considerando apenas a parte inteira, afinal, recebe-se por hora, não por minutos
				int htrab = (int) horastrab;
				System.out.println("Numero de dependentes.");
				dependentes = sc.nextInt();
				
				//trabalhando com as variaveis
				double salariobruto = (12 * htrab) + (40 * dependentes);
				double desc_inss = salariobruto * inss;
				double desc_ir = salariobruto * ir;
				double salarioliq = salariobruto - desc_inss - desc_ir;
				
				//Imprimindo os dados
				System.out.println("############ CONTRA-CHEQUE ##############");
				System.out.println("Nome: " + nome);
				System.out.println("Salario bruto: R$ " + salariobruto);
				System.out.println("Valor descontado do INSS: R$ " + desc_inss);
				System.out.println("Valor descontado do IR: R$ " + desc_ir);
				//Arredondando para ate duas casas decimais
				System.out.printf("Salario liquido: R$%.2f ", salarioliq);
				System.out.println("\n#########################################");
			}

}
