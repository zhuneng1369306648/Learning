/*package other;


interface Work {
	public void work();
}
class Son implements Work{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("会画画");
	}
	
}
class Mother implements Work{
      Work worker;
      public Mother(Work worker) {
    	  this.worker = worker;
      }
	@Override
	public void work() {
		worker.work();
		// TODO Auto-generated method stub
		System.out.println("会涂颜色...");
	}
	
}
class Father implements Work{
	Work worker;
	public Father(Work worker) {
		this.worker = worker;
	}

	@Override
	public void work() {
		worker.work();
		// TODO Auto-generated method stub
		System.out.println("会装画框");
	}
	
}

public class Demo3 {
	public static void main(String[] args) {
		Son s = new Son();
		Mother m = new Mother(s);
		m.work();
		Father f = new Father(s);
		f.work();
	}

}
*/
package other;

/*练习：
	一家三口每个人都会工作，儿子的工作就是画画，母亲的工作就是在儿子的基础上做一个增强，不单止可以画画，还可以上涂料。
	爸爸的工作就是在妈妈基础上做了增强，就是上画框。
*/

interface Work{
	
	public void work();
}

class Son implements Work{

	@Override
	public void work() {
		System.out.println("画画...");
	}
}


class Mather implements Work{

	//需要被增强的类。
	Work worker;
	
	public Mather(Work worker){
		this.worker = worker;
	}
	
	@Override
	public void work() {
		worker.work();
		System.out.println("给画上颜色..");
	}
}


class Father implements Work{

	//需要被增强的类的引用
	Work worker;
	
	public Father(Work worker){
		this.worker = worker;
	}
	
	
	@Override
	public void work() {
		worker.work();
		System.out.println("上画框...");
	}
	
}


public class Demo3 {
	
	public static void main(String[] args) {
		Son s = new Son();
//		s.work();
		Mather m = new Mather(s);
//		m.work();
		Father f = new Father(m);
		f.work();
		
		
	}
}
