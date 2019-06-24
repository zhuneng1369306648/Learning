package 泛型;

import java.util.LinkedList;
import java.util.Random;

class Poker{
	String color;
	String num;
	public Poker(String color,String num) {
		super();
		this.color = color;
		this.num = num;
	}
	public String toString() {
		return "{"+color+num+"}";
	}
}

public class Demo4 {
	public static void main(String[] args) {
		LinkedList pokers = createPoker();
		shufflePoker(pokers);
		showPoker(pokers);
	}

	private static void showPoker(LinkedList pokers) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i<pokers.size() ; i++){
			System.out.print(pokers.get(i));
			//换行
			if(i%10==9){
				System.out.println();
			}
		}
		
	}

	private static void shufflePoker(LinkedList pokers) {
		// TODO Auto-generated method stub
		Random random = new Random();
		for(int i=0;i<100;i++) {
			int index1 = random.nextInt(pokers.size());
			int index2 = random.nextInt(pokers.size());
			Poker poker1 = (Poker) pokers.get(index1);
			Poker poker2 = (Poker) pokers.get(index2);
			pokers.set(index1, poker2);
			pokers.set(index2, poker1);
		}
		
		
	}

	private static LinkedList createPoker() {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();		
		//定义数组存储所有的花色与点数
		String[] colors = {"黑桃","红桃","梅花","方块"};
		String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int i = 0 ; i < nums.length ; i++){
			for(int j = 0 ; j<colors.length ; j++){
				list.add(new Poker(colors[j], nums[i]));
			}
		}
		return list;
	}

}
