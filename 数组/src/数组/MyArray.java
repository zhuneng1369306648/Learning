package สýื้;

public class MyArray {
	private long[] arr;
	private int elements;
	public MyArray() {
		arr = new long[50];
	}
	public MyArray(int maxsize) {
		arr = new long[maxsize];
	}
	public void insert(long value) {
		arr[elements] = value;
		elements++;
	}
	public void display() {
		System.out.println("[");
		for(int i=0;i<elements;i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("]");
	}
	public int search(long value) {
		int i;
		for( i=0;i<elements;i++) {
			if(value == arr[i]) {
				break;
			}
		}
		if(i==elements) {
			return -1;
		}else {
			return i;
		}
		
	}
	public long get(int index) {
		if(index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}else {
			return arr[index];
		}
	}

}
