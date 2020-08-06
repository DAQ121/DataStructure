package DataStructures.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {3, 9, -1, 20, 10, 13, 16, 43};
		System.out.print("����ǰ:");
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.print("�����:");
		System.out.println(Arrays.toString(arr));
		
		// ����һ��ð��������ٶ�O(n^2), ��80000�����ݲ���
		//����Ҫ��80000�������������
//		int[] arr = new int[80000];
//		for(int i =0; i < 80000;i++) {
//			arr[i] = (int)(Math.random() * 8000000); //����һ��[0, 8000000) ��
//		}
//		
//		Date data1 = new Date();
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String date1Str = simpleDateFormat.format(data1);
//		System.out.println("����ǰ��ʱ����=" + date1Str);
//		
//		//����ð������
//		bubbleSort(arr);
//		
//		Date data2 = new Date();
//		String date2Str = simpleDateFormat.format(data2);
//		System.out.println("������ʱ����=" + date2Str);
//	
		
	}
	
	// ð�������㷨
	public static void bubbleSort(int[] arr) {
		boolean flag = false; // ��ʶ��������ʾ�Ƿ���й�����
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// ���ǰ������Ⱥ���������򽻻�
				if (arr[j] > arr[j + 1]) {
					flag = true;
					arr[j + 1] ^= arr[j];
	   				arr[j] ^= arr[j + 1];
	    			arr[j + 1] ^= arr[j];
				}
			}
			System.out.print("��" + (i + 1) + "��:");
			System.out.println(Arrays.toString(arr));

			if (!flag) { // ��һ�������У�һ�ν�����û�з�����
				break;
			} else {
				flag = false; // ����flag!!!, �����´��ж�
			}
		}
	}

}
