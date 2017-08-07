/*������������ ��� ������� ������� � ���� ���� ������� �� ������ �������, � ����� (A,B,C,D,E). 
���������� ������������� ���� ������������� � ���������, � ������� ���� (���������� �� �������������������). 
�� ���� ���� ������� ��� D, ��� d � ������ ��������� ���� � ��� �� case.*/

import java.util.Scanner;

class Station{
	
	// ���������� ������ �����
	static String inPut(){
		Scanner in = new Scanner(System.in);
		System.out.println("������� ��� �������: ");
		String element = in.nextLine();
		return element;
	}
	
	static String metSwitch(){
		String element = inPut();
		
		switch(element){
			case "a" : case "A" : System.out.println("�� �������� �������� 5 �����"); System.exit(0); break;
			case "b" : case "B" : System.out.println("�� �������� �������� 35 �����"); System.exit(0); break;
			case "c" : case "C" : System.out.println("�� �������� �������� 65 �����"); System.exit(0); break;
			case "d" : case "D" : System.out.println("�� �������� �������� 95 �����"); System.exit(0); break;
			case "e" : case "E" : System.out.println("�� �������� �������� 125 �����"); System.exit(0); break;
			default : System.out.println("����� ������� �� ����������"); System.exit(0); break;
		}
		return metSwitch();
	}
	
	public static void main(String[] args){
		String element = metSwitch();
		System.out.println(element);
		
	}
}