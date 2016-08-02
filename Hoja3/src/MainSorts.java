import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JOptionPane;

/**
 *Esta clase se encarga de ejecutar el programa.
@author Carlos Calderon, 15219
@author Jorge Azmitia,15202
@author Jennifer Barillas,15307
@version 2.0 Julio 30, 2016 
 */
public class MainSorts {

		 private static int n=0,opc=0;
		 private static String dir;
		 private static Integer [] lista;
	/**
		 * Ejecuta el programa.
		 */
		 public static void menu () {
			 // Instanciar la clase azar para generar los numeros
			 Azar az = new Azar();
			 System.out.println("Bienvenido al programa, ingrese la direccion donde esta el archivo");
			 // Instaciar la clase Sorts para hacer las pruebas
			 Sorts q = new Sorts();
			 //Instanciar clase Scanner para leer ingresos
			 Scanner sc = new Scanner(System.in);
			 dir= sc.next();
			 System.out.println("Ingrese la cantidad de numeros que quiere ordenar");
			 n= sc.nextInt();
			 az.escribirContenido(n,dir);
			 Azar.leerContenido(dir);  
			 lista = new Integer[Azar.array.size()];
			 for (int i=0;i<Azar.array.size();i++)
			 {
				 lista[i]=Integer.parseInt(Azar.array.get(i).trim());
			 }
			 System.out.println("Seleccione el algoritmo preferido");
			 
			 while(opc!=5){
				 System.out.println("1.Gnome , 2. Merge , 3. Quick, 4. Radix, 5. Salir"); 
				 opc=sc.nextInt();
				 switch(opc) {
				 case 1: 
					 Sorts.gnomeSort(lista);
					 for(Integer i: lista) {
						 System.out.println(i);
					 }
					 break;
				 case 2: 
					 Sorts.mergeSort(lista);
					 for(Integer i: lista) {
						 System.out.println(i);
					 }
					 break;
				 case 3: 
					 Sorts.qSort(lista, 0, lista.length-1);
					 for(Integer i: lista) {
						 System.out.println(i);
					 }
					 break;
				 case 4: 
					 Sorts.radixSort(lista);
					 for(Integer i: lista) {
						 System.out.println(i);
					 }
					 
					 break;
				 case 5:
					 System.out.println("Gracias por usar el programa");
					 break;
				 default: 
					 System.out.println("Escoga un no valido");
					 break;
				 }
			 }
		 }

	public static void main(String[] args) { 
		
		menu();
	} 
}
