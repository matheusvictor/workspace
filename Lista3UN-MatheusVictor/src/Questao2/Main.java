package Questao2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupança();
		
		c.setSaldo(1000);
		c.VerificarSaldo();
		c.AtualizarConta(4);
		c.VerificarSaldo();
		
		cc.setSaldo(1000);
		cc.VerificarSaldo();
		cc.AtualizarConta(4);
		cc.VerificarSaldo();
		
		cp.setSaldo(1000);
		cp.VerificarSaldo();
		cp.AtualizarConta(4);
		cp.VerificarSaldo();
		

	}

}
