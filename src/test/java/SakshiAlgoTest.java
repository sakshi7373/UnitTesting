package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class SakshiAlgoTest {

	// Task 2.2
	//Test Sequences for Bubble Sort

	// Bubble Sort testing for 1)node,2)edge,3)condition coverage
	@Test
	public void sakshigautamBubblesort(){
		int[] arraylist = {8,5,2,3,4,1};
		Item[] elements = new Item[6];
		for (int i = 0; i < arraylist.length; i++)
			elements[i] = new Item(arraylist[i]);

		int[] sortList = {1,2,3,4,5,8};
		Item[] arraySorted = new Item[6];
		for (int i = 0; i < sortList.length; i++)
			arraySorted[i] = new Item(sortList[i]);
		
		SortAlgos.bubbleSort(elements);
		for (int j = 0; j < elements.length; j++)
			assertTrue("The array is sorted using Bubble sort",elements[j].key == arraySorted[j].key);
	}
	// Bubble Sort testing for condition coverage
	@Test(expected=java.lang.NullPointerException.class)
	public void testBubbleEmptyarray() {
		Item[] emptyArray = null;
		SortAlgos.bubbleSort(emptyArray);
		assertTrue("The array is sorted since it is empty",emptyArray == null);
	}
	
	
	// For null array , condition coverage cases
	@Test(expected=java.lang.NullPointerException.class)
	public void testSelectionEmptyarray() {
		Item[] emptyArr = null;
		SortAlgos.selectionSort(emptyArr);
	}
	
	@Test(expected=java.lang.NullPointerException.class)
	public void testInsertionEmptyarray() {
		Item[] emptyArr = null;
		SortAlgos.insertionSort(emptyArr);
	}
	
	@Test(expected=java.lang.NullPointerException.class)
	public void testMergeEmptyarray() {
		Item[] emptyArr = null;
		SortAlgos.mergeSort(emptyArr);
	}
	
	@Test(expected=java.lang.NullPointerException.class)
	public void testQuickEmptyarray() {
		Item[] emptyArr = null;
		SortAlgos.quickSort(emptyArr);
	}
	
	@Test(expected=java.lang.NullPointerException.class)
	public void testHeapEmptyItem() {
		Item[] emptyArr = null;
		SortAlgos.heapSort(emptyArr);
	}
	
	// All NonNull Unsorted: NODE, EDGE, COVERAGE cases
	@Test
	public void testingSelectionsort(){
		int[] arraylist = {8,5,2,3,4,1};
		Item[] elements = new Item[6];
		for (int i = 0; i < arraylist.length; i++)
			elements[i] = new Item(arraylist[i]);

		int[] sortList = {1,2,3,4,5,8};
		Item[] arraySorted = new Item[6];
		for (int i = 0; i < sortList.length; i++)
			arraySorted[i] = new Item(sortList[i]);
		
		SortAlgos.selectionSort(elements);
		for (int j = 0; j < elements.length; j++)
			assertTrue("The array is sorted",elements[j].key == arraySorted[j].key);
	}
	
	@Test
	public void testingInsertionsort(){
		int[] arraylist = {8,5,2,3,4,1};
		Item[] elements = new Item[6];
		for (int i = 0; i < arraylist.length; i++)
			elements[i] = new Item(arraylist[i]);

		int[] sortList = {1,2,3,4,5,8};
		Item[] arraySorted = new Item[6];
		for (int i = 0; i < sortList.length; i++)
			arraySorted[i] = new Item(sortList[i]);
		
		SortAlgos.insertionSort(elements);
		for (int j = 0; j < elements.length; j++)
			assertTrue("The array is sorted",elements[j].key == arraySorted[j].key);
	}
	
	@Test
	public void testingMergesort(){
		int[] arraylist = {8,5,2,3,4,1};
		Item[] elements = new Item[6];
		for (int i = 0; i < arraylist.length; i++)
			elements[i] = new Item(arraylist[i]);

		int[] sortList = {1,2,3,4,5,8};
		Item[] arraySorted = new Item[6];
		for (int i = 0; i < sortList.length; i++)
			arraySorted[i] = new Item(sortList[i]);
		
		SortAlgos.mergeSort(elements);
		for (int j = 0; j < elements.length; j++)
			assertTrue("The array is sorted",elements[j].key == arraySorted[j].key);
	}
	
	@Test
	public void testingQuicksort(){
		int[] arraylist = {8,5,2,3,4,1};
		Item[] elements = new Item[6];
		for (int i = 0; i < arraylist.length; i++)
			elements[i] = new Item(arraylist[i]);

		int[] sortList = {1,2,3,4,5,8};
		Item[] arraySorted = new Item[6];
		for (int i = 0; i < sortList.length; i++)
			arraySorted[i] = new Item(sortList[i]);
		
		SortAlgos.quickSort(elements);
		for (int j = 0; j < elements.length; j++)
			assertTrue("The array is sorted",elements[j].key == arraySorted[j].key);
	}
	
	@Test
	public void testingHeapsort(){
		int[] arraylist = {8,5,2,3,4,1};
		Item[] elements = new Item[6];
		for (int i = 0; i < arraylist.length; i++)
			elements[i] = new Item(arraylist[i]);

		int[] sortList = {1,2,3,4,5,8};
		Item[] arraySorted = new Item[6];
		for (int i = 0; i < sortList.length; i++)
			arraySorted[i] = new Item(sortList[i]);
		
		SortAlgos.heapSort(elements);
		for (int j = 0; j < elements.length; j++)
			assertTrue("The array is sorted",elements[j].key == arraySorted[j].key);
	}

	
}
