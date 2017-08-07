/* Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n. 
Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
*/

import java.util.Scanner;

class Pr_2
{
	public static void main(String[] args)
	{
		// Ввод символа с клавиатуры
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите первое число: ");
		String n = in.nextLine();
		Float n1 = Float.valueOf(n); // Преобразование в нужный формат
		
		System.out.println("Введите первое число: ");
		String m = in.nextLine();
		Float m1 = Float.valueOf(m); // Преобразование в нужный формат
		
		// Проверка на близость к числу 10
		if ((n1 > m1) && (n1 < 10) && (m1 < 10))
		{
			System.out.println(n + " Ближе к 10 чем " + m);
		}
		else if((m1 > n1) && (n1<10) && (m1 < 10))
		{
			System.out.println(m + " Ближе к 10 чем " + n);
		}
		else if ((m1 < n1) && (n1 > 10) && (m1 > 10))
		{
			System.out.println(m + " Ближе к 10 чем " + n);
		}
		else if ((n1 > m1) && (n1 > 10) && (m1 > 10))
		{
			System.out.println(m + " Ближе к 10 чем " + n);
		}	
		else if ((n1 == 10) || (m1 == 10))
		{
			System.out.println("Нельзя провести сранвнение, поскольку одно из числе или оба числа равны 10");
		}
	}
}