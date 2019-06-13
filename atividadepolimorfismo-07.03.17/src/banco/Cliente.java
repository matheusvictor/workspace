package banco;

import java.util.ArrayList;

public class Cliente {

	
	public void listarContas(){
		System.out.println(contas.toString());
	}
	
	public boolean adicionar(Conta novaConta){
		return contas.add(novaConta);
	}
	
	public boolean remover(int numero){
		for(int i = 0; i < contas.size(); i ++){
			if (contas.get(i).getNumero() == numero) {
				contas.remove(i);
				System.out.println("Conta removida!");
			}
		}
		return true;
	}
	
	public Cliente(){ //inicializando lista
		this.contas = new ArrayList<Conta>();
	}
	
	private ArrayList<Conta> contas;
}

