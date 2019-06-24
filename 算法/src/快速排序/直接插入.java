package 快速排序;

public class 直接插入 {    //直接插入排序是稳定的排序,最优时间复杂度为正序的时候，时间复杂度为O(n),当为逆序的时候，时间复杂度为O(n^2)
	public static void main(String[] args) {
		int [] a= {36,45,56,89,78,46,12,4,5};
		System.out.println("排序之前:");
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]+"");
		}//直接插入排序
		for(int i=1;i<a.length;i++) {
			int temp = a[i];
			int j;
			/*for(j = i-1;j>=0&&a[j]>temp;j--){
			 *将大于temp的往后移动一位
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
		System.out.println("排序之后");
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]+"");
		}
	}

}
