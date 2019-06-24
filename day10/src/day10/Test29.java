package day10;

public class Test29 {
	public static int moreThanHalfNum(int[] numbers) {
		if(numbers == null || numbers.length <1) {
			throw new IllegalArgumentException("Array length must lagre than 1");
		}
		int result = numbers[0];
		int count = 1;
		for(int i=1;i<numbers.length;i++) {
			if(count==0) {
				result = numbers[i];
				count=1;
			}else if(result==numbers[i]) {
				count++;
			}
			else {
				count--;
			}
		}
		count=0;
		for(int number:numbers) {
			if(result==number) {
				count++;
			}
		}
		if(count>numbers.length/2) {
			return result;
		}
		else {
			throw new IllegalArgumentException("invalid input");
		}
	}
	public static void main(String[] args) {
		int numbers[] = {1,2,3,2,2,2,5,2,2,2,1,1};
		System.out.println(moreThanHalfNum(numbers));
	}

}
