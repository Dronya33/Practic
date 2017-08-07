// ������ n ����� � �������. ������� �� ������� �� ������, ����� ������� ������ (������) �������, � ����� �����.

import java.util.*;

class Example3{
	public static void main(String[] args){
	
		//���������� ����� � ����������
		Scanner in = new Scanner(System.in);
		System.out.println("������� ���������� ����� ������� ���������� ��������� � �������: ");
		String quntity = in.nextLine();
		Integer quntityStr = 0;
		try{
			quntityStr = Integer.valueOf(quntity);
		} catch(NumberFormatException ex){
			System.out.println("�������� ������!!!");
			System.exit(0);
		}
		
		String[] arrayTest = new String[quntityStr];
		
		// ���������� ����� ����� � ������ �� � ������
		for(int i = 0; i < quntityStr; i++){
			System.out.println("������� ������: ");
			arrayTest[i] = in.nextLine();
		}
		
		System.out.println("\n������������ ������: ");
		
		// ����� ���������� �����
		for(int i = 0; i < quntityStr; i++){
			System.out.println(arrayTest[i] + " ");
		}
		
		int temp = 0;
		
		// C����������� ���� �����, ��� ���� ���� � ������� ��������� ������� ������
		for(int i = 0; i < quntityStr; i++){
			temp += arrayTest[i].length();
		}
		
		temp /= quntityStr; // ���������� ����� ������� ������
		String str1 = " ";  // ���������� � ������� ����� ������������ ������� ������
		
		// ������ � ���������� ������� ������
		for(int i = 0; i < quntityStr; i++){
			if(arrayTest[i].length() == temp)
			str1 = arrayTest[i];	
		}	
		
		System.out.println("\n����� ������� ������: " + temp + " �������(��)" + " ��� ������: " + str1);
		System.out.println("\n������, ������� ������ ������� ������: ");
							  
		// ����� ����� ������� ��� �������					  
		for(int i = 0; i < quntityStr; i++){
			if(arrayTest[i].length() < temp)
				System.out.println(arrayTest[i] + " ����� �����: " + arrayTest[i].length() + " �������(��).");
		}
		
		System.out.println("\n������, ������� ������ �������� ������: ");
		
		// ����� ����� ������� ��� ������
		for(int i = 0; i < quntityStr; i++){
			if(arrayTest[i].length() > temp)
				System.out.println(arrayTest[i] + " ����� �����: " + arrayTest[i].length() + " ������(��).");
		}
	}
}