// Написать программу, выводящую на экран только четные целые числа из диапазона от 1 до 100.
// Через цикл while

class Pr_2_DoWhile
{
	public static void main(String[] args)
	{
		int i = 1;
		
		do
		{
			if(i % 2 == 0) System.out.println(i);
			i++;
		}
		while(i < 101);
	}
}