import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JOptionPane;

/**
*Esta clase se encarga de ejecutar el programa.
@author Carlos Calderon, 15219
@author Jorge Azmitia,15202
@author Jennifer Barillas,15307
@version 1.3 Julio 30, 2016 
*/
public class MainSorts {
	  
	/**
		 * Ejecuta el programa.
		 */
	static String textoarray="",txt="";
    static Stack<String> miStack = new Stack<String>();
static ArrayList<String> array = new ArrayList<String>();


	
	static String leerContenido(String archivo) {
		String texto="",temp="",bfRead; 
		try{
			BufferedReader ar = new BufferedReader (new FileReader(archivo));
			while ((bfRead = ar.readLine()) != null){
				temp+=bfRead;
			}
			texto=temp;
array.add(texto);
}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "No se encontro archivo");
		}
		return texto;
	}
	
	 public static void main(String[] args) { 
		 Azar az = new Azar();
		 az.escribirContenido(); 
		 
		 
		 System.out.println("Bienvenido al programa, ingrese la direccion donde esta el archivo");
	     Scanner sc = new Scanner(System.in);
	     String dir= sc.next();
	     leerContenido(dir);  
		 Sorts q = new Sorts();
	     Integer [] lista = new Integer[array.size()];
	     
	     for (int i=0;0<=array.size();i++)
	     {
	    	 lista[i]=Integer.parseInt(array.get(i));
	    	 
	     }

		// -------------------------------Integer[] ia = {30,1000,0, 20, 10, 5, 6, 99};
	     //quickSORT
		// Sorts.qsort(lista, 0, lista.length-1);
	     //GNOMESORT
		// Sorts.GNOMESORT(lista);
	    // Sorts.mergeSort(lista);
	     //   for(Integer i: ia) {
	     //       System.out.println(i);
	     //   }
		 
		 /* Merge
			Integer[] a = {30,1000,0, 20, 10, 5, 6, 99};
	                mergeSort(a);
			System.out.println(Arrays.toString(a));*/
	 } 
}
