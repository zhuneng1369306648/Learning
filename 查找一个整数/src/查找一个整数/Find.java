package ����һ������;

import java.util.Scanner;/*

public class Find {
	public static void main(String[] args) {
		int [][] array = input();
		if(array!= null) {
			System.out.printf("������Ҫ�ҵ���:");
			Scanner sc =new Scanner(System.in);
			int target = sc.nextInt();
			if(find(array,target) == true) {
				System.out.println("û�ҵ�");
			}else {
				System.out.println("û�ҵ�");
			}
		}
	}
	static int[][] input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������λ��������");
		int rowNumber = sc.nextInt();
		System.out.println("�������λ��������");
		int colNumber = sc.nextInt();
		int [][] array = new int[rowNumber][colNumber];
		if(rowNumber != 0 && colNumber != 0) {
			for(int i=0;i<rowNumber;i++) {
				System.out.println("�������"+(i+1)+"�е�"+(colNumber)+"����");
				for(int j=0;j<colNumber;j++) {
					array[i][j] = sc.nextInt();
				}
			}return array;
		}else {
			System.out.println("��������������shuru ");
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
			System.out.println("������Ҫ�ҵ�����");
			Scanner sc = new Scanner(System.in);
			int target = sc.nextInt();	
			if(find(array,target) == true){
				System.out.println("�ҵ��ˣ�");
			}else{
				System.out.println("û�ҵ���");
			}
		}

	}
	static int[][] input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ά����������");
		int rowNumber = sc.nextInt();
		System.out.println("�������ά����������");
		int colNumber = sc.nextInt();
		int[][] array = new int[rowNumber][colNumber];
		if(rowNumber != 0 && colNumber != 0){
			for(int i=0;i<rowNumber;i++){
				System.out.println("�������"+(i+1)+"�е�"+(colNumber)+"������");
				for(int j=0;j<colNumber;j++){
					array[i][j] = sc.nextInt();
				}
			}
			return array;
		}else {
			System.out.println("������������Ϊ�գ�");
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
