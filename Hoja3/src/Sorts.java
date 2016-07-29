/**
 * Esta clase tiene los 4 metodos de ordenamiento.
 * 
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * @author Jennifer Barillas,15307
 * @version 1.2 Julio 28, 2016
 */
public class Sorts {

	// Primer metodo GNOME SORT

	public static void GNOMESORT (Comparable[] lista){
		int index=0;
		int tempVal=0;
		for ( index=1; index<lista.length;){
			if (lista[index-1].compareTo(lista[index])<0){
				index++;
			} 
			else{
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
	   public static void qsort(Comparable[] arr, int a, int b) {
	        if (a < b) {
	            int i = a, j = b;
	            Comparable x = arr[(i + j) / 2];

	            do {
	                while (arr[i].compareTo(x) < 0) i++;
	                while (x.compareTo(arr[j]) < 0) j--;

	                if ( i <= j) {
	                    Comparable tmp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = tmp;
	                    i++;
	                    j--;
	                }

	            } while (i <= j);

	            qsort(arr, a, j);
	            qsort(arr, i, b);
	        }
	    }

}
