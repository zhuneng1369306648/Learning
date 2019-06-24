package 快速排序;

public class 希尔排序 {
	public static void main(String[] args) {
		int [] a= {45,89,56,23,12,74,85,96,14,25,4};
		System.out.println("排序之前");
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i] + " ");
		}
		int d = a.length;
		while(true) {
			d = d/2;
			for(int x=0;x<d;x++) {
				for(int i = x+d;i<a.length;i=i+d) {
					int temp = a[i];
					int j;
					for(j=i-d;j>=0&&a[j]>temp;j=j-d) {
						a[j+d] = a[j];
					}
					a[j+d] = temp;
				}
			}
			if(d ==1) {
				break;
			}
		}
		System.out.println();
		System.out.println("排序之后");
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}

}
