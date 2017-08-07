// ������ n ����� � �������. ����������� � ������� ������ � ������� ����������� (��������) �������� �� �����.

import java.util.Scanner;

class Example2{
	public static void main(String[] args){
		
		// ���������� ����� ����� ����������
		Scanner in = new Scanner(System.in);
		System.out.println("������� ���������� �����, ������� ��������� ��������� � ������: ");
		String quntity = in.nextLine();
		Integer quntityStr = 0;
		// �������� �� �������� ��������� �������
		try{
			quntityStr = Integer.valueOf(quntity); // �������������� �� ���� String � Integer
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
		
		// ����� ��������� �����
		for(int i = 0; i < quntityStr; i++){
			System.out.println(arrayTest[i] + " � �������� " + i + " � � ������ " + arrayTest[i].length() + " ��������");
		}
		
		int line1 = 0; /* ����������, ������� ��������� �������� 
					      ����� �������� �������� �������. */
		int line2 = 0; /* ����������, ������� ��������� ��������
						  ����� ���������� �������� �������. */
		
		// ���������� ������� �� ����� ������� ��������
		for(int i = quntityStr-1; i > 0; i--){
			for(int j = 0; j < i; j++){
				line1 = arrayTest[j].length();
				line2 = arrayTest[j+1].length();

				//String str1 = arrayTest[j];
				//String str2 = arrayTest[j+1];
				String box = arrayTest[j];
				
				if(line1 > line2){   
					arrayTest[j] = arrayTest[j+1];
					arrayTest[j+1] = box;
				}
			}
		}
		
		System.out.println();
		System.out.println("������������ ������: ");
		
		for(int i = 0; i < quntityStr; i++){
			System.out.print(arrayTest[i] + " ");
		}
		
		System.out.println();
		System.out.println("������������ ������ � �������� �������: ");
		
		for(int i = quntityStr-1; i >= 0; i--){
			System.out.print(arrayTest[i] + " ");
		}
	}
}