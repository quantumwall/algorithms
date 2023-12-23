package algorithms.simple_sort;

import java.util.Random;

public class SimpleSortRunner {
    
    public static void main(String[] args) {
//	int length = 100_000;
	int length = 10;
	var arr = new ArrayInsertion(length);
//	fillArrayReverse(arr, length);
	arr.insert(23);
	arr.insert(15);
	arr.insert(10);
//	arr.insert(7);
//	System.out.println("sorting");
//	long start = System.currentTimeMillis();
//	arr.sort();
//	long end = System.currentTimeMillis();
//	System.out.println("finish");
//	System.out.printf("Execution time %d\n", end  - start);
//	arr.display();
	System.out.println(arr.median());
    }
    
    private static void fillArrayRandom(Array arr, int length) {
	var random = new Random();
	for (int i = 0; i < length; i++) {
	    arr.insert(random.nextInt(500));
	}
    }
    
    private static void fillArrayReverse(Array arr, int length) {
	for (int i = length - 1; i >= 0; i--) {
	    arr.insert(i);
	}
    }
    
    private static void fillArraySorted(Array arr, int length) {
	for (int i = 0; i < length; i++) {
	    arr.insert(i);
	}
    }
}
