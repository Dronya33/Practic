//Реализация факториала через цикл

import java.util.Scanner;

class Example2{
	public static void main(String[] args){
		arrayFactorial(); // Вызов метода рекурсии
	}
	
	static void arrayFactorial(){
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
		//if(Integer.valueOf(element1) = String.valueOf(element1))System.out.print("Не верный тип данных."); 
		
		System.out.print(element1 + "! равен:");
		
		// Подсчет факториала
		for(int i = element1; i >= 2; i--){
			element1 *= i-1; // Перемножение всех значений
							 // от самого большого
		}
		
		System.out.print(" " + element1);
		
	}
}