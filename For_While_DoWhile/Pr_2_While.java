// �������� ���������, ��������� �� ����� ������ ������ ����� ����� �� ��������� �� 1 �� 100.
// ����� ���� while

class Pr_2_While
{
	public static void main(String[] args)
	{
		int i = 1;
		
		while (i < 101)
		{
			if (i % 2 == 0) System.out.println(i);
			i++;
		}
	}
}