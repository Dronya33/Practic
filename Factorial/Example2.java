//���������� ���������� ����� ����

import java.util.Scanner;

class Example2{
	public static void main(String[] args){
		arrayFactorial(); // ����� ������ ��������
	}
	
	static void arrayFactorial(){
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
		//if(Integer.valueOf(element1) = String.valueOf(element1))System.out.print("�� ������ ��� ������."); 
		
		System.out.print(element1 + "! �����:");
		
		// ������� ����������
		for(int i = element1; i >= 2; i--){
			element1 *= i-1; // ������������ ���� ��������
							 // �� ������ ��������
		}
		
		System.out.print(" " + element1);
		
	}
}