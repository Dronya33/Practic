// Реализация факториала через рекурсию

import java.util.Scanner;

class Example1{
	public static void main(String[] args){
		
		// Реализация ввода с клавиатуры
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число, факториал которого надо вычислить:");
		String element = in.nextLine();
		Integer element1 = 0;
		// Проверка формата ввода
		try{
			element1 = Integer.valueOf(element);
		} catch(NumberFormatException ex){
			System.out.println("Неверный формат");
			System.exit(0);
		}
		element1 = Integer.valueOf(element);
		
		int rez = arrayFactorial(element1); // Запись результат в переменную
		System.out.print("8! равен: "+ rez); // Вывод результата
	}
	
	
	// Реализация рекурсии
	static int arrayFactorial(int element1){
		
		if(element1 == 0)return 1; // Условие которое не дает зациклиться рекурсии
		return element1 * arrayFactorial(element1 - 1); // Перемножение всех значений
														// от самого большого
	}
}