package day10;

public class Test03 {
	public static boolean find(int[][] matrix,int number) {
		//输入条件判断
		if(matrix == null || matrix.length<1 || matrix[0].length < 1) {
			return false;
		}
		int rows = matrix.length;
		int cols = matrix[1].length;
		int row = 0;
		int col = cols -1;
		while(row>=0&&row<rows&&col>=0&&col<cols) {
			if(matrix[row][col]==number) {
				return true;
			}else if(matrix[row][col]>number) {
				col--;
			}else {
				row++;
			}
		}
		return false;
	}

}
