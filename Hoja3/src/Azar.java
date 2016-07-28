import java.io.*;
import javax.swing.JOptionPane;
/**
 *Esta clase se encarga de generar los numeros aleatorios. Asimismo los guarda en un archivo.
@author Carlos Calderon, 15219
@author Jorge Azmitia,15202
@author Jennifer Barillas,15307
@version 1.1.1 Julio 28, 2016 
 */
public class Azar {
	/* Atributos */
	private FileWriter fichero = null;
	private PrintWriter pw = null;


	public Azar() {
		super();
		// TODO Auto-generated constructor stub
	}
	String leerContenido(String archivo) {
		String texto="",temp="",bfRead; 
		try{
			BufferedReader ar = new BufferedReader (new FileReader(archivo));
			while ((bfRead = ar.readLine()) != null){
				temp+=bfRead;
			}
			texto=temp;
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "No se encontro archivo");
		}
		return texto;
	}
	void escribirContenido(){
		try
		{
			fichero = new FileWriter("C:\\Users\\Carlos\\Desktop\\txt\\hola2.txt");
			pw = new PrintWriter(fichero);

			for (int i = 0; i < 10; i++)
				pw.print(generarNumeros()+",");

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
	int generarNumeros(){

		return (int)(Math.random()*(3000-10+1)+10);
	}
}

