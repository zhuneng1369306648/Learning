package day10;

public class bubbleSort {
	public static void bubbleSort(int[] numbers) {
		int temp = 0;
		int size = numbers.length;
		for(int i = 0;i<size-1;i++) {
			for(int j = 0;j<size-i-1;j++) {
				if(numbers[j] > numbers[j+1]) {
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
	}
	public static void printArr(int[] numbers)
    {
        for(int i = 0 ; i < numbers.length ; i ++ )
        {
        System.out.print(numbers[i] + ",");
        }
        System.out.println("");
    }
	
	public static void main(String[] args) 
    {
        int[] numbers = {10,20,15,0,6,7,2,1,-5,55};
        System.out.print("排序前：");
        printArr(numbers);
        
        bubbleSort(numbers);
        System.out.print("冒泡排序后：");
        printArr(numbers);
        
        
        /*quick(numbers);
        System.out.print("快速排序后：");
        printArr(numbers);*/
    }

}
