package terceiro.exercicio;

public class Cavalo extends Animal{
	

	public void Acao(Animal a){
		a.setAçao("Correr");
	}
	
	public String EmitirSom(){
		return "Animal relichando.";
	}

}
