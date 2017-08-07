/* ����� ����
�������� ������ �� 20-�� ������ ����� ��������� � �������� ��� �� �����. 
������ � ������ ����� ������������������ ����� ��������, � ������ ��������� � ����� ���� ����������.*/

import java.util.Scanner;

class Example7for{
	public static void main(String[] args){
		
		
		//����� ������ ���� ���������� ������������������ ����� ���������
		int arrayTest[] = new int[20];
		for(int i = 0; i < 2; i++){
			arrayTest[i] = 1;
			System.out.print(arrayTest[i] + " ");
		}
		
		//����� ��������� ���������� ������������������ ����� ���������
		int fib = 1;
		for(int i = 2; i < arrayTest.length; i++){
			arrayTest[i] = fib;
			fib = arrayTest[i]+arrayTest[i-1];
			System.out.print(fib + " ");
		}
		
		System.out.println(" ");
		
		// ���������� ����� � ����������
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� �������� ������������������ ����� ���������: ");
		String element = in.nextLine();
		Integer element1 = 0;
		// �������� ���������� �������
		try{
			element1 = Integer.valueOf(element);
		} catch (NumberFormatException ex){
			System.out.println("�������� ������!");
			System.exit(0);
		}
		
		// ����� ��������� ��������
		for(int i = arrayTest.length; i > 0; i--){
			if(element1 == i)
				System.out.print("�������� ��������: " + arrayTest[i]);
		}
		
	}	
}	