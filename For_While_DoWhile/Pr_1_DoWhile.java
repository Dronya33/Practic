// ������� �� ����� �������������� ����� �� ��������. ����� ��������� ��������� ������������. 
// ����� ���� Do While

import java.util.Scanner;

class Pr_1_DoWhile
{
	public static void main(String[] args)
	{
		// ���� ������� � ����������
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ���������� ��������� \"*\": ");
		String n = in.nextLine();
		Integer n1 = Integer.valueOf(n); // �������������� � ��� Integer
		
		System.out.print("� ��� ���������� " + n + " ���������: ");
		
		int i = 0; // ���������� ��������
		
		do
		{
			System.out.print("*");
			i++;
		}
		while (i < n1);		
	}
}