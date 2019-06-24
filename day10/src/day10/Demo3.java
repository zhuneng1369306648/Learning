package day10;

public class Demo3 {
	public static void main(String[] args) {
		Dao d = new UserDao();
	}

}
interface Dao{//接口的方法全部都是非静态的方法
	public void add();
	public void delete();
}
class UserDao implements Dao{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("添加成功");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("删除成功");
	}
	
}