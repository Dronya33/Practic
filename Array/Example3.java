/*�������� ������ �� 15 ��������� ����� ����� �� ������� [0;9]. �������� ������ �� �����. 
����������� ������� � ������� ������ ��������� � �������� ��� ���������� �� ����� �� ��������� ������.*/

import java.util.Random;

class Example1
{
	public static void main(String[] args)
	{	
		int[] arrayTest = new int[15]; // �������� �������
		
		Random rand = new Random();
			
		for (int i = 0; i < 15; i++){
			arrayTest[i]  = rand.nextInt(9);
			System.out.print(arrayTest[i] + " ");
		}
		
		int quantity = 0;
		
		for(int i = 0; i < 15; i++ ){
			if(arrayTest[i] % 2 == 0 && arrayTest[i] != 0){
				quantity++;
			}
		}
		System.out.println("\n ���������� ������ ��������� ������� " + quantity);
	}
}