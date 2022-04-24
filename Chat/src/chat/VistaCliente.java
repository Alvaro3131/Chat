package chat;

import java.io.BufferedReader;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;



public class VistaCliente implements Observer {
 Servidor server;
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(((String) arg));
		System.out.println("Hola");
	}
	
	public VistaCliente(Servidor server) {
		this.server=server;
	}
	public static void main(String[] args) {
		try {
			Scanner sn = new Scanner(System.in);
			System.out.println("Cuel es su nombre:");
			String nombre=sn.next();
		    Cliente cliente = new Cliente(6000);
		    
		    
		    
		            while(true) {
		            	String mensaje=sn.next();
			            cliente.enviarMensaje(nombre + " --> " + mensaje + "\n");
			            VistaServidor sv= new VistaServidor();
			            Servidor s= new Servidor();
			            s.addObserver(sv);
			            s.setVistaServidor(sv);
				        
			            
			            
			            
		            }
		} catch (Exception e) {
			// TODO: handle exception
		}
	          
	            
		
	}
}
