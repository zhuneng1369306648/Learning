package day10;

public class Test38 {
	private static int getFirstK(int[] data,int k,int start,int end) {
		if(data == null || data.length<1 || start>end) {
			return -1;
		}
		int midIdx = start + (end-start)/2;
		int midData = data[midIdx];
		if(midData == k) {
			if(midIdx > 0 && data[midIdx - 1] !=k || midIdx==0) {
				return midIdx;
			}else {
				end=midIdx-1;
			}
		}
		else if(midData > k) {
			end=midIdx-1;
		}else {
			start=midIdx+1;
		}
		return getFirstK(data,k,start,end);
	}
	private static int getLastK(int[] data,int k,int start,int end) {
		if(data==null || data.length <1 || start >end) {
			return -1;
		}
		int midIdx = start+(end-start)/2;
		int midData = data[midIdx];
		if(midData == k) {
			if(midIdx+1<data.length && data[midIdx +1] !=k || midIdx == data.length -1) {
				return midIdx;
			}else {
				start = midIdx +1;
			}
		}else if(midData < k) {
			start = midIdx +1;
		}else {
			end = midIdx-1;
		}
		return getLastK(data,k,start,end);
	}
	public static int getNumberOfk(int[] data,int k) {
		int number =0;
		if(data !=null && data.length>0) {
			int first=getFirstK(data,k,0,data.length-1);
			int last = getLastK(data,k,0,data.length-1);
			if(first>-1&&last>-1) {
				number=last-first+1;
			}
		}
		return number;
	}
	public static void main(String[] args) {
		int[] data1= {1,2,3,3,3,3,4,5};
		System.out.println(getNumberOfk(data1, 3));
	}

}
