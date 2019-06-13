package primeiro.exercicio;

public class Main {

	public static void main(String[] args) {

		Conta c = new Conta();
		
		c.setUsuario("Dona Maria");
		c.setNumeroConta("00000-0");
		c.Depositar(1000);
		c.Bonus(0.10);
		
		System.out.println("Usuario: " + c.getUsuario());
		System.out.println("Numero da conta: " + c.getNumeroConta());
		System.out.println("Saldo: R$ " + c.Extrato());
	
		Conta cc = new ContaCorrente();
		cc.setUsuario("Sr. Joao");
		cc.setNumeroConta("00000-1");
		cc.Depositar(100);
		cc.Bonus(0.20);
		
		System.out.println("Usuario: " + cc.getUsuario());
		System.out.println("Numero da conta: " + cc.getNumeroConta());
		System.out.println("Saldo: R$ " + cc.Extrato());
		
		Conta cp = new ContaPoupanca();
		cp.setUsuario("Sr. Carlos");
		cp.setNumeroConta("00000-2");
		cp.Depositar(10);
		cp.Bonus(0.30);
		
		System.out.println("Usuario: " + cp.getUsuario());
		System.out.println("Numero da conta: " + cp.getNumeroConta());
		System.out.println("Saldo: R$ " + cp.Extrato());

	}

}
