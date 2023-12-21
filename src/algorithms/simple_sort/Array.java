package algorithms.simple_sort;

public abstract class Array {

    protected long[] arr;
    protected int size;
    
    public Array(int length) {
	arr = new long[length];
    }
    
    public void insert(long value) {
	arr[size++] = value;
    }
    
    public void display() {
	for (int i = 0; i < size; i++) {
	    System.out.println(arr[i]);
	}
    }
    
    public abstract void sort();
    
    protected void swap(int one, int two) {
	long temp = arr[one];
	arr[one] = arr[two];
	arr[two] = temp;
    }
}
