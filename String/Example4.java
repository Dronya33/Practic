// ������ n ���� � �������. ����� �����, � ������� ����� ��������� �������� ����������. ���� ����� ���� ���������, ����� ������ �� ���.

import java.util.*; 

class Example4{
	public static void main(String[] args){
		
		// ���������� ����� ������ ������, ������� � ������� ����� �������� �������� �������
		Scanner in = new Scanner(System.in); /* �������� ������� ������ Scanner, 
		                                         ������� �������� ������� ������ 
												 � ����������(�� ��� �������� ������ Systeam.in) */
												 
		System.out.println("������� ���������� ����� ������� ���������� ��������� � �������: ");
		
		String quantity = in.nextLine();      /* ���������� ����� ������������������ ��������
										         ���������� �������� ������������ � ������
										         ������ String */
		Integer quantityStr = 0;
		// ���������� ����������, � ������ ������ ��� ����� �� ����������� �������
		try{
			quantityStr = Integer.valueOf(quantity); /* ������� � ������������� ������. 
			                                            ������ � ���� ������� ������ ����������� ����,
														�.�. ����� ������������� ������. */
		} catch(NumberFormatException ex){ // ��� ����������� ��� ���������� � �������������� ����������.
			System.out.println("�������� ������!!!");
			System.exit(0); // ����� �� ���������
		}
		
		String[] arrayTest = new String[quantityStr]; // �������� ������� ������ �������� ������������� ������� ���������� quantityStr
		
		// ���������� ����� ����� � ������ �� � ������
		for(int i = 0; i < quantityStr; i++){
			System.out.println("������� ������: ");
			arrayTest[i] = in.nextLine(); // ������������ �������� ������� ����� ������������������ ��������(�����)
		}
		
		System.out.println("\n���������� ������: ");
		
		// ����� ���������� �����
		for(int i = 0; i < quantityStr; i++){
			System.out.println(arrayTest[i]);			
		}
		
		System.out.println();
		
		char char1; // ���������� � ������� ����� ���������� �������
		
		for(int i = 0; i < arrayTest.length; i++){
			int enumerator = 1; // ������� ������ ��������
			
			char[] arrayTest1 = new char[arrayTest[i].length()]; // ����� ������� ����� ��������� ����� ������� ��������(������) ������� arrayTest
															     // ������ ��� ��������
			System.out.print("�������������� ������: ");
			
			for(int k = 0; k < arrayTest[i].length(); k++){
				arrayTest1[k] = arrayTest[i].charAt(k);
				System.out.print(arrayTest1[k]);
			}
			
			for(int j = arrayTest[i].length()-1; j > 0; j--){	
			   // char1 = arrayTest[i].charAt(j); // ������������ ������� ������ �� ������� ������
				if(arrayTest1[j-1] != arrayTest1[j]){ // ��������� �������� ������� � ��������, ������� ��� ���� �� ��������������� �������
					//arrayTest1[j] = char1; // ���� ������ �� ����������, �� �� ���������� ��� � ������
					enumerator++; // ����������� ������������� �������� ������ ��������
				} 
				//System.out.print(arrayTest1[j]);
			}
			System.out.println();
			System.out.println("��������� ������ �������� � ������ ��� �" + i + " �����: " + enumerator);
			System.out.println();
		}
		/*if(){
			
		}*/
	}	
}