package algorithms.simple_sort;

public class SimpleSortRunner {
    
    public static void main(String[] args) {
	var arr = new ArrayInsertion(10);
	arr.insert(23);
	arr.insert(2);
	arr.insert(45);
	arr.insert(120);
	arr.insert(-1);
	arr.insert(5);
	arr.insert(10);
	arr.sort();
	arr.display();
    }
}
