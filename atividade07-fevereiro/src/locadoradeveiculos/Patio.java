package locadoradeveiculos;

public class Patio {
	
	public void listarVeiculos(){
		boolean flag = false;
		for(int i = 0; i < veiculos.length; i++){	
			if(veiculos[i] != null){
				flag = true;
				System.out.println("####################################");
				System.out.println("Numero do chassi: " + veiculos[i].getNumeroChassi());
				System.out.println("Placa: " + veiculos[i].getPlaca());
				System.out.println("Cor: " + veiculos[i].getCor());
				System.out.println("Marca: " + veiculos[i].getMarca());;
			}
		}
		if(flag == false){
			System.out.println("Nao ha veiculos cadastrados!");
		}
	}
	
	public void listarMarca(String marca){
		boolean flag = false;
		for(int i = 0; i < veiculos.length; i++){
			if(veiculos[i] != null && veiculos[i].getMarca().equals(marca)){
				System.out.println("####################################");
				System.out.println("Numero do chassi: " + veiculos[i].getNumeroChassi());
				System.out.println("Placa: " + veiculos[i].getPlaca());
				System.out.println("Cor: " + veiculos[i].getCor());
				System.out.println("Marca: " + veiculos[i].getMarca());;
				flag = true;
			}
		}
		if(flag == false){
			System.out.println("Marca inexistente ou invalida!");			
		}
	}
	
	public void excluirVeiculo(int numeroChassi){
		boolean flag = false;
		for(int i = 0; i < veiculos.length; i ++){
			if(veiculos[i] != null && veiculos[i].getNumeroChassi() == numeroChassi){
				veiculos[i] = null;
				flag = true;
				System.out.println("Veiculo excluido sucesso!");
				break;
			}
		}
		if(flag == false){
			System.out.println("Veiculo inexistente ou numero do chassi invalido!");			
		}
	}
	
	public void adicionarVeiculo(Veiculo novoVeiculo){
		int i = 0;
		for(i = 0; i < veiculos.length; i ++){
			if(veiculos[i] == null){
				veiculos[i] = novoVeiculo;
				break;
			}
		}
		if(i == veiculos.length){
			System.out.println("Limite de veiculos atingido!");
		} 
		else{
			System.out.println("Veiculo adicionado com sucesso!");
		}
	}
	
	public Patio(int qntd) {
		this.veiculos = new Veiculo[qntd];
	}


	public Veiculo[] getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(Veiculo[] veiculos) {
		this.veiculos = veiculos;
	}

	private Veiculo veiculos[];
}
