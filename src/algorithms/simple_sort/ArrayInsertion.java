package algorithms.simple_sort;

public class ArrayInsertion extends Array{

    public ArrayInsertion(int length) {
	super(length);
    }

    @Override
    public void sort() {
	if (size < 2) return;
	for (int i = 1; i < size; i++) {
	    long temp = arr[i];
	    int inn = i;
	    while (inn > 0 && arr[inn - 1] >= temp) {
		arr[inn] = arr[inn - 1];
		inn--;
	    }
	    arr[inn] = temp;
	}
    }

}
