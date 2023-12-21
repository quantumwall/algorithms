package algorithms.simple_sort;

public class ArraySelection extends Array {

    public ArraySelection(int length) {
	super(length);
    }
    @Override
    public void sort() {
	if (size < 2)
	    return;
	for (int i = 0; i < size - 1; i++) {
	    int indexOfMin = i;
	    for (int j = i + 1; j < size; j++) {
		if (arr[indexOfMin] > arr[j]) {
		    indexOfMin = j;
		}
	    }
	    super.swap(i, indexOfMin);
	}

    }
}
