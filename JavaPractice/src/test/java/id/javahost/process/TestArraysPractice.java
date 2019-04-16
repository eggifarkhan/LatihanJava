package id.javahost.process;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArraysPractice {

	@Test
	public void testCyclicArray() {
		int[] test1 = {3,8,9,7,6};
		int[] hasil1 = {9,7,6,3,8};
		int pengali1 = 3;
		
		int[] test2 = {0,0,0};
		int[] hasil2 = {0,0,0};
		int pengali2 = 1;
		
		int[] test3 = {1,2,3,4};
		int[] hasil3 = {1,2,3,4};
		int pengali3 = 4;
//		fail("Not yet implemented");
		assertArrayEquals("test case 1", hasil1,ArraysPractice.cyclicArray(test1, pengali1));
		assertArrayEquals("test case 2", hasil2,ArraysPractice.cyclicArray(test2, pengali2));
		assertArrayEquals("test case 3", hasil3,ArraysPractice.cyclicArray(test3, pengali3));
	}
	
//	@Test
//	public void testMain() {
//		String[] test1 = {"[3,8,9,7,6]","3"};
//		String hasil1 = "[9,7,6,3,8]";
////		fail("Not yet implemented");
//		assertEquals("positive case", hasil1,ArraysPractice.main(test1));
//		asser
//	}

}
