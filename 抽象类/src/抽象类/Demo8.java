package 抽象类;
/*
 * 接口的用处
 * 1.可以拓展功能
 * 2.定义约束规范
 * 3.程序的解耦（低耦合）*/
public class Demo8 {
	public static void main(String[] args) {
		PencilWithEraser  p = new PencilWithEraser("2B铅笔");
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
		System.out.println(name+"写");
	}
}
//橡皮檫
interface Eraser{
	public void remove();
}
//带橡皮檫的铅笔
class PencilWithEraser extends Pencil implements Eraser{
	public PencilWithEraser(String name) {
		super(name);
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		System.out.println(name+"涂改。。。。");
	}
}

