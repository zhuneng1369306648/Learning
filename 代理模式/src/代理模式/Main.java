package ����ģʽ;

public class Main {
	public static void main(String [] args)
	{
		Water water = new Water();
		WaterProxy waterProxy = new WaterProxy(water);
		waterProxy.drink();
	}
	public interface Drink {
		void drink();
	}

}
