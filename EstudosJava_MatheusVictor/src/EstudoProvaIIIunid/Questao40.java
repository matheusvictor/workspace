package EstudoProvaIIIunid;
import java.util.*;
public class Questao40 {
/**
	 * Fa�a um programa para o c�lculo de uma folha de pagamento, sabendo que os descontos s�o do Imposto de
Renda, que depende do sal�rio bruto (conforme tabela abaixo) e 10% para o INSS e que o FGTS corresponde a
11% do Sal�rio Bruto, mas n�o � descontado (� a empresa que deposita).
O Sal�rio L�quido corresponde ao Sal�rio Bruto menos os descontos. O programa dever� pedir ao usu�rio o valor da sua hora e a quantidade de horas
trabalhadas no m�s.

Desconto do IR:
Sal�rio Bruto at� 900 (inclusive) - isento Sal�rio Bruto at� 1500 (inclusive) - desconto de 5%
Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%
Sal�rio Bruto acima de 2500 - desconto de 20%

Imprima na tela as informa��es, dispostas conforme o exemplo
abaixo. No exemplo o valor da hora � 5 e a quantidade de hora � 220.

Sal�rio Bruto: (5 * 220) : R$ 1100,0
(-) IR (5%) : R$ 55,0
(-) INSS ( 10%) : R$ 110,0
FGTS (11%) : R$ 121,0
Total de descontos : R$ 165,0
Sal�rio Liquido : R$ 935,0
*/
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String nome;
	double ganhohora, horastrabalho = 0;
	
	System.out.println("Usuario, sou um programa que realiza os calculos necessario para uma Folha de Pagamento.");
	System.out.println("Digite seu nome para continuar.");
	nome = sc.nextLine();
	
	System.out.println("Digite o numero de horas trabalhadas no mes. Ex.: Para 2h e 30 min., digite 2,5.");
	horastrabalho = sc.nextFloat();
	
	while (horastrabalho <=0){
		System.out.println("Valor invalido. Tente novamente!");
		horastrabalho = sc.nextFloat();
	}
	
	int horas = (int) horastrabalho;
	double decimais = horastrabalho - horas;
	double m = decimais * 60;
	int minutos = (int) m;
	//Convertendo as horas decimais, para o formato Horas Minutos
	
	System.out.println("Digite o valor (em reais) ganho por hora.");
	System.out.println("Obs.: Digite apenas numeros. O mesmo pode ser decimal.");
	ganhohora = sc.nextFloat();
	
	while (ganhohora <= 0){
		System.out.println("Desculpe-nos, " + nome + ", mas trabalhar por " + horas + "h " + minutos + "min. e ganhar R$ " + ganhohora + " eh trabalho escravo.");
		System.out.println("Tente novamente!");
		ganhohora = sc.nextFloat();
	}
	
	sc.close();
	
	double salariobruto = horastrabalho * ganhohora;
	
	if ((salariobruto >= 900) && (salariobruto <= 1500)){
		double IR = (salariobruto * 10)/100;
		double INSS = (salariobruto * 10)/100;
		double FGTS = (salariobruto * 11)/100;
		double descontos = (IR + INSS);
		double salarioliquido = salariobruto - descontos;
		System.out.println(" ");
		System.out.println("Nome do(a) funcionario(a): " + nome);
		System.out.println("Ganho por hora: R$ " + ganhohora);
		System.out.println("Horas trabalhadas/mes: " + horas + " h " + minutos + " min.");
		System.out.println("Salario Bruto: R$ " + salariobruto);
		System.out.println("(-) IR (5%): R$ " + IR);
		System.out.println("(-) INSS ( 10%): R$ " + INSS);
		System.out.println("FGTS (11%): R$ " + FGTS);
		System.out.println("Total de descontos: R$ " + descontos);
		System.out.printf("Salario Liquido: R$ %.2f" , salarioliquido);
	}
	
	else if (salariobruto <= 2500){
		double IR = (salariobruto * 5)/100;
		double INSS = (salariobruto * 10)/100;
		double FGTS = (salariobruto * 11)/100;
		double descontos = (IR + INSS);
		double salarioliquido = salariobruto - descontos;
		System.out.println(" ");
		System.out.println("Nome do(a) funcionario(a): " + nome);
		System.out.println("Ganho por hora: R$ " + ganhohora);
		System.out.println("Horas trabalhadas/mes: " + horas + " h " + minutos + " min.");
		System.out.println("Salario Bruto: R$ " + salariobruto);
		System.out.println("(-) IR (5%): R$ " + IR);
		System.out.println("(-) INSS ( 10%): R$ " + INSS);
		System.out.println("FGTS (11%): R$ " + FGTS);
		System.out.println("Total de descontos: R$ " + descontos);
		System.out.printf("Salario Liquido: R$ %.2f" , salarioliquido);
	}
	
	else if (salariobruto > 2500){
		double IR = (salariobruto * 20)/100;
		double INSS = (salariobruto * 10)/100;
		double FGTS = (salariobruto * 11)/100;
		double descontos = (IR + INSS);
		double salarioliquido = salariobruto - descontos;
		System.out.println(" ");
		System.out.println("Nome do(a) funcionario(a): " + nome);
		System.out.println("Ganho por hora: R$ " + ganhohora);
		System.out.println("Horas trabalhadas/mes: " + horas + " h " + minutos + " min.");
		System.out.println("Salario Bruto: R$ " + salariobruto);
		System.out.println("(-) IR (5%): R$ " + IR);
		System.out.println("(-) INSS ( 10%): R$ " + INSS);
		System.out.println("FGTS (11%): R$ " + FGTS);
		System.out.println("Total de descontos: R$ " + descontos);
		System.out.printf("Salario Liquido: R$ %.2f" , salarioliquido);
	}
	
	}

}
