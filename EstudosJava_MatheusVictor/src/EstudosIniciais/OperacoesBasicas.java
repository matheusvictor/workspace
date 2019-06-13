package EstudosIniciais;
import java.util.*;
public class OperacoesBasicas {

	/** Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. O
resultado da operação deve ser acompanhado de uma frase que diga se o número é: par ou ímpar; positivo ou
negativo; inteiro ou decimal.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int opc = 0;
		float numero1, numero2 = 0;
		char x;
		
		System.out.println("Usuario, sou um programa criado para realizar uma operaçao basica entre dois numeros reais.");
		System.out.println("Digite:");
		System.out.println("1 - Para executar o programa.");
		System.out.println("2 - Para encerrar o programa.");
		opc= sc.nextInt();
		
		while ((opc!=1) && (opc != 2)){
			System.out.println("ERRO! Tente novamente.");
			opc= sc.nextInt();
		}
		
		while (opc == 2){
			System.out.println("Programa encerrado!");
			System.exit(0);
		}
		
		while (opc == 1){
		System.out.println(" ");
		System.out.println("Digite um numero real qualquer.");
		numero1 = sc.nextFloat();
		System.out.println("Digite um segundo numero real qualquer.");
		numero2= sc.nextFloat();
		System.out.println("Digite a operaçao que deseja realizar entre eles. Ex.: +, -, * ou /");
		System.out.println("(+) para Adicao");
		System.out.println("(-) para Subtracao");
		System.out.println("(/) para Divisao");
		System.out.println("(*) para Multiplicacao");
		System.out.println("(s) para Sair");
		
		x = sc.next().charAt(0);
		while (x != '+' && x != '-' && x != '*' && x != '/' && x != 's'){
			System.out.println("Operaçao invalida. Tente novamente.");
			x = sc.next().charAt(0);
		}
			
		float soma = numero1 + numero2;
		float subtracao = numero1 - numero2;
		float multiplicacao = numero1 * numero2;
		float divisao = numero1 / numero2;
		
		//Como usaremos SWITCH, eh necessario criar antes as variaveis correspondente a cada operaçao.
		
		switch (x) {
		case '+':
			System.out.println(numero1 + " + " + numero2 + " = " + soma);
			
			if (soma % 2 == 0){
				System.out.println("A soma entre estes dois numeros eh divisivel por 2.");
			}
			else {
				System.out.println("A soma entre estes dois numeros nao eh divisivel por 2.");
			}
			
			if (soma > 0){
				System.out.println("A soma entre estes dois numeros eh positiva.");
			}
			
			else if (soma == 0){
				System.out.println("A soma entre estes dois numeros eh neutra.");
			}
			
			else if (soma < 0){
				System.out.println("A soma entre estes dois numeros eh negativa.");
			}
			
			if (soma == (int)(numero1+numero2)){
				System.out.println("A soma entre estes dois numeros eh um numero inteiro.");
			}
			else {
				System.out.println("A soma entre estes dois numeros eh um numero decimal.");
			}
			//break;
			continue;
		
		case '-':
		System.out.println(numero1 + " - " + numero2 + " = " + subtracao);
		
		if (subtracao % 2 == 0){
			System.out.println("A subtraçao entre estes dois numeros eh divisivel por 2.");
		}
		else {
			System.out.println("A subtraçao entre estes dois numeros nao eh divisivel por 2.");
		}
		
		if (subtracao > 0){
			System.out.println("A subtraçao entre estes dois numeros eh positiva.");
		}
		
		else if (subtracao == 0){
			System.out.println("A subtraçao entre estes dois numeros eh neutra.");
		}
		
		else if (subtracao < 0){
			System.out.println("A subtraçao entre estes dois numeros eh negativa.");
		}
		
		if (subtracao == (int)(numero1-numero2)){
			System.out.println("A subtraçao entre estes dois numeros eh um numero inteiro.");
		}
		else {
			System.out.println("A subtraçao entre estes dois numeros eh um numero decimal.");
		}
		//break;
		continue;
		
	case '*':
		System.out.println(numero1 + " * " + numero2 + " = " + multiplicacao);
		
		if (multiplicacao % 2 == 0){
			System.out.println("A multiplicaçao entre estes dois numeros eh divisivel por 2.");
		}
		else {
			System.out.println("A multiplicaçao entre estes dois numeros nao eh divisivel por 2.");
		}
		
		if (multiplicacao > 0){
			System.out.println("A multiplicaçao entre estes dois numeros eh positiva.");
		}
		
		else if (multiplicacao == 0){
			System.out.println("A multiplicaçao entre estes dois numeros eh neutra.");
		}
		
		else if (multiplicacao < 0){
			System.out.println("A multiplicaçao entre estes dois numeros eh negativa.");
		}
		
		if (multiplicacao == (int)(numero1*numero2)){
			System.out.println("A multiplicaçao entre estes dois numeros eh um numero inteiro.");
		}
		else {
			System.out.println("A multiplicaçao entre estes dois numeros eh um numero decimal.");
		}
		//break;
		continue;
		
	case '/':
		System.out.println(numero1 + " / " + numero2 + " = " + divisao);
		
		if (divisao % 2 == 0){
			System.out.println("A divisao entre estes dois numeros eh divisivel por 2.");
		}
		else {
			System.out.println("A divisao entre estes dois numeros nao eh divisivel por 2.");
		}
		
		if (divisao > 0){
			System.out.println("A divisao entre estes dois numeros eh positiva.");
		}
		
		else if (divisao == 0){
			System.out.println("A divisao entre estes dois numeros eh neutra.");
		}
		
		else if (divisao < 0){
			System.out.println("A divisao entre estes dois numeros eh negativa.");
		}
		
		if (divisao == (int)(numero1/numero2)){
			System.out.println("A divisao entre estes dois numeros eh um numero inteiro.");
		}
		else {
			System.out.println("A divisao entre estes dois numeros eh um numero decimal.");
		}
		//break;
		continue;
		
	case ('s'):
		System.out.println("Programa encerrado!");
		System.exit(0);
	}	
		
		/** System.out.println(" ");
		System.out.println("Deseja usar o programa novamente?");
		System.out.println("1 - SIM");
		System.out.println("2 - NAO");
		opc = sc.nextInt();
		
		while ((opc!=1) && (opc != 2)){
			System.out.println("ERRO! Tente novamente.");
			opc= sc.nextInt();
		}
		
		while (opc == 2){
			System.out.println("Programa encerrado!");
			System.exit(0);
		}
		*/
	}
		}
}