package day10;

public class selectSort {
	public static void selectSort(int[] numbers) {
		int size = numbers.length;
		int temp =0;
		for(int i=0;i<size;i++) {
			int k = i;
			for(int j=size-1;j>i;j--) {
				if(numbers[j] < numbers[k]) {
					k=j;
				}
			}
			temp = numbers[i];
			numbers[i] = numbers[k];
			numbers[k] = temp;
		}
	}

}
