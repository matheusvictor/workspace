package empregado.metodo;

public class Main {

	public static void main(String[] args) {
		
		Empregado e1 = new Empregado ("Matheus", "000-01");
		
		e1.setSalario(1000);
		
		System.out.println("Nome do 1º empregado: " + e1.getNome());
		System.out.println("RG do 1º empregado: " + e1.getRg());
		System.out.println("Departamento: " + e1.getDepartamento());
		System.out.println("Salario: R$ " + e1.getSalario());
		
		Empregado e2 = new Empregado ();
		e2.setRg("000-02");
		e2.setSalario(200);
		
		System.out.println("\nNome do 2º empregado: " + e2.getNome());
		System.out.println("RG do 2º empregado: " + e2.getRg());
		System.out.println("Departamento: " + e2.getDepartamento());
		System.out.println("Salario: R$ " + e2.getSalario());
		
		Empregado e3 = new Empregado ();
		e3.setNome("Alguem"); //Apesar do nome estar pre-definido como Fulano na classe Empregado, 
							 //é possivel substitui-lo por outro no Main
		e3.setRg("000-03");
		
		System.out.println("\nNome do 3º empregado: " + e3.getNome());
		System.out.println("RG do 3º empregado: " + e3.getRg());
		System.out.println("Departamento: " + e3.getDepartamento());
		System.out.println("Salario: R$ " + e3.getSalario());
	}

}

