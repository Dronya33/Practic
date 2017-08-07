// Вывести на экран горизонтальную линию из звёздочек. Число звездочек указывает пользователь. 
// Через цикл Do While

import java.util.Scanner;

class Pr_1_DoWhile
{
	public static void main(String[] args)
	{
		// Ввод символа с клавиатуры
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите количество звездочек \"*\": ");
		String n = in.nextLine();
		Integer n1 = Integer.valueOf(n); // Преобразование в тип Integer
		
		System.out.print("У вас получилось " + n + " звездочек: ");
		
		int i = 0; // Переменная счестчик
		
		do
		{
			System.out.print("*");
			i++;
		}
		while (i < n1);		
	}
}