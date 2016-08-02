import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JOptionPane;
/**
 *Esta clase se encarga de generar los numeros aleatorios. Asimismo los guarda en un archivo.
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * @author Jennifer Barillas,15307
 * @version 2.0 Julio 30, 2016 
 */

public class Azar {
	/* Atributos */
	private FileWriter fichero = null;
	private PrintWriter pw = null;
	static String textoarray="",txt="";
	static Stack<String> miStack = new Stack<String>();
	static ArrayList<String> array = new ArrayList<String>();
	
	/*Constructor*/
	public Azar() {
		super();
		// TODO Auto-generated constructor stub
	}
	 /**
    LeerContenido recibe como parametro el archivo donde estan los datos. devuelve el texto que esta en la linea. si no se encuentra el archivo muesta error
    @param archivo
  */	
	static String leerContenido(String archivo) {
		String texto="",temp="",temp2="",bfRead; 
		try{
			BufferedReader ar = new BufferedReader (new FileReader(archivo));
			while ((bfRead = ar.readLine()) != null){
				temp+=bfRead;
				temp2=bfRead;
				array.add(temp2);
			}
			texto=temp;
			//array.add(texto);
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "No se encontro archivo");
		}
		return texto;
	}
	/**
    escribirContenido se encarga de guardar numeros en un archivo de texto.
    @param no tiene
  */
	void escribirContenido(int n,String dir){
		try
		{
			fichero = new FileWriter(dir);
			pw = new PrintWriter(fichero);

			for (int i = 0; i < n; i++)
				pw.println(generarNumeros()+" ");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	/**
    generarNumeros se encarga de generar numeros random.
    @param no tiene
  */
	int generarNumeros(){

		return (int)(Math.random()*(3000-10+1)+10);
	}
}

