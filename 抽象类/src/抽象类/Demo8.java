package ������;
/*
 * �ӿڵ��ô�
 * 1.������չ����
 * 2.����Լ���淶
 * 3.����Ľ������ϣ�*/
public class Demo8 {
	public static void main(String[] args) {
		PencilWithEraser  p = new PencilWithEraser("2BǦ��");
		p.write();
		p.remove();
	}

}
class Pencil{
	String name;
	public Pencil(String name) {
		this.name = name;
	}
	public void write() {
		System.out.println(name+"д");
	}
}
//��Ƥ��
interface Eraser{
	public void remove();
}
//����Ƥ�ߵ�Ǧ��
class PencilWithEraser extends Pencil implements Eraser{
	public PencilWithEraser(String name) {
		super(name);
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		System.out.println(name+"Ϳ�ġ�������");
	}
}

