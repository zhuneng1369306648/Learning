package problem9;
/*
 * ������9��쳲���������
 * дһ������������n����쳲��������еĵ�n�쳲��������ж������£�n=0ʱ,f(n)=0;n=1ʱ,f(n)=1;n>1ʱ,f(n)=f(n-1)+f(n-2)
 * ˼·1�����ж�n<=0,return 0;Ȼ���ж�n=1,return 1;����return f(n-1)+f(n-2)�����ַ������˵ݹ飬�򵥺���⣬����Ч�ʲ
 * ������f(10)��Ҫ����f(9)��f(8)���Դ����ƣ������f(10)��Ϊ�������ĸ��ڵ㣬��ô�������Ľڵ���кܶ��ظ��ģ����Ӷ���n�����Ӷ�ָ�����ӡ�
 * ˼·2�����򵥵İ취���Ǵ�n��ʼ�����㣬���Ǵ�0��ʼ�����㣬��ѭ�������ǵݹ飬������f(0)��f(1)���f(2)���Դ����ơ����Ӷ�ΪO(n)��
 * ����⣺һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨�׹��С�������������
 * ˼·�����ȿ�����򵥵�ֻ��1��̨��ʱ����ʱֻ��1�������������2��̨�ף��Ǿ���2������������һ���������n��̨�׿���n�ĺ���f(n)����ʼ���ۣ�
 * ��n>2ʱ����һ����������ѡ����1���Ļ�����ʱ������Ŀ���ں���ʣ�µ�n-1��̨�׵�������Ŀ����f(n-1)��ͬ����2���Ļ�Ϊf(n-2)����������Ŀ��f(n-1)+f(n-2)����쳲��������С�
 * ��չ����������ĳɿ�������1����2�����ȵȵ�ֱ��n������ô���м�������������ѧ���ɷ���֪��2��n-1�η��֡�
 */

/*
public class Fibonacci {
	private long fibonacci(int n){
		int result[] = {0,1};
		if(n<2){
			return result[n];
		}
		long fibOne = 0;//f(0)
		long fibTwo = 1;//f(1)
		long fibN = 0;//f(n)
		for(int i=2;i<=n;i++){
			fibN = fibOne + fibTwo;
			fibOne = fibTwo;
			fibTwo = fibN;
		}
		return fibN;
	}
	public static void main(String[] args){
		Fibonacci test = new Fibonacci();
		System.out.println(test.fibonacci(3));
	}
}
public class Fibonacci{
	private long fibonacci(int n) {
		int result[] = {0,1};
		if(n<2) {
			return result[n];
		}
		long fibOne = 0;
		long fibTwo = 1;
		long fibN =0;
		for(int i=2;i<=n;i++) {
			fibN=fibOne+fibTwo;
			fibOne=fibTwo;
			fibTwo = fibN;
		}
		return fibN;
	}
}*/

