package questoes;
import java.util.*;
public class Questao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		 int numero =  0;
		 int n = 0;
				 
		 while (n >= 0) {
			 
		 System.out.println("\nDigite um numero inteiro qualquer.");
		 numero = sc.nextInt();
	
		 switch (numero){
		 case 1 : System.out.println("O numero 1 nao eh primo"); continue;
		 }
		 				 
		 if (numero == -1){
			 System.out.println("Programa encerrado!");
			 System.exit(0);
		 }
		 		 
		 boolean teste = false;
		 
		 for (int divisor = 2; divisor < numero; divisor ++){
			 			 
			 if (numero % divisor == 0){
			//Se o resto da divisao do numero pelo divisor atual (que sempre sera somado +1 e sempre semra menor q o numero)
			//a variavel booleana passa a ser true, mudando a condiçao atual
				 teste = true ;
			 }
		
		 } 
		 
		if (teste == true){
		     System.out.println("O numero " + numero + " nao eh primo.");
			 }
			 
	     else {
			 System.out.println("O numero " + numero + " eh primo");
			 }			 
	
		 }
		 
			sc.close();
}
	}

 
 

  /** int numPrimo;
 int numDivisor = 0;
 
 System.out.println("Digite um numero inteiro qualquer e que seja maior do que -1.");
 numPrimo = sc.nextInt();
  
  for (int i = 0; i >= numPrimo; i ++){
  
  if (numPrimo % i == 0){
  numDivisor ++;
  }
  		}
  
  if (numDivisor == 2){
  System.out.println("Numero primo");
  }
  
  else {
  System.out.println("Nao primo");
  }
  
  }
  
	}

		  int numero, resto;
		  int  elemesmo = 0, contador = 0; 
	        
	    	System.out.println("Digite um numero: ");    
	        numero = sc.nextInt();    
	            
	          while (numero >= elemesmo){
	        //Enquanto o numero digitado for maior ou igual a ele mesmo, sera acrescentado +1 à variavel
	          ++elemesmo;  
	               
	         resto = numero % elemesmo;
	         //
	               
	             if ( resto == 0){  
	                     contador++;  
	             }  
	           
	               
	          }
	          
	                   
	          if (contador <= 2)   {
	        	  //Se o contador for menor ou igual a dois e o resto for zero...
	           System.out.println("O Número "+numero+" é primo");  
	          }
	          
	          else {  
	             System.out.println("Numéro "+numero+" não é primo");  
	          }           
	}
} 
*/