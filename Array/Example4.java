/* �������� ������ �� 8 ��������� ����� ����� �� ������� [1;10]. 
�������� ������ �� ����� � ������. �������� ������ ������� � �������� �������� �� ����. 
����� �������� ������ �� ����� �� ��������� ������.*/

import java.util.Random;

class Example4{
	public static void main(String[] args){
		
		int arrayTest[] = new int [8]; // �������� �������
		Random rand = new Random(); // ���������� �������
		
		//���������� ����� ���������� �������
		for(int i = 0; i < arrayTest.length; i++){
			arrayTest[i] = rand.nextInt(10)+1; // ���������� �������
			System.out.print(arrayTest[i] + " ");
		}
		
		System.out.println(" ");
		
		for(int i = 0; i < arrayTest.length; i++){
			if (i % 2 != 0){
				arrayTest[i] = 0;
			}
			System.out.print(arrayTest[i] + " ");
		}
	}
}