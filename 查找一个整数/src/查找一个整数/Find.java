package 查找一个整数;

import java.util.Scanner;/*

public class Find {
	public static void main(String[] args) {
		int [][] array = input();
		if(array!= null) {
			System.out.printf("请输入要找的数:");
			Scanner sc =new Scanner(System.in);
			int target = sc.nextInt();
			if(find(array,target) == true) {
				System.out.println("没找到");
			}else {
				System.out.println("没找到");
			}
		}
	}
	static int[][] input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入二位数组行数");
		int rowNumber = sc.nextInt();
		System.out.println("请输入二位数组列数");
		int colNumber = sc.nextInt();
		int [][] array = new int[rowNumber][colNumber];
		if(rowNumber != 0 && colNumber != 0) {
			for(int i=0;i<rowNumber;i++) {
				System.out.println("请输入第"+(i+1)+"行的"+(colNumber)+"个数");
				for(int j=0;j<colNumber;j++) {
					array[i][j] = sc.nextInt();
				}
			}return array;
		}else {
			System.out.println("输入有误，请重新shuru ");
			return null;
		}
	}
	static boolean find(int[][] array,int target) {
		int row=0;
		int col = array[0].length-1;
		while(row<array.length && col>=0) {
			if(array[row][col] == target) {
				return true;
			}else if(array[row][col] > target) {
				col--;
			}else {
				row++;
			}
		}return false;
	}

}*/
public class Find{
	public static void main(String[] args){
		int[][] array = input();
		if(array != null){
			System.out.println("请输入要找的数：");
			Scanner sc = new Scanner(System.in);
			int target = sc.nextInt();	
			if(find(array,target) == true){
				System.out.println("找到了！");
			}else{
				System.out.println("没找到！");
			}
		}

	}
	static int[][] input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入二维数组行数：");
		int rowNumber = sc.nextInt();
		System.out.println("请输入二维数组列数：");
		int colNumber = sc.nextInt();
		int[][] array = new int[rowNumber][colNumber];
		if(rowNumber != 0 && colNumber != 0){
			for(int i=0;i<rowNumber;i++){
				System.out.println("请输入第"+(i+1)+"行的"+(colNumber)+"个数。");
				for(int j=0;j<colNumber;j++){
					array[i][j] = sc.nextInt();
				}
			}
			return array;
		}else {
			System.out.println("输入有误！数组为空！");
			return null;
		}
	}
	static boolean find(int[][] array,int target){
		int row = 0;
		int col = array[0].length-1;
		while(row<array.length && col>=0){
			if(array[row][col] == target){
				return true;
			}
			else if(array[row][col] > target){
				col--;
			}else{
				row++;
			}
		}
		return false;
	}
}
