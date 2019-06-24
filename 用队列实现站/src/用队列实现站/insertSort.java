package 用队列实现站;

public class insertSort {

	public static void insertSort(int[] numbers) {
		int size = numbers.length;
		int temp = 0;
		int j = 0;
		for(int i=0;i<size;i++) {
			temp = numbers[i];
			for(j = i;j>0 && temp < numbers[j-1];j--) {
				numbers[j] = numbers[j-1];
			}
			numbers[j] = temp;
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
        
        insertSort(numbers);
        System.out.print("选择排序后：");
        printArr(numbers);
        
        
       /* quick(numbers);
        System.out.print("快速排序后：");
        printArr(numbers);*/
    }
	

}
