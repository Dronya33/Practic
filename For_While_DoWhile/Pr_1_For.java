// Вывести на экран горизонтальную линию из звёздочек. Число звездочек указывает пользователь. 
// Через цикл for

import java.util.Scanner;

class Pr_1_For
{
	public static void main(String[] args)
	{
		// Ввод символа с клавиатуры
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите количество звездочек \"*\": ");
		String n = in.nextLine();
		Integer n1 = Integer.valueOf(n); // Преобразование в тип Integer
		
		System.out.print("У вас получилось " + n + " звездочек: ");
		
		for (int i =0; i < n1; i++)
		{
			System.out.print("*");
		}
	}
} 