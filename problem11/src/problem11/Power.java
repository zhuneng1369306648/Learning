package problem11;
/*
public class Power {
	private double power(double base,int exponent) throws Exception{
		double result = 0.0;
		if(equal(base,0.0) && exponent < 0) {
			throw new Exception("0的负数次幂无意义");
		}
		if(exponent == 0) {
			return 1.0;
		}
		if(exponent > 0) {
			result = powerWithExponent(base,exponent);
		}else {
			result = powerWithExponent(1.0/base, -exponent);
		}
		return result;
	}
	private double powerWithExponent(double base,int exponent) {
		double result = 1.0;
		for(int i=1;i<=exponent;i++) {
			result = result * base;
		}
		return result;
	}
	private boolean equal(double num1,double num2) {
		if(((num1-num2)>-0.0000001) && (num1-num2)<0.0000001) {
			return true;
			
		}else return false;
	}
	public static void main(String[] args) throws Exception{
		Power test = new Power();
		System.out.println(test.power(2, -3));
	}
}
public class Power{
	private double power(double base,int exponent) throws Exception{
		double result = 0.0;
		if(equal(base,0.0) && exponent < 0) {
			throw new Exception("0的负数次方米无意义");
		}if (exponent == 0) {
			return 1.0;
		}if(exponent > 0) {
			result = powerWithExponent(base,exponent);
		}else {
			result = powerWithExponent(1.0/base,-exponent);
		}
		return result;
	}
	private double powerWithExponent(double base,int exponent) {
		double result = 1.0;
		for(int i=1;i<=exponent;i++) {
			result = result * base;
		}
		return result;
	}
	private boolean equal(double num1,double num2) {
		if(((num1-num2)>-0.0000001) && (num1-num2)<0.0000001) {
			return true;
			
		}else return false;
	}
	public static void main(String[] args) throws Exception{
		Power test = new Power();
		System.out.println(test.power(2, -3));
	}
}*/
public class Power{
	private double power(double base,int exponent) throws Exception{
		double result = 0.0;
		if(equal(base,0.0) && exponent< 0) {
			throw new Exception("0的附属次方米无意义");
		}if(exponent == 0) {
			return 1.0;
		}if(exponent > 0) {
			result = powerWithException(base,exponent);
		}else {
			result = powerWithException(1.0/base,-exponent);
		}
		return result;
	}
	private double powerWithException(double base,int exponent) {
		double result = 1.0;
		for(int i=0;i<exponent;i++) {
			result = result* base;
		}
		return result;
	}
	private boolean equal(double num1,double num2) {
		if(((num1-num2)> 0.00000001)&&(num2-num1)>0.0000001) {
			return true;
		}else
		{
			return false;
		}
	}
	public static void main(String[] args) throws Exception{
		Power test = new Power();
		System.out.println(test.power(2, -3));
	}
	
}
