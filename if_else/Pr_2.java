/* ������� ���������, ��������� �� ����� ��������� � 10 �� ���� �����, ���������� � ���������� m � n. 
��������, ����� ����� 8,5 � 11,45 ��������� � ������ 11,45.
*/

import java.util.Scanner;

class Pr_2
{
	public static void main(String[] args)
	{
		// ���� ������� � ����������
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ������ �����: ");
		String n = in.nextLine();
		Float n1 = Float.valueOf(n); // �������������� � ������ ������
		
		System.out.println("������� ������ �����: ");
		String m = in.nextLine();
		Float m1 = Float.valueOf(m); // �������������� � ������ ������
		
		// �������� �� �������� � ����� 10
		if ((n1 > m1) && (n1 < 10) && (m1 < 10))
		{
			System.out.println(n + " ����� � 10 ��� " + m);
		}
		else if((m1 > n1) && (n1<10) && (m1 < 10))
		{
			System.out.println(m + " ����� � 10 ��� " + n);
		}
		else if ((m1 < n1) && (n1 > 10) && (m1 > 10))
		{
			System.out.println(m + " ����� � 10 ��� " + n);
		}
		else if ((n1 > m1) && (n1 > 10) && (m1 > 10))
		{
			System.out.println(m + " ����� � 10 ��� " + n);
		}	
		else if ((n1 == 10) || (m1 == 10))
		{
			System.out.println("������ �������� ����������, ��������� ���� �� ����� ��� ��� ����� ����� 10");
		}
	}
}