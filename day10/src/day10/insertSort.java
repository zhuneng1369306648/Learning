package day10;

public class insertSort {
	public static void insertSort(int[] numbers) {
		int size = numbers.length;
		int temp = 0;
		int j = 0;
		for(int i=0;i<size;i++) {
			temp = numbers[i];
			for(j=i;j>0&& temp < numbers[j-1];j--) {
				numbers[j] = numbers[j-1];
			}
			numbers[j] = temp;
		}
	}

}
