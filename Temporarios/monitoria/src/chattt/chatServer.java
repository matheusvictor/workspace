package chattt;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class chatServer {
	
	public chatServer(){
		ServerSocket server;
	
		
		try{
			server = new ServerSocket(5000);
			while(true){
				Socket socket = server.accept();
			}
		}catch(IOException e){}	
	}
	
	private class EscutaCliente implements Runnable{
		
		Scanner sc ;

		public EscutaCliente(Socket socket){
			try{
				sc = new Scanner(socket.getOutputStream());
			} catch(Exception e){}
		}
		public void run() {	
			String texto;
			while((texto = sc.nextLine()) != null){
				System.out.println("Recebeu:" + texto);
			}
		}
		
	}
	
	public static void main(String [] args){
		
		new chatServer();
	}

}
