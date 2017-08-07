/* Через цикл
Создайте массив из 20-ти первых чисел ‘ибоначчи и выведите его на экран. 
ѕервый и второй члены последовательности равны единицам, а каждый следующий Ч сумме двух предыдущих.*/

import java.util.Scanner;

class Example7for{
	public static void main(String[] args){
		
		
		//Вывод первых двух эллементов последовательности чисел Фибоначчи
		int arrayTest[] = new int[20];
		for(int i = 0; i < 2; i++){
			arrayTest[i] = 1;
			System.out.print(arrayTest[i] + " ");
		}
		
		//Вывод остальных эллементов последовательности чисел Фибоначчи
		int fib = 1;
		for(int i = 2; i < arrayTest.length; i++){
			arrayTest[i] = fib;
			fib = arrayTest[i]+arrayTest[i-1];
			System.out.print(fib + " ");
		}
		
		System.out.println(" ");
		
		// Реализация ввода с клавиатуры
		Scanner in = new Scanner(System.in);
		System.out.println("Введите номер элемента последовательности чисел Фибоначчи: ");
		String element = in.nextLine();
		Integer element1 = 0;
		// Проверка вводимиого формата
		try{
			element1 = Integer.valueOf(element);
		} catch (NumberFormatException ex){
			System.out.println("Неверный формат!");
			System.exit(0);
		}
		
		// Вывод введеного элемента
		for(int i = arrayTest.length; i > 0; i--){
			if(element1 == i)
				System.out.print("Значение элемента: " + arrayTest[i]);
		}
		
	}	
}	