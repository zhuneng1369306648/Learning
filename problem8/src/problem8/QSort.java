package problem8;

import java.util.Arrays;

public class QSort {
	//����
	private void qsort(int a[],int left,int right){
		if(a.length == 0) System.out.println("����Ϊ��");
		if(left >= right) return;//����������һ����
		int i = left;
		int j = right;
		int key = a[left];//�Ե�һ��Ԫ��Ϊ����key
		while(i < j){
			while(i < j && key <= a[j]){
				j--;//�Ӻ���ǰ�ұ�keyС��
			}
			a[i] = a[j];//���ҵ��ı�keyС������ǰŲ
			while(i < j && key >= a[i]){
				i++;//��ǰ�����ұ�key���ֵ
			}
			a[j] = a[i];//���ҵ��ı�key���������Ų
		}
		//����һ�ֺ�Ѳ���key��ԭ,����a[i]�Ƿֽ���,���������ߵݹ�
		a[i] = key;
		qsort(a,left,i-1);
		qsort(a,i+1,right);
	}
	public static void main(String[] args) {
		QSort test = new QSort();
		int array[] = {5,4,2,3,1};
		test.qsort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}
}
