package ����ģʽ;

import ����ģʽ.Main.Drink;

public class WaterProxy implements Drink{
	private Drink drinkImpl;
	public WaterProxy(Drink drinkImpl) {
		this.drinkImpl = drinkImpl;
	}

	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("brfore drink");
		drinkImpl.drink();
		System.out.println("after drink");
	}

}
