package problem12;
/*
 * ������12����ӡ1������nλ��
 * ��������n,��˳���ӡ����1����nλʮ����������������3�����ӡ��1,2,3,...,һֱ������3λ����999��
 * ע�⣺û���޶�n�ķ�Χʱ��ע��������⣬n���ܻᳬ��������ֵ���͵ı�ʾ��Χ����ʱ�������ַ�������ʾ��ÿһλ�϶���0-9�ı����������õݹ顣
 * ���⻰��Java����������BigInteger��BigDecimal�ֱ��ʾ��������ʹ󸡵����࣬�������ܱ�ʾ���޴������
 */
/*public class Print1ToMaxOfNDigits {
	private void print(String str,int len){
        if (len == 0) {//�ݹ��������
        	for(int j = 0;j < str.length();j++){//������ַ���ǰ�ߵ�0
        		if(str.charAt(j) != '0'){
        			System.out.println(str.substring(j));
        			break;
        		}
        	}
            return;
        }
        for (int i = 0; i < 10; i++) {
            print(str + i,len - 1);
            //�ݹ�˵���������ȵ�һ�ν���ѭ���壬�����һ��ݹ�������(0,1)��������ݹ����������Ȼ��ڶ��ν���ѭ���壬�ٽ���ڶ���ݹ�������(00,0),��������������00��
            //Ȼ��ص��ڶ��ν����ѭ�����У�ִ��ѭ����ĵڶ��֣�������µĵڶ���ݹ�������(01,0),��������������01���Դ����ƣ�ֱ��09�����ѭ���������
            //��ʱ��һ��ݹ����������ʼִ�е�һ�ν����ѭ����ĵڶ��֣�������µĵ�һ��ݹ飬������(1,1),�Դ����ơ�
        }
    }
    private void print1ToMaxOfDigits(int n) {
    	if(n <= 0){
    		System.out.println("��������");
    		return;
    	}
        print("", n);
    }
    public static void main(String[] args) {
        Print1ToMaxOfNDigits test=new Print1ToMaxOfNDigits();
        test.print1ToMaxOfDigits(2);
    }
}*/
public class Print1ToMaxOfNDigits{
	private void print(String str,int len) {
		if(len==0) {
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)!='0') {
					System.out.println(str.substring(j));
					break;
				}
			}
			return;
		}
		for(int i=0;i<10;i++) {
			print(str + i,len-1);
		}
	}
	private void print1ToMaxOfDigits(int n) {
		if(n<=0) {
			System.out.println("��������");
			return;
		}print("",n);
	}
	public static void main(String[] args) {
        Print1ToMaxOfNDigits test=new Print1ToMaxOfNDigits();
        test.print1ToMaxOfDigits(2);
    }
}
