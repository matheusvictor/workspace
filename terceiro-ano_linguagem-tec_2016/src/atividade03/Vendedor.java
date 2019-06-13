package atividade03;

public class Vendedor {
	
	public void calcularComissao(){
		if(totalVendas > 50000.00){
			comissao = totalVendas * (2.0/100);
		}
		if(totalVendas > 100000.00){
			comissao = totalVendas * (5.0/100);
		}
		if(totalVendas > 150000.00){
			comissao = totalVendas * (7.0/100);
		}
	}
	public void calcularSalarioBruto(){
		salBruto = salBase + comissao;
	}
	public void calcularBonus(){
		if(totalVendas > 70000.00){
			bonus = 500.00;
		}
		if(totalVendas <= 70000.00){
			bonus = 100.00;
		}
	}
	public void calcularIRPF(){
		if(salBruto <= 1434.59){
			irpf = 0.00;
		}
		if(salBruto > 1434.59){
			irpf = salBruto * (7.5/100);
		}
		if(salBruto > 2150.00){
			irpf = salBruto * (15/100);
		}
		if(salBruto > 2866.70){
			irpf = salBruto * (22.5/100);
		}
		if(salBruto > 3582.00){
			irpf = salBruto * (27.5/100);
		}
	}
	public void calcularINSS(){
		if(salBruto <= 965.67){
			inss = salBruto * (3.0/100);
		}
		if(salBruto <= 1609.45){
			inss = salBruto * (5.0/100);
		}
		if(salBruto <= 3218.90)
			inss = salBruto * (9.0/100);
	}
	public void calcularSalarioFamilia(){
		if(salBruto <= 5000.40){
			salFamilia = 25.66 * numeroDeDependentes;
		}
		if(salBruto <= 7521.20){
			salFamilia = 18.08 * numeroDeDependentes;
		}
		else
			salFamilia = 0.00;
	}
	public void calcularSalarioLiquido(){
		salLiquido = salBruto - irpf - inss + bonus + salFamilia;
	}
	public void imprimirFolhaPagamento(){
		System.out.println("Nome.............. " + nome);
		System.out.println("Salario base................R$ " + salBase);
		System.out.println("Comissao.....................R$ " + comissao);
		System.out.println("Salario bruto...................R$ " + salBruto);
		System.out.println("----------------------------------------------------");
		System.out.println("Bonus........................R$ " + bonus);
		System.out.println("Salario familia...................R$ " + salFamilia);
		System.out.println("-------------------------------------------------------");
		System.out.println("IRPF............................R$ " + irpf);
		System.out.println("INSS...................R$ " + inss);
		System.out.println("Salario liq.....................R$ " + salLiquido + "\n");
	}
	
	String nome;
	double salBase;
	double totalVendas;
	int numeroDeDependentes;
	double comissao, salBruto, bonus, irpf, inss, salFamilia, salLiquido;		
}