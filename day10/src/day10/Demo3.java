package day10;

public class Demo3 {
	public static void main(String[] args) {
		Dao d = new UserDao();
	}

}
interface Dao{//�ӿڵķ���ȫ�����ǷǾ�̬�ķ���
	public void add();
	public void delete();
}
class UserDao implements Dao{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("��ӳɹ�");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("ɾ���ɹ�");
	}
	
}