package problem20;
/*������20��˳ʱ���ӡ���� ˼·��һȦһȦ��ӡ���پ��嵽�ĸ��߷ֱ��ӡ�� */
/*public class PrintMatrixInCircle {
    public void PrintMatrixClockwisely(int[][] a){
        if (a==null) return;
        int rows=a.length;
        int columns=a[0].length;
        int start=0;//��ʼλ�����궼��(0,0),(1,1)����
        while (rows > start*2 && columns > start*2) {
            PrintMatrixInCircle(a,rows,columns,start);//����ʼλ�ÿ�ʼ��ӡһȦ
            start++;
        }
    }
    private void PrintMatrixInCircle(int[][] a, int rows, int columns, int start) {
        int endX=columns-start-1;//��һȦ�����һ�е��±�
        int endY=rows-start-1;//��һȦ�����һ�е��±�
        for (int i = start; i <= endX; i++){//������ ��ӡ��ʼһ��
            System.out.println(a[start][i]);
        }
        if (start < endY) {//���ϵ��� ��ӡ��
            for (int i = start+1; i <=endY; i++) {
                System.out.println(a[i][endX]);
            }
        }
        if (start < endX && start < endY) {//���ҵ��� ��ӡ��
            for (int i = endX-1; i >=start; i--) {
                System.out.println(a[endY][i]);
            }
        }
        if (start < endX && start < endY-1) {//���µ��� ��ӡ��
            for (int i = endY-1; i >=start+1; i--){
                System.out.println(a[i][start]);
            }
        }
    }
    public static void main(String[] args) {
        int[][] a={
                {1, 2, 3, 4,5},
                {5, 6, 7, 8,6},
                {9,10,11,12,1},
                {13,14,15,16,1}
        };
        PrintMatrixInCircle t=new PrintMatrixInCircle();
        t.PrintMatrixClockwisely(a);
    }
}*/
public class PrintMatrixInCircle{
	public void PrintMatrixClockwisely(int[][] a) {
		if(a==null)return;
		int rows = a.length;
		int columns = a[0].length;
		int start = 0;
		while(rows > start*2 && columns > start*2) {
			PrintMatrixInCircle(a,rows,columns,start);
			start++;
		}
	}
	private void PrintMatrixInCircle(int[][] a,int rows,int columns,int start) {
		int endX = columns-start-1;
		int endY = rows-start-1;
		for(int i=start;i<=endX;i++) {
			System.out.println(a[start][i]);
		}
		if(start < endY) {
			for(int i=start+1;i<=endY;i++) {
				System.out.println(a[i][endX]);
			}
		}
		if(start<endX && start < endY) {
			for(int i=endY -1;i>=start;i--) {
				System.out.println(a[endY][i]);
			}
		}
		if(start<endY && start< endY -1) {
			for(int i=endY-1;i>=start+1;i--) {
				System.out.println(a[i][start]);
			}
		}
	}
	 public static void main(String[] args) {
	        int[][] a={
	                {1, 2, 3, 4},
	                {5, 6, 7, 8},
	                {9,10,11,12},
	                {13,14,15,16}
	        };
	        PrintMatrixInCircle t=new PrintMatrixInCircle();
	        t.PrintMatrixClockwisely(a);
	    }
}