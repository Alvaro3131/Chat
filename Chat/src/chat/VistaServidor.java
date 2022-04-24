package chat;

import java.net.Socket;
import java.util.Observable;
import java.util.Observer;





public class VistaServidor implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(((String) arg));
		
	}
	
	public static void main(String[] args) {
		
		    try {
		    	Servidor server = new Servidor(6000);
		        
		        Thread t = new Thread(server);
		        t.start();
		        VistaServidor sv = new VistaServidor();
			    server.addObserver(sv);
			    server.setVistaServidor(sv);
			       
			     
			        
		        
		        	        
			} catch (Exception e) {
				// TODO: handle exception
			}
	        
	        
	        
	        
	        
	        
	        
	}
	
	

	public void notificarConexion(String msj){
		System.out.println(msj+"\n");
    }

}
