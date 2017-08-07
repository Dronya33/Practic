// Написать программу, выводящую на экран только четные целые числа из диапазона от 1 до 100.
// Через цикл while

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