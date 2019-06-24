package day10;

import java.util.ArrayList;
import java.util.List;

public class Test41 {
	public static List<Integer> findNumbersWithSum(int[] data,int sum){
		List<Integer> result = new ArrayList<>(2);
		if(data == null || data.length<2) {
			return result;
		}
		int ahead = data.length -1;
		int behind = 0;
		long curSum;
		while(behind<ahead) {
			curSum=data[behind]+data[ahead];
			if(curSum == sum) {
				result.add(data[behind]);
				result.add(data[ahead]);
				break;
			}else if(curSum <sum) {
				behind++;
			}else {
				ahead--;
			}
		}
		return result;
	}
	
	public static List<List<Integer>> findContinuousSequence(int sum){
		List<List<Integer>> result = new ArrayList<>();
		if(sum<3) {
			return result;
		}
		int small = 1;
		int big = 2;
		int middle=(1+sum)/2;
		int curSum = small + big;
		while(small<middle) {
			if(curSum==sum) {
				List<Integer> list = new ArrayList<>(2);
				for(int i = small;i<=big;i++) {
					list.add(i);
				}
				result.add(list);
			}
			while(curSum > sum &&small<middle) {
				curSum -=small;
				small++;
				if(curSum == sum) {
					List<Integer> list = new ArrayList<>(2);
					for(int i=small;i<=big;i++) {
						list.add(i);
					}
					result.add(list);
				}
			}
			big++;
			curSum +=big;
		}
		return result;
	}
	public static void main(String[] args) {
		int[] data1= {1,2,3,4,7,8,11,15};
		System.out.println(findNumbersWithSum(data1, 11));
	}

}
