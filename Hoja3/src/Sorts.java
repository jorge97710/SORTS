/**
 * Esta clase tiene los 4 metodos de ordenamiento.
 * 
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * @author Jennifer Barillas,15307
 * @version 1.3 Julio 30, 2016 
 */
public class Sorts {

	// Primer metodo GNOME SORT

	public static void GNOMESORT (Comparable[] lista){
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
	   
	   
	   public static void mergeSort(Comparable [ ] a){
           Comparable[] tmp = new Comparable[a.length];
           mergeSort(a, tmp,  0,  a.length - 1);
}
	   
	   
	   private static void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right)
       {
               if( left < right )
               {
                       int center = (left + right) / 2;
                       mergeSort(a, tmp, left, center);
                       mergeSort(a, tmp, center + 1, right);
                       merge(a, tmp, left, center + 1, right);
               }
                // metodo tomado de: Carnegie mellon university
   }
	   
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

}
