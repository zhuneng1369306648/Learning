package ��������;

public class ֱ�Ӳ��� {    //ֱ�Ӳ����������ȶ�������,����ʱ�临�Ӷ�Ϊ�����ʱ��ʱ�临�Ӷ�ΪO(n),��Ϊ�����ʱ��ʱ�临�Ӷ�ΪO(n^2)
	public static void main(String[] args) {
		int [] a= {36,45,56,89,78,46,12,4,5};
		System.out.println("����֮ǰ:");
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]+"");
		}//ֱ�Ӳ�������
		for(int i=1;i<a.length;i++) {
			int temp = a[i];
			int j;
			/*for(j = i-1;j>=0&&a[j]>temp;j--){
			 *������temp�������ƶ�һλ
			 *a[j+1] = a[j];
			 }
			  */
			for(j=i-1;j>=0;j--) {
				if(a[j]>temp) {
					a[j+1] = a[j];
				}else {
					break;
				}
			}
			a[j+1] = temp;
		}
		System.out.println();
		System.out.println("����֮��");
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]+"");
		}
	}

}
