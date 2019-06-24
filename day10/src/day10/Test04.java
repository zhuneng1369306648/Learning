package day10;

public class Test04 {
	public static int replaceBlank(char[] string,int usedLength) {
		if(string == null || string.length <usedLength) {
			return -1;
		}
		int whiteCount = 0;
		for(int i=0;i<usedLength;i++) {
			if(string[i]==' ') {
				whiteCount++;
			}
		}
		int targetLength = whiteCount*2+usedLength;
		int tmp = targetLength;
		if(targetLength > string.length) {
			return -1;
		}
		if(whiteCount == 0) {
			return usedLength;
		}
		usedLength--;
		targetLength--;
		while(usedLength >=0 && usedLength < targetLength) {
			if(string[usedLength]==' ') {
				string[targetLength--]='0';
				string[targetLength--]='0';
				string[targetLength--]='0';
			}else {
				string[targetLength--]=string[usedLength--];
			}
			usedLength--;
		}
		return tmp;
	}

}
