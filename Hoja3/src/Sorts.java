import java.util.ArrayList;

/**
 * Esta clase tiene los 4 metodos de ordenamiento.
 * 
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * @author Jennifer Barillas,15307
 * @version 2.0 Julio 30, 2016 
 */
public class Sorts {

	/**
    gnomeSort se encarga ordenar numeros. 
    Codigo inspirado en: https://rosettacode.org/wiki/Sorting_algorithms/Gnome_sort y 
    http://panthema.net/2013/sound-of-sorting.
    @param lista tipo Comparable.
	 */
	public static void gnomeSort (Comparable[] lista){
		int index=0;
		Comparable tempVal=0;
		for ( index=1; index<lista.length;){
			if (lista[index-1].compareTo(lista[index])<0){
				index++;
			} 
			else{
				tempVal=  lista[index];
				lista[index] =lista[index-1];
				lista[index-1]= tempVal;
				--index;
				if (index==0){
					index=1;
				}
			}
		}
	}


	/**
    mergeSort se encarga ordenar numeros. 
    Codigo inspirado en: Carnegie mellon university
    @param a tipo Comparable.
	 */
	public static void mergeSort(Comparable [ ] a){
		Comparable[] tmp = new Comparable[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}

	/**
    mergeSort se encarga ordenar numeros. 
    Codigo inspirado en: Carnegie mellon university
    @param a,tmp tipo Comparable. left y right tipo int.
	 */
	private static void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}
	/**
    mergeSort se encarga ordenar numeros. 
    Codigo inspirado en: Carnegie mellon university
    @param a,tmp tipo Comparable. left,right y rightEnd tipo int.
	 */
	private static void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd ){

		int leftEnd = right - 1;
		int k = left;
		int num = rightEnd - left + 1;

		while(left <= leftEnd && right <= rightEnd)
			if(a[left].compareTo(a[right]) <= 0)
				tmp[k++] = a[left++];
			else
				tmp[k++] = a[right++];

		while(left <= leftEnd)    // Copy rest of first half
			tmp[k++] = a[left++];

		while(right <= rightEnd)  // Copy rest of right half
			tmp[k++] = a[right++];

		// Copy tmp back
		for(int i = 0; i < num; i++, rightEnd--)
			a[rightEnd] = tmp[rightEnd];
	}

	/**
    qSort se encarga ordenar numeros. De forma recursiva.
    Codigo inspirado en: 
    @param arr tipo Comparable. a,b tipo int.
	 */
	public static void qSort(Comparable[] arr, int a, int b) {
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

			qSort(arr, a, j);
			qSort(arr, i, b);
		}
	}
	/**
    radixSort se encarga ordenar numeros.
    Codigo inspirado en:  http://www.sanfoundry.com/java-program-implement-radix-sort/
    @param list tipo Comparable
	 */
	public static void radixSort(Comparable[] a) {

		int i, m = (int) a[0], exp = 1, n = a.length;
		int[] b = new int[a.length];
		for (i = 1; i < n; i++)
			if (a[i].compareTo(m) > 0)
				m = (int) a[i];
		while (m / exp > 0)
		{
			int[] bucket = new int[10];

			for (i = 0; i < n; i++)
				bucket[((int)a[i] / exp) % 10]++;
			for (i = 1; i < 10; i++)
				bucket[i] += bucket[i - 1];
			for (i = n - 1; i >= 0; i--)
				b[--bucket[((int)a[i] / exp) % 10]] = (int)a[i];
			for (i = 0; i < n; i++)
				a[i] = b[i];
			exp *= 10;        
		}
	}

}
