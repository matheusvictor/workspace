import java.util.Scanner;


public class Whatsapp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean x = true, cad = false;
		int opcao, i=0, j=0;
		PC donoPC = null;
		Celular donoC = null;
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Celular listaAmigosCel[] = new Celular[10];
		PC listaAmigosPC[] = new PC[10];
		while(x){
			System.out.println("##########################");
			System.out.println("#   DIGITE UMA OPÇÃO     #");
			System.out.println("# 1 - SE CADASTRAR       #");
			System.out.println("# 2 - ADICIONAR AMIGO    #");
			System.out.println("# 3 - CRIAR GRUPO        #");
			System.out.println("# 4 - ENVIAR MESSAGEM    #");
			System.out.println("# 5 - Adicionar no grupo #");
			System.out.println("# 6 - Remover amigo      #");
			System.out.println("# 7 - Mostrar todos amigo#");
			System.out.println("##########################");
			opcao = sc.nextInt();
			switch(opcao){
			case 1:
				if(cad == false){
				System.out.println("Você optou pelo seu cadastro");
				System.out.println("Você está usando um celular ou um PC, digite para celular e 2 para PC");
				int op = sc.nextInt();
				if(op == 1){
					System.out.println("Você optou por celular");
					System.out.println("Digite o número do celular");
					int num = sc.nextInt();
					System.out.println("Digite a operadora");
					String opera = sc2.nextLine();
					donoC = new Celular(num, opera);
					System.out.println("Cadastrado com sucesso");
					cad = true;
				}else{
					if(op==2){
						System.out.println("Você optou por PC");
						System.out.println("Digite o número do usuário");
						int num = sc.nextInt();
						System.out.println("Digite o browser que você está utilizando");
						String brow = sc2.nextLine();
						donoPC = new PC(num, brow);
						System.out.println("Cadastrado com sucesso");
						cad= true;
					}else{
						System.out.println("Você digitou uma opção errada. Realize o cadastro novamente");
					}
				}
				}else{
					System.out.println("Você já se cadastrou não é possível mais usar essa opção");
				}
				break;
			case 2:
				System.out.println("Você optou pelo seu adicionar amigo");
				System.out.println("Seu amigo é usário de celular ou um PC, digite 1 para celular e 2 para PC");
				int op = sc.nextInt();
				if(op == 1){
					System.out.println("Seu amigo tem um celular");
					System.out.println("Digite o número do celular dele");
					int num = sc.nextInt();
					System.out.println("Digite a operadora do celular dele");
					String opera = sc2.nextLine();
					Celular A1 = new Celular(num, opera);
					System.out.println("Digite o nome do seu amigo");
					A1.AlterarNome(sc2.nextLine());
					listaAmigosCel[i] = A1;
					System.out.println("Na adição: "+ listaAmigosCel[i].getNumero());
					i++;
					System.out.println("Amigos adicionado com sucesso");
				}else{
					if(op==2){
						System.out.println("Seu amigo tem um PC");
						System.out.println("Digite o número do usuário dele");
						int num = sc.nextInt();
						System.out.println("Digite o Browser do PC dele");
						String brow = sc2.nextLine();
						PC PC1 = new PC(num, brow);
						System.out.println("Digite o nome do seu amigo");
						PC1.AlterarNome(sc2.nextLine());
						listaAmigosPC[j] = PC1;
						j++;
						System.out.println("Amigos adicionado com sucesso");
					}else{
						System.out.println("Você digitou uma opção errada");
					}
				}
				break;
			case 3:
				System.out.println("Você optou por criar um grupo");
				System.out.println("Digite o nome do grupo");
				String nomeG = sc2.nextLine();
				System.out.println("Você está usando um celular ou um PC, digite 1 para celular e 2 para PC");
				int opG = sc.nextInt();
				if(opG == 1){
					Grupo g1 = new Grupo(nomeG, donoC);
				}else{
					if(opG == 2){
						Grupo g1 = new Grupo(nomeG, donoPC);
					}else{
						System.out.println("Você não digitou as opções 1 ou 2, crie o grupo novamente");
					}
				}
			break;
			case 4:
				System.out.println("Você optou por mandar uma msg para um amigo");
				System.out.println("Seu amigo é usário de celular ou um PC, digite 1 para celular e 2 para PC");
				int opM = sc.nextInt();
				if(opM == 1){
					System.out.println("Informe o número do seu amigo");
					int nA = sc.nextInt();
					System.out.println("Digite sua msg");
					String msg = sc2.nextLine();
					for(int n=0; n<i;n++){
						System.out.println("N: "+ n);
						System.out.println("nA: "+ nA);
						System.out.println("lista: "+ listaAmigosCel[n].getNumero());
						if(nA ==listaAmigosCel[n].getNumero()){
							System.out.println("Msg para: "+ listaAmigosCel[n].getNome());
							System.out.println("MSG: "+ msg);
						}
							
					}
					
				}
				break;
			case 6:
				System.out.println("Você optou por remover um amigo");
				System.out.println("Você gostaria de remover um usuário de celular ou de PC, digite 1 para celular ou 2 para PC");
				int opR = sc.nextInt();
				if(opR == 1){
					System.out.println("Informe o número do seu amigo que você quer remover");
					int nA = sc.nextInt();
					for(int n= 0; n<i ;n++){
						if(nA ==listaAmigosCel[n].getNumero()){
							i--;
							for(int p =n; p<i; p++){
								listaAmigosCel[p] = listaAmigosCel[p+1];
							}
							n=i;
						}
					}
				}else{
					//listaAmigosPC[0];
				}
				break;
			case 7:
				System.out.println("Você optou por mostrar todos os amigos");
				System.out.println("***** AMIGOD DE CELULAR******");
				for(int r=0; r<i;r++){
					System.out.println("Número: "+listaAmigosCel[r].getNumero());
					System.out.println("Nome: "+listaAmigosCel[r].getNome());
				}
				System.out.println("***** AMIGOD DE PC******");
				for(int r=0; r<j;r++){
					System.out.println("Número: "+listaAmigosPC[r].getNumero());
					System.out.println("Nome: "+listaAmigosPC[r].getNome());
				}
				break;
			case 8:
				x = false;
				break;
			default :
				System.out.println("DIGITE UMA OPÇÃO VÁLIDA");
				break;
			}
			
		}
	}

}
