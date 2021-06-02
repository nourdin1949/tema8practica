package practica1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MetodosAProbar {
	private final static Logger LOGGER = LogManager.getLogger(MetodosAProbar.class);
	public static void main(String[] args) {
		LOGGER.info("Esto es un mensaje de informacion");
		   LOGGER.debug("This is a Debug log level message");

	}
	public double AplicarIVA (double precio) {
		precio = precio *1.21;
		
		return precio;
	}
	
	public String validar(int numero) {
		String DNI = Integer.toString(numero);
		boolean correcto = DNI.matches("[0-9]{8}");
		boolean correcto1 = DNI.matches("[0-9]{7}");
		int resto = numero % 23;
		String fin="";
		String palabra = "TRWAGMYFPDXBNJZSQVHLCKE";
		if (correcto) {
			for(int i=0; i<resto;i++) {
				fin =Character.toString(palabra.charAt(i));
			}
			DNI = DNI +fin;
		}else if(correcto1) {
			for(int i=1; i<=resto;i++) {
				fin =Character.toString(palabra.charAt(i));
			}
			DNI = "0"+DNI +fin;
		}
		return DNI;
	}
 

}
