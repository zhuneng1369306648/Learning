package 锁中使用多条件;

public class FileMock {//实现一个文本文件模拟类，属性content用来存储文件的内容，inddex用来表示要从这个文件中读取的内容行号
	private String content[];
	private int index;
	public FileMock(int size,int length) {
		content=new String[size];
		for(int i=0;i<size;i++) {
			StringBuilder buffer=new StringBuilder(length);
			for(int j=0;j<length;j++) {
				int indice=(int)Math.random()*225;
				buffer.append((char)indice);
			}
			content[i]=buffer.toString();
		}
		index=0;
	}
	public boolean hasMoreLines() {
		return index<content.length;
	}
	public String getLine() {
		if(this.hasMoreLines()) {
			System.out.println("Mock :"+(content.length-index));
			return content[index++];
		}
		return null;
	}

}
