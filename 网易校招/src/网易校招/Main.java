package ����У��;

import java.util.Scanner;

/*import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int coinCount = in.nextInt();
            StringBuilder sb = new StringBuilder();
            while (coinCount > 0) {
                if (coinCount % 2 == 0) {
                    //ż��
                    coinCount = (coinCount - 2) / 2;
                    sb.append("2");
                } else {
                    //����
                    coinCount = (coinCount - 1) / 2;
                    sb.append("1");
                }
            }
            System.out.println(sb.reverse().toString());
        }
    }
}
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int coin = in.nextInt();
			StringBuilder sb = new StringBuilder();
			while(coin >0) {
				if(coin % 2 == 0) {
					coin = (coin-2)/2;
					sb.append("2");
				}
				else {
					coin = (coin-1)/2;
					sb.append("1");
				}
			}
			System.out.println(sb.reverse().toString());
		}
	}
}*/
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int coin = in.nextInt();
			StringBuilder sb = new StringBuilder();
			while(coin>0) {
			if(coin % 2 == 0 ) {
				coin = (coin-2)/2;
				sb.append("2");
			}
			else {
				coin = (coin - 1)/2;
				sb.append("1");
			}
			}
			System.out.println(sb.toString());
		}
	}
}