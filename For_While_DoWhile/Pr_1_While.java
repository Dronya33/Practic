// Вывести на экран горизонтальную линию из звёздочек. Число звездочек указывает пользователь. 
// Через цикл While

import java.util.Scanner;

class Pr_1_While
{
	public static void main(String[] args)
	{
		// Ввод символа с клавиатуры
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите колличество звездочек \"*\": ");
		String n = in.nextLine();
		Integer n1 = Integer.valueOf(n); // Преобразование в тип Integer
		
		System.out.print("У вас получилось " + n + " звездочек ");
		
		int i = 0; // Переменная счетчик
		
		while (i < n1)
		{
			System.out.print("*");
			i++;
		}
	}
}