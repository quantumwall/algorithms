package algorithms.simple_sort;

public class ArrayBubble extends Array {

    public ArrayBubble(int length) {
	super(length);
    }

    public void bubbleSort() {

    }

    @Override
    public void sort() {
	for (int i = size - 1; i > 0; i--) {
	    for (int j = 0; j < i; j++) {
		if (arr[j] > arr[j + 1]) {
		    swap(j, j + 1);
		}
	    }
	}
    }
}
