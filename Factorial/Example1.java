// ���������� ���������� ����� ��������

import java.util.Scanner;

class Example1{
	public static void main(String[] args){
		
		// ���������� ����� � ����������
		Scanner in = new Scanner(System.in);
		System.out.println("������� �����, ��������� �������� ���� ���������:");
		String element = in.nextLine();
		Integer element1 = 0;
		// �������� ������� �����
		try{
			element1 = Integer.valueOf(element);
		} catch(NumberFormatException ex){
			System.out.println("�������� ������");
			System.exit(0);
		}
		element1 = Integer.valueOf(element);
		
		int rez = arrayFactorial(element1); // ������ ��������� � ����������
		System.out.print("8! �����: "+ rez); // ����� ����������
	}
	
	
	// ���������� ��������
	static int arrayFactorial(int element1){
		
		if(element1 == 0)return 1; // ������� ������� �� ���� ����������� ��������
		return element1 * arrayFactorial(element1 - 1); // ������������ ���� ��������
														// �� ������ ��������
	}
}