// Написать программу, выводящую на экран только четные целые числа из диапазона от 1 до 100.
// Через цикл for

class Pr_2_For
{
	public static void main(String[] args)
	{
		for(int i = 1; i < 101; i++)
		{
			if (i % 2 == 0) System.out.println(i);
		}
	}
}