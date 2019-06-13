package lt;
public class Vendedor {
	
	public void imprimirFolhaPagamento(){
		System.out.println("Nome................ " + nome);
		System.out.println("Salario base...............R$ " + salBase);
		System.out.println("Comissao.................R$ " + comissao);
		System.out.println("Salario bruto......................R$ " + salBruto);
		System.out.println("---------------------------------------------------");
		System.out.println("Bonus..........................R$ " + bonus);
		System.out.println("Salario familia..................R$ " + salFamilia);
		System.out.println("-----------------------------------------------------");
		System.out.println("IRPF.................................R$ " + irpf);
		System.out.println("INSS.................................R$ " + inss);
		System.out.println("Salario liq.:...............................R$ " + salLiq + "\n");
	}
	public void calcularSalarioLiquido(){
		salLiq = salBruto - inss - irpf + bonus + salFamilia;
	}
	public void calcularSalarioFamilia(){
		if(salBruto <= 5000.40){
			salFamilia = 25.66 * numeroDeDependentes;
		}
		if(salBruto <= 7521.20){
			salFamilia = 18.08 * numeroDeDependentes; 
		}
		if(salBruto > 7521.20)
			salFamilia = 0.0;
	}
	public void calcularINSS(){
		if(salBruto <= 965.67){
			inss = salBruto * (3/100);
		}
		if(salBruto <= 1609.45){
			inss = salBruto * (5/100);
		}
		if(salBruto <= 3218.90){
			inss = salBruto * (9/100);
		}
	}
	public void calcularIRPF(){
		if(salBruto <= 1434.59){
			irpf = 0;
		}
		if(salBruto > 1434.59){
			irpf = salBruto * (7.5/100);
		}
		if(salBruto > 2150){
			irpf = salBruto * (15/100);
		}
		if(salBruto > 2866.70){
			irpf = salBruto * (22.5/100);
		}
		if(salBruto > 3582){
			irpf = salBruto * (27.5/100);
		}
	}
	public void calcularBonus(){
		if(totalVendas > 70000){
			bonus = 500;
		}
		if(totalVendas <= 70000)
			bonus = 100;
	}
	public void calcularSalarioBruto(){
		salBruto = salBase + comissao; 
	}
	public void calcularComissao(){
		if(totalVendas > 50000){
			comissao = (2/100) * totalVendas;
		}
		if(totalVendas > 100000){
			comissao = (5/100) * totalVendas;
		}
		if(totalVendas > 150000){
			comissao = (7/100) * totalVendas;	
		}			
	}
	
	String nome;
	double salBase, totalVendas;
	int numeroDeDependentes;
	double comissao, salBruto, bonus, irpf, inss, salFamilia, salLiq;
}