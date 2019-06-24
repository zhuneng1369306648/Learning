package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) {
		copyImage();
	}
	public static void copyImage() {
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
		    File inFile = new File("F:\\a\\1.jpg");
		    File outFile = new File("F:\\1.jpg");
		    fileInputStream = new FileInputStream(inFile);
		    fileOutputStream = new FileOutputStream(outFile);
		    byte[] buf = new byte[1024];
		    int length = 0;
		    while((length=fileInputStream.read(buf)) != -1) {
		    	fileOutputStream.write(buf, 0, length);
		    }
		}catch (IOException e) {
			System.out.println("����ͼƬ����������");
			throw new RuntimeException(e);
		}finally {
			try {
				if(fileOutputStream != null) {
					fileOutputStream.close();
					System.out.println("�ر����������ɹ�...");
				}
			} catch (IOException e) {
				System.out.println("�ر��������Դʧ��....");
				throw new RuntimeException(e);
			}finally {
				if(fileInputStream !=null) {
					try {
						fileInputStream.close();
						System.out.println("�ر�����������ɹ�..");
					}catch(IOException e) {
						System.out.println("�ر�������ʧ��");
						throw new RuntimeException(e);
					}
				}
			}
		}
	}
	public static void readTest() {
		FileInputStream fileInputStream = null;
		try {
			File file = new File("F:\\aa.txt");
			fileInputStream = new FileInputStream(file);
			byte[] buf = new byte[1024];
			int length = 0;
			while((length = fileInputStream.read(buf))!=-1) {
				System.out.println(new String(buf,0,length));
			}
		}catch (IOException e) {
			System.out.println("��ȡ�ļ���Դ����....");
			throw new RuntimeException();
		}finally {
			try {
				if(fileInputStream != null) {
					fileInputStream.close();
					System.out.println("�ر���Դ�ɹ�....");
				}
			}catch(IOException e) {
				System.out.println("�ر���Դʧ��....");
				throw new RuntimeException(e);
			}
		}
		
	}

}
/*public class Demo1 {

	public static void main(String[] args) {
	//	readTest();
		
		copyImage();
	}

	// ����ͼƬ
	public static void copyImage() {
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		try {
			// �ҵ�Ŀ���ļ�
			File inFile = new File("F:\\��Ů\\1.jpg");
			File outFile = new File("E:\\1.jpg");
			// �����������ͨ��
			fileInputStream = new FileInputStream(inFile);
			fileOutputStream = new FileOutputStream(outFile);
			// �����������飬�߶���д
			byte[] buf = new byte[1024];
			int length = 0;
			while ((length = fileInputStream.read(buf)) != -1) {
				fileOutputStream.write(buf, 0, length);
			}
		} catch (IOException e) {
			System.out.println("����ͼƬ����...");
			throw new RuntimeException(e);
		} finally {
			// �ر���Դ
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
					System.out.println("�ر����������ɹ�...");
				}
			} catch (IOException e) {
				System.out.println("�ر��������Դʧ��...");
				throw new RuntimeException(e);
			} finally {
				if (fileInputStream != null) {
					try {
						fileInputStream.close();
						System.out.println("�ر�����������ɹ�...");
					} catch (IOException e) {
						System.out.println("�ر�����������ʧ��...");
						throw new RuntimeException(e);
					}
				}

			}
		}
	}

	public static void readTest() {
		FileInputStream fileInputStream = null;
		try {
			// �ҵ�Ŀ���ļ�
			File file = new File("F:\\aaaaa.txt");
			// ������������ͨ��
			fileInputStream = new FileInputStream(file);
			// �������������ȡ����
			byte[] buf = new byte[1024];
			int length = 0;
			while ((length = fileInputStream.read(buf)) != -1) {
				System.out.print(new String(buf, 0, length));
			}
		} catch (IOException e) {
			
			 * //����Ĵ���... ������Ҫ��ֹ����Ĵ���ִ��,����Ҫ��Ҫ֪ͨ���������������... throw new
			 * RuntimeException(e);
			 * //��IOException���ݸ�RuntimeException��װһ�㣬Ȼ�����׳�������������Ŀ����
			 * Ϊ���õ�����ʹ�ñ�ø�����
			 
			System.out.println("��ȡ�ļ���Դ����....");
			throw new RuntimeException(e);
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
					System.out.println("�ر���Դ�ɹ�...");
				}
			} catch (IOException e) {
				System.out.println("�ر���Դʧ��...");
				throw new RuntimeException(e);
			}
		}
	}

}
*/
