// ������� �� ����� �������������� ����� �� ��������. ����� ��������� ��������� ������������. 
// ����� ���� While

import java.util.Scanner;

class Pr_1_While
{
	public static void main(String[] args)
	{
		// ���� ������� � ����������
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ����������� ��������� \"*\": ");
		String n = in.nextLine();
		Integer n1 = Integer.valueOf(n); // �������������� � ��� Integer
		
		System.out.print("� ��� ���������� " + n + " ��������� ");
		
		int i = 0; // ���������� �������
		
		while (i < n1)
		{
			System.out.print("*");
			i++;
		}
	}
}