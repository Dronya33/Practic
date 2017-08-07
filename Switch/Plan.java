/*��������� ���������� �� ������. 
������������ ������ ���������� ����� ��� ������ � � ���� �� ������ ������������, 
��, ��� ������������� �� ���� ����.*/

import java.util.Scanner;

class Plan{
	
	// ���������� ������ ����� � ����������
	static int inPut(){
		Scanner in = new Scanner(System.in);
		System.out.println("������� �����: ");
		String element = in.nextLine();
		Integer element1 = 0;
		try{
			element1 = Integer.valueOf(element);
		} catch(NumberFormatException ex){
			System.out.print("�� ������ ������!");
			System.exit(0);
		}
		return element1;
	}
	
	// ���������� ������ switch
	static int metSwitch(){
		int element = inPut();
		
		switch(element){
			case 1 : System.out.println("������� � �����"); System.exit(0); break; 
			case 2 : System.out.println("������� � ����"); System.exit(0); break; 
			case 3 : System.out.println("������� � �������"); System.exit(0); break; 
			case 4 : System.out.println("������� � �������"); System.exit(0); break; 
			case 5 : System.out.println("������� � �����"); System.exit(0); break; 
			case 6 : System.out.println("���������� ������"); System.exit(0); break; 
			case 7 : System.out.println("������ ����� ������"); System.exit(0); break; 
			default : System.out.println("�� ����� ������������ �����"); System.exit(0);
		}
		return metSwitch();
	}
	
	public static void main(String[] args){
		int element = metSwitch();
		System.out.println(element);
	}
}