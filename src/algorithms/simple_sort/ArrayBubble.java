package algorithms.simple_sort;

public class ArrayBubble extends Array {

    public ArrayBubble(int length) {
	super(length);
    }

    public void bubbleSort() {

    }

    @Override
    public void sort() {
	int right = size - 1;
	int left = 0;
	for (; right > 0; right--, left++) {
	    int inner = left;
	    for (; inner < right; inner++) {
		if (arr[inner] > arr[inner + 1]) {
		    swap(inner, inner + 1);
		}
	    }
	    for (; inner > left; inner--) {
		if (arr[inner] < arr[inner - 1]) {
		    swap(inner, inner - 1);
		}
	    }
	}
    }
//    @Override
//    public void sort() {
//	for (int i = size - 1; i > 0; i--) {
//	    for (int j = 0; j < i; j++) {
//		if (arr[j] > arr[j + 1]) {
//		    swap(j, j + 1);
//		}
//	    }
//	}
//    }
}
