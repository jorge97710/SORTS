/**
 * Esta clase tiene los 4 metodos de ordenamiento.
 * 
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * @author Jennifer Barillas,15307
 * @version 1.1.1 Julio 28, 2016
 */
public class Sorts {

	// Primer metodo GNOME SORT

	public static void GNOMESORT (Comparable[] lista)
	{
		int index=0;
		int tempVal=0;

		for ( index=1; index<lista.length;)
		{
			if (lista[index-1].compareTo(lista[index])<0)
			{
				index++;

			} 
			else
			{
				tempVal=  (int) lista[index];
				lista[index] =lista[index-1];
				lista[index-1]= tempVal;
				--index;
				if (index==0){
					index=1;
				}

			}
		}


	}

}
