// ������� �� ����� �������������� ����� �� ��������. ����� ��������� ��������� ������������. 
// ����� ���� for

import java.util.Scanner;

class Pr_1_For
{
	public static void main(String[] args)
	{
		// ���� ������� � ����������
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ���������� ��������� \"*\": ");
		String n = in.nextLine();
		Integer n1 = Integer.valueOf(n); // �������������� � ��� Integer
		
		System.out.print("� ��� ���������� " + n + " ���������: ");
		
		for (int i =0; i < n1; i++)
		{
			System.out.print("*");
		}
	}
} 