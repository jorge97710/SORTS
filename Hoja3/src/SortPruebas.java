import static org.junit.Assert.*;

import org.junit.Test;

public class SortPruebas {

	@Test
	public void testGnomeSort() {
		Sorts s = new Sorts();

		Integer[] inicio = { 5, 4, 6, 3, 1 };

		Integer[] resul = { 1, 3, 4, 5, 6 };
		s.gnomeSort(inicio);
		if (inicio == resul) {
			assertEquals(1, 1);
		}

	}

	@Test
	public void testMergeSort() {
		Sorts s = new Sorts();

		Integer[] inicio = { 5, 4, 6, 3, 1 };
		Integer[] resul = { 1, 3, 4, 5, 6 };
		s.mergeSort(inicio);
		if (inicio == resul) {
			assertEquals(1, 1);
		}

	}

	@Test
	public void testQSort() {
		Sorts s = new Sorts();

		Integer[] inicio = { 5, 4, 6, 3, 1 };
		Integer[] resul = { 1, 3, 4, 5, 6 };
		// assertEquals(15, tester.addition(5, 10));
		s.qSort(inicio, 5, 1);
		if (inicio == resul) {
			assertEquals(1, 1);
		}

	}

	@Test
	public void testRadixSort() {
		Sorts s = new Sorts();

		Integer[] inicio = { 5, 4, 6, 3, 1 };
		Integer[] resul = { 1, 3, 4, 5, 6 };
		// assertEquals(15, tester.addition(5, 10));
		s.radixSort(inicio);
		if (inicio == resul) {
			assertEquals(1, 1);
		}

	}

}
