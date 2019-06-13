package segundo.exercicio;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Veiculo car[] = new Carro[2];
		Veiculo moto[] = new Moto[2];
		
		int opc;
		int i = 0;
		
		do{
			System.out.println("\nDigite a opçao desejada:");
			System.out.println("1 - Cadastrar carro.");
			System.out.println("2 - Cadastrar moto");
			System.out.println("3 - Retirada.");
			System.out.println("4 - Sair");
			opc = sc.nextInt();
			
			while(opc < 1 || opc > 4){
				System.out.println("Tente novamente!");
				opc = sc.nextInt();
			}
			
			if(opc == 4){
				System.out.println("Programa encerrado!");
				System.exit(0);
			}
			
			if(opc == 1){
				for(i = 0; i < car.length; i ++){
					if(car[i] == null){
						car[i] = new Carro();
						System.out.println("Digite a placa do veiculo:");
						car[i].setPlaca(sc.next());
						System.out.println("Digite a cor do veiculo:");
						car[i].setCor(sc.next());
						System.out.println("Data de apreensao:");
						car[i].setDataApreensao(sc.next());
						System.out.println("Veiculo cadastrado com sucesso!");
						break;
					}
				}
				
				if(i == car.length){ //Se o contador atingir o limite e nao houver local vazio no vetor...
					System.out.println("Erro! Limite atingido!");
				}
			}
			
			if(opc == 2){
				for(i = 0; i < moto.length; i ++){
					if(moto[i] == null){
						moto[i] = new Carro();
						System.out.println("Digite a placa do veiculo:");
						moto[i].setPlaca(sc.next());
						System.out.println("Digite a cor do veiculo:");
						moto[i].setCor(sc.next());
						System.out.println("Data de apreensao:");
						moto[i].setDataApreensao(sc.next());
						System.out.println("Veiculo cadastrado com sucesso!");
						break;
					}
				}
				
				if(i == moto.length){ //Se o contador atingir o limite e nao houver local vazio no vetor...
					System.out.println("Erro! Limite atingido!");
				}
			}
			
			if(opc == 3){
				int opc2;
				System.out.println("Digite o tipo do veiculo.");
				System.out.println("1 - Carro");
				System.out.println("2 - Moto");
				opc2 = sc.nextInt();
				
				while(opc2 < 1 || opc2 > 2){
					System.out.println("Tente novamente!");
					opc2 = sc.nextInt();
				}
				
				switch (opc2){
				case 1: 
					if(car[i] != null){
						System.out.println("\nAutorizado para liberaçao:" + car[i].Autorizada());
						System.out.println("Digite a data de retirada:");
						car[i].setDataRetirado(sc.next());
						System.out.println("Veiculo retirado com sucesso! Confira dos dados:");
						System.out.println("Placa do veiculo: " + car[i].getPlaca());
						System.out.println("Cor do veiculo: " + car[i].getCor());
						System.out.println("Data de apreensao: " + car[i].getDataApreensao());
						System.out.println("Data de retirada: " + car[i].getDataRetirado());
					}
					break;
					
				case 2:
					if(moto[i] != null){
						System.out.println("\nAutorizado para liberaçao:" + moto[i].Autorizada());
						System.out.println("Digite a data de retirada:");
						moto[i].setDataRetirado(sc.next());
						System.out.println("Veiculo retirado com sucesso! Confira dos dados:");
						System.out.println("Placa do veiculo: " + moto[i].getPlaca());
						System.out.println("Cor do veiculo: " + moto[i].getCor());
						System.out.println("Data de apreensao: " + moto[i].getDataApreensao());
						System.out.println("Data de retirada: " + moto[i].getDataRetirado());
					}
					break;
					
				default: System.out.println("\nOpçao invalida!");
				
				}

			}
			

			
		}while(opc != 4);
		
		
		
			}

}
