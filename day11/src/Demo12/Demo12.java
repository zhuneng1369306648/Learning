package Demo12;
/*
11.Ŀǰ�����顱 int[] arr =  {11,2, 4, 2, 10, 11}��
����һ�����������������ظ�Ԫ�أ����ص�����洢����Щ���ظ���Ԫ�ض������鲻׼�˷ѳ��ȡ�

������
	1. ȷ��������ĳ��ȡ�  ԭ����ĳ���-�ظ�Ԫ�ظ���


*/
import java.util.*;
class Demo12 {

	public static void main(String[] args) 
	{
		int[] arr =  {11,2, 4, 2, 10, 11};
		arr = clearRepeat(arr);
		System.out.println("����ظ�Ԫ�ص����飺"+ Arrays.toString(arr));
	}

	public static int[] clearRepeat(int[] arr){
		//�ȼ�����ظ�Ԫ�صĸ�ʽ:
		int count = 0; //��¼�ظ�Ԫ�صĸ���
		for(int i = 0 ; i < arr.length-1 ; i++){
			for(int j = i+1 ; j<arr.length ; j++){
				if(arr[i]==arr[j]){
					count++;
					break;
				}
			}
		}
		
		//������ �ĳ���
		int newLength = arr.length - count;
		//����һ���µ�����
		int[] newArr = new int[newLength];

		int index = 0 ; 	//�����������ֵ

		
		//����������
		for(int i = 0  ; i< arr.length ; i++){
			int temp = arr[i];  //�������е�Ԫ�� 
			boolean flag = false;  //Ĭ�ϲ����ظ�Ԫ��
			
			
			//���ž����� ��Ԫ�� ���������ÿ��Ԫ�رȽ�һ�Ρ�
			for(int j = 0 ; j< newArr.length ; j++){
				if(temp==newArr[j]){
					flag = true;
					break;
				}
			}
			
			if(flag == false){
				newArr[index++] = temp;
			}
		}
		
		return newArr;
	}
	
}
