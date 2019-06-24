package 用队列实现站;

public class selectSort {
	public static void selectSort(int[] numbers) {
		int temp = 0;
		int size = numbers.length;
		for(int i=0;i<size;i++) {
			int k = i;
			for(int j=size-1;j>i;j--) {
				if(numbers[j]<numbers[k]) {
					k=j;
				}
			}
			temp = numbers[i];
			numbers[i] = numbers[k];
			numbers[k] = temp;
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
        
        selectSort(numbers);
        System.out.print("选择排序后：");
        printArr(numbers);
        
        
       /* quick(numbers);
        System.out.print("快速排序后：");
        printArr(numbers);*/
    }
	

}
