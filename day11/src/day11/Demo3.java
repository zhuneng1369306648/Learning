package day11;



class NoMoneyException extends Exception{
	public NoMoneyException(String message) {
		super(message);
	}
}

public class Demo3 {
	public static void main(String[] args) {
		try {
			eat(9);
		} catch (NoMoneyException e) {
			e.printStackTrace();
			System.out.println("GGG");
		}
	}
	public static void eat(int money) throws NoMoneyException{
		if(money<10) {
			throw new NoMoneyException("³Ô°ÔÍõ²Í");
		}
		System.out.println("³ÔÉÏÁË·¹ ");
	}
	 

}
