package estudos.simples;
import java.util.*;
public class MediaEscolar {

	public static void main(String[] args) {
						
				String nome, disciplina;
				double nota1, nota2 = 0;
				
				Scanner sc = new Scanner (System.in);
				
				System.out.println("Ola, usuario, bem-vind@ ao portal do aluno.");
				System.out.println("Digite o seu nome, por favor.");
				nome = sc.nextLine();
				
				System.out.println(nome  + ", digite o nome da disciplina em que deseja entrar com as notas.");
				disciplina = sc.nextLine();
				
				System.out.println("Digite a sua primeira nota.");
				nota1 = sc.nextDouble();
				
				System.out.println("Digite a sua segunda nota.");
				nota2 = sc.nextDouble();
				
				sc.close();
				
				double media = (nota1+nota2)/2;
				
				if ((media <= 10) && (media >= 9)){
					System.out.println(" ");
					System.out.println("Nome do aluno: " + nome);
					System.out.println("Disciplina: " + disciplina);
					System.out.println("Primeira nota: " + nota1);
					System.out.println("Segunda nota: " + nota2);
					System.out.println("Media: " + media);
					System.out.println("Conceito: A");
					System.out.println("APROVADO!");
				}
				
				else if ((media >= 7.5) && (media <= 9)){
					System.out.println(" ");
					System.out.println("Nome do aluno: " + nome);
					System.out.println("Disciplina: " + disciplina);
					System.out.println("Primeira nota: " + nota1);
					System.out.println("Segunda nota: " + nota2);
					System.out.println("Media: " + media);
					System.out.println("Conceito: B");
					System.out.println("APROVADO!");
				}
				
				else if ((media >= 6) && (media <= 7.5)){
					System.out.println(" ");
					System.out.println("Nome do aluno: " + nome);
					System.out.println("Disciplina: " + disciplina);
					System.out.println("Primeira nota: " + nota1);
					System.out.println("Segunda nota: " + nota2);
					System.out.println("Media: " + media);
					System.out.println("Conceito: C");
					System.out.println("APROVADO!");
				}
				
				else if ((media >= 4) && (media <= 6)){
					System.out.println(" ");
					System.out.println("Nome do aluno: " + nome);
					System.out.println("Disciplina: " + disciplina);
					System.out.println("Primeira nota: " + nota1);
					System.out.println("Segunda nota: " + nota2);
					System.out.println("Media: " + media);
					System.out.println("Conceito: D");
					System.out.println("REPROVADO!");
				}
				
				else if ((media <= 4) && (media >= 0)){
					System.out.println(" ");
					System.out.println("Nome do aluno: " + nome);
					System.out.println("Disciplina: " + disciplina);
					System.out.println("Primeira nota: " + nota1);
					System.out.println("Segunda nota: " + nota2);
					System.out.println("Media: " + media);
					System.out.println("Conceito: E");
					System.out.println("REPROVADO!");
				}
			}
		}